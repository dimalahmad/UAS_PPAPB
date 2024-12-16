package com.dimalahmad.kpu

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.dimalahmad.kpu.API.APIClient
import com.dimalahmad.kpu.Database.DataPemilih
import com.dimalahmad.kpu.databinding.ActivityCreateBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CreateActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCreateBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Menangani klik pada tombol Simpan
        with(binding) {
            btnSimpan.setOnClickListener {
                // Mengambil id radio button yang dipilih
                val selectedGenderId = binding.rgGender.checkedRadioButtonId
                val gender = when (selectedGenderId) {
                    binding.rbMale.id -> "Laki-laki"  // Jika laki-laki dipilih
                    binding.rbFemale.id -> "Perempuan"  // Jika perempuan dipilih
                    else -> "Tidak ada yang dipilih"  // Jika tidak ada yang dipilih
                }

                // Validasi input
                if (etNamaPemilih.text.isNullOrBlank() ||
                    etNik.text.isNullOrBlank() ||
                    gender == "Tidak ada yang dipilih" ||
                    etAlamat.text.isNullOrBlank()
                ) {
                    // Menampilkan pesan jika data tidak lengkap
                    showToast("Semua data harus diisi dengan benar!")
                    return@setOnClickListener
                }

                // Membuat objek DataPemilih dari input user
                val dataPemilih = DataPemilih(
                    nama = etNamaPemilih.text.toString(),
                    nik = etNik.text.toString(),
                    jenisKelamin = gender,
                    alamat = etAlamat.text.toString(),
                )

                // Memanggil fungsi untuk menambahkan data ke API
                addDataToApi(dataPemilih)
            }
        }
    }

    // Fungsi untuk menambahkan data ke API
    private fun addDataToApi(dataPemilih: DataPemilih) {
        val apiService = APIClient.getInstance()
        apiService.addPemilih(dataPemilih).enqueue(object : Callback<DataPemilih> {
            override fun onResponse(call: Call<DataPemilih>, response: Response<DataPemilih>) {
                if (response.isSuccessful) {
                    // Menampilkan pesan berhasil
                    showToast("Data berhasil disimpan ke server!")
                    setEmptyField()

                    // Kembali ke AdminHomeActivity
                    val intent = Intent(this@CreateActivity, AdminHomeActivity::class.java)
                    startActivity(intent)
                    finish()
                } else {
                    showToast("Gagal menyimpan data: ${response.message()}")
                }
            }

            override fun onFailure(call: Call<DataPemilih>, t: Throwable) {
                // Menampilkan pesan gagal
                showToast("Gagal menyimpan data: ${t.message}")
            }
        })
    }

    // Fungsi untuk menampilkan Toast message
    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    // Fungsi untuk membersihkan field setelah data disimpan
    private fun setEmptyField() {
        with(binding) {
            etNamaPemilih.text?.clear()
            etNik.text?.clear()
            rgGender.clearCheck()
            etAlamat.text?.clear()
        }
    }
}
