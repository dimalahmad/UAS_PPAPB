
package com.dimalahmad.kpu.Login

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.dimalahmad.kpu.API.APIClient
import com.dimalahmad.kpu.Database.User
import com.dimalahmad.kpu.PrefManager.PrefManager
import com.dimalahmad.kpu.databinding.ActivityRegisterBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding
    private lateinit var prefManager: PrefManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        prefManager = PrefManager.getInstance(this)

        binding.btnRegister.setOnClickListener {
            val username = binding.edtUsername.text.toString()
            val password = binding.edtPassword.text.toString()
            val confirmPassword = binding.Confirmpassword.text.toString()

            if (username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                Toast.makeText(this, "Mohon isi semua data", Toast.LENGTH_SHORT).show()
            } else if (password != confirmPassword) {
                Toast.makeText(this, "Password tidak sama", Toast.LENGTH_SHORT).show()
            } else {
                // Simpan data lokal ke database Room
                saveUserToLocalDatabase(username, password)

                // Kirim data ke API
                sendUserToAPI(username, password)
            }
        }
    }

    private fun saveUserToLocalDatabase(username: String, password: String) {
        val userDao = com.dimalahmad.kpu.Database.AppDatabase.getDatabase(this).userDao()

        CoroutineScope(Dispatchers.IO).launch {
            val existingUser = userDao.getUserByUsername(username)
            if (existingUser != null) {
                runOnUiThread {
                    Toast.makeText(this@RegisterActivity, "Username sudah terdaftar di lokal", Toast.LENGTH_SHORT).show()
                }
            } else {
                userDao.insertUser(User(username = username, password = password))
                runOnUiThread {
                    Toast.makeText(this@RegisterActivity, "Data lokal berhasil disimpan", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    private fun sendUserToAPI(username: String, password: String) {
        val apiService = APIClient.getInstance()
        val user = User(username = username, password = password)

        apiService.addUser(user).enqueue(object : Callback<User> {
            override fun onResponse(call: Call<User>, response: Response<User>) {
                if (response.isSuccessful) {
                    Toast.makeText(this@RegisterActivity, "Registrasi berhasil ke API", Toast.LENGTH_SHORT).show()
                    finish() // Menutup aktivitas registrasi
                } else {
                    Toast.makeText(this@RegisterActivity, "Gagal registrasi ke API: ${response.message()}", Toast.LENGTH_SHORT).show()
                }
            }

            override fun onFailure(call: Call<User>, t: Throwable) {
                Toast.makeText(this@RegisterActivity, "Error API: ${t.message}", Toast.LENGTH_SHORT).show()
            }
        })
    }
}

