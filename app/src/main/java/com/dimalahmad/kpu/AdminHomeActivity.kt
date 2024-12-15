package com.dimalahmad.kpu

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.dimalahmad.kpu.API.APIClient
import com.dimalahmad.kpu.Database.DataPemilih
import com.dimalahmad.kpu.Network.APIService
import com.dimalahmad.kpu.Login.LoginActivity
import com.dimalahmad.kpu.PrefManager.PrefManager
import com.dimalahmad.kpu.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

class AdminHomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var prefManager: PrefManager
    private lateinit var executorService: ExecutorService
    private lateinit var adapter: DataPemilihAdapter

    // APIClient instance untuk APIService
    private val apiService: APIService = APIClient.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        prefManager = PrefManager.getInstance(this)

        checkLoginStatus()

        executorService = Executors.newSingleThreadExecutor()

        setupRecyclerView()

        with(binding) {
            btnTambah.setOnClickListener {
                startActivity(Intent(this@AdminHomeActivity, CreateActivity::class.java))
            }

            btnLogout.setOnClickListener {
                prefManager.setLoggedIn(false)
                navigateToLoginActivity()
            }
        }
    }

    private fun setupRecyclerView() {
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = DataPemilihAdapter(this) { data -> deleteData(data) }
        binding.recyclerView.adapter = adapter

        // Mengambil data pemilih melalui API dan memperbarui UI
        apiService.getAllPemilih().enqueue(object : Callback<List<DataPemilih>> {
            override fun onResponse(
                call: Call<List<DataPemilih>>,
                response: Response<List<DataPemilih>>
            ) {
                if (response.isSuccessful) {
                    val dataList = response.body() ?: emptyList()
                    adapter.submitList(dataList)
                } else {
                    Toast.makeText(this@AdminHomeActivity, "Failed to load data", Toast.LENGTH_SHORT).show()
                }
            }

            override fun onFailure(call: Call<List<DataPemilih>>, t: Throwable) {
                Toast.makeText(this@AdminHomeActivity, "Error: ${t.message}", Toast.LENGTH_SHORT).show()
            }
        })
    }

    private fun deleteData(dataPemilih: DataPemilih) {
        executorService.execute {
            apiService.deletePemilih(dataPemilih.id).enqueue(object : Callback<DataPemilih> {
                override fun onResponse(call: Call<DataPemilih>, response: Response<DataPemilih>) {
                    if (response.isSuccessful) {
                        runOnUiThread {
                            Toast.makeText(this@AdminHomeActivity, "Data berhasil dihapus", Toast.LENGTH_SHORT).show()
                        }
                    }
                }

                override fun onFailure(call: Call<DataPemilih>, t: Throwable) {
                    runOnUiThread {
                        Toast.makeText(this@AdminHomeActivity, "Gagal menghapus data", Toast.LENGTH_SHORT).show()
                    }
                }
            })
        }
    }

    private fun checkLoginStatus() {
        val isLoggedIn = prefManager.isLoggedIn()
        if (!isLoggedIn) {
            navigateToLoginActivity()
        }
    }

    private fun navigateToLoginActivity() {
        val intent = Intent(this@AdminHomeActivity, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }
}
