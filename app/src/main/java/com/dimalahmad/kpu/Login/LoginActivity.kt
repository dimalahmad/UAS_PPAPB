package com.dimalahmad.kpu.Login

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.dimalahmad.kpu.API.APIClient
import com.dimalahmad.kpu.AdminHomeActivity
import com.dimalahmad.kpu.Database.User
import com.dimalahmad.kpu.PrefManager.PrefManager
import com.dimalahmad.kpu.UserHomeActivity
import com.dimalahmad.kpu.databinding.ActivityLoginBinding
import com.dimalahmad.kpuz.MainActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private lateinit var prefManager: PrefManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val client = APIClient.getInstance()
        prefManager = PrefManager.getInstance(this)

        binding.btnLogin.setOnClickListener {
            val username = binding.edtUsername.text.toString()
            val password = binding.edtPassword.text.toString()

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Mohon isi semua data", Toast.LENGTH_SHORT).show()
            } else {
                binding.progressBar.visibility = View.VISIBLE
                binding.btnLogin.isEnabled = false

                val response = client.getAllUsers()
                response.enqueue(object : Callback<List<User>> {
                    override fun onResponse(call: Call<List<User>>, response: Response<List<User>>) {
                        binding.progressBar.visibility = View.GONE
                        binding.btnLogin.isEnabled = true

                        if (response.isSuccessful && response.body() != null) {
                            val user = response.body()?.find {
                                it.username == username && it.password == password
                            }
                            if (user != null) {
                                prefManager.setLoggedIn(true)
                                prefManager.saveUsername(username)

                                when (user.status) {
                                    "admin" -> {
                                        Toast.makeText(this@LoginActivity, "Login berhasil sebagai Admin", Toast.LENGTH_SHORT).show()
                                        startActivity(Intent(this@LoginActivity, AdminHomeActivity::class.java))
                                    }
                                    "user" -> {
                                        Toast.makeText(this@LoginActivity, "Login berhasil sebagai User", Toast.LENGTH_SHORT).show()
                                        startActivity(Intent(this@LoginActivity, UserHomeActivity::class.java))
                                    }
                                    else -> {
                                        Toast.makeText(this@LoginActivity, "Status tidak dikenal", Toast.LENGTH_SHORT).show()
                                    }
                                }
                                finish()
                            } else {
                                Toast.makeText(this@LoginActivity, "Username atau password salah", Toast.LENGTH_SHORT).show()
                            }
                        } else {
                            Log.e("API Error", "Response not successful or body is null")
                            Toast.makeText(this@LoginActivity, "Terjadi kesalahan, coba lagi nanti", Toast.LENGTH_SHORT).show()
                        }
                    }

                    override fun onFailure(call: Call<List<User>>, t: Throwable) {
                        binding.progressBar.visibility = View.GONE
                        binding.btnLogin.isEnabled = true
                        Toast.makeText(this@LoginActivity, "Koneksi error: ${t.message}", Toast.LENGTH_LONG).show()
                    }
                })
            }
        }

        binding.txtRegister.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}
