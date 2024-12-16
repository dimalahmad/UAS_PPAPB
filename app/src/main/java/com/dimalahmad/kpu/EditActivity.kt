package com.dimalahmad.kpu

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.dimalahmad.kpu.API.APIClient
import com.dimalahmad.kpu.Database.DataPemilih
import com.dimalahmad.kpu.Database.DataPemilihDao
import com.dimalahmad.kpu.Database.DataPemilihDatabase
import com.dimalahmad.kpu.databinding.ActivityEditBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

class EditActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEditBinding
    private lateinit var dataPemilihDao: DataPemilihDao
    private lateinit var executorService: ExecutorService
    private val apiService = APIClient.getInstance() // Inisialisasi APIService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val db = DataPemilihDatabase.getDatabase(this)
        dataPemilihDao = db!!.dataPemilihDao()
        executorService = Executors.newSingleThreadExecutor()

        // Mengambil data dari Intent dan pastikan ID dikonversi menjadi String
        val id = intent.getIntExtra("id", -1).toString() // Convert the ID to String
        val nama = intent.getStringExtra("nama")
        val nik = intent.getStringExtra("nik")
        val jenisKelamin = intent.getStringExtra("jenis_kelamin")
        val alamat = intent.getStringExtra("alamat")

        with(binding) {
            etNamaPemilih.setText(nama)
            etNik.setText(nik)
            if (jenisKelamin == "Laki-laki") rgGender.check(rbMale.id) else rgGender.check(rbFemale.id)
            etAlamat.setText(alamat)

            btnSimpan.setOnClickListener {
                val updatedGender = if (rgGender.checkedRadioButtonId == rbMale.id) "Laki-laki" else "Perempuan"

                // Membuat objek DataPemilih yang baru dengan data yang sudah diperbarui
                val updatedData = DataPemilih(
                    id = id, // Menggunakan ID yang sudah ada (sekarang dalam format String)
                    nama = etNamaPemilih.text.toString(),
                    nik = etNik.text.toString(),
                    jenisKelamin = updatedGender,
                    alamat = etAlamat.text.toString()
                )

                // Memperbarui data secara lokal di Room
                updateDataLocally(updatedData)

                // Memperbarui data di API
                updateDataToAPI(updatedData)
            }
        }
    }

    private fun updateDataLocally(dataPemilih: DataPemilih) {
        executorService.execute {
            // Melakukan update data di Room secara background
            dataPemilihDao.update(dataPemilih)
            runOnUiThread {
                Toast.makeText(this, "Data lokal berhasil diperbarui", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun updateDataToAPI(dataPemilih: DataPemilih) {
        val apiService = APIClient.getInstance()
        val call = apiService.addPemilih(dataPemilih) // Menggunakan POST untuk mengirim data, bisa digunakan untuk update jika API di backend mendukung

        call.enqueue(object : retrofit2.Callback<DataPemilih> {
            override fun onResponse(call: Call<DataPemilih>, response: Response<DataPemilih>) {
                if (response.isSuccessful) {
                    runOnUiThread {
                        Toast.makeText(this@EditActivity, "Data berhasil diperbarui di server", Toast.LENGTH_SHORT).show()
                        finish() // Menutup aktivitas setelah data berhasil diperbarui di server
                    }
                } else {
                    runOnUiThread {
                        Toast.makeText(this@EditActivity, "Gagal memperbarui data di server", Toast.LENGTH_SHORT).show()
                    }
                }
            }

            override fun onFailure(call: Call<DataPemilih>, t: Throwable) {
                runOnUiThread {
                    Toast.makeText(this@EditActivity, "Terjadi kesalahan: ${t.message}", Toast.LENGTH_SHORT).show()
                }
            }
        })
    }
}
