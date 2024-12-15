package com.dimalahmad.kpu

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.dimalahmad.kpu.API.APIClient
import com.dimalahmad.kpu.Database.DataPemilih
import com.dimalahmad.kpu.Network.APIService
import com.dimalahmad.kpu.databinding.ActivityCreateBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CreateActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCreateBinding
    private lateinit var apiService: APIService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Menginisialisasi APIClient untuk mendapatkan instance APIService
        apiService = APIClient.getInstance()

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

                // Jika data valid, kirim data ke API
                val dataPemilih = DataPemilih(
                    nama = etNamaPemilih.text.toString(),
                    nik = etNik.text.toString(),
                    jenisKelamin = gender,
                    alamat = etAlamat.text.toString()
                )

                saveDataToAPI(dataPemilih)
            }
        }
    }

    // Fungsi untuk menyimpan data pemilih ke API
    private fun saveDataToAPI(dataPemilih: DataPemilih) {
        apiService.addPemilih(dataPemilih).enqueue(object : Callback<DataPemilih> {
            override fun onResponse(call: Call<DataPemilih>, response: Response<DataPemilih>) {
                if (response.isSuccessful) {
                    // Data berhasil disimpan, beri pesan berhasil dan kembali ke MainActivity
                    showToast("Data berhasil disimpan!")
                    setEmptyField()

                    val startActivity = Intent(this@CreateActivity, AdminHomeActivity::class.java)
                    startActivity(startActivity)
                    finish()
                } else {
                    // Menampilkan pesan jika gagal menyimpan data
                    showToast("Gagal menyimpan data.")
                }
            }

            override fun onFailure(call: Call<DataPemilih>, t: Throwable) {
                // Menampilkan pesan error jika terjadi kegagalan pada request
                showToast("Error: ${t.message}")
            }
        })
    }

    // Fungsi untuk menampilkan Toast message
    private fun showToast(message: String) {
        runOnUiThread {
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }
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
