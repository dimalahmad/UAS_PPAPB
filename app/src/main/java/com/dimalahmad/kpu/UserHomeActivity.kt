package com.dimalahmad.kpu

import UserDataPemilihAdapter
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.dimalahmad.kpu.API.APIClient
import com.dimalahmad.kpu.Database.DataPemilih
import com.dimalahmad.kpu.Login.LoginActivity
import com.dimalahmad.kpu.PrefManager.PrefManager
import com.dimalahmad.kpu.databinding.ActivityUserHomeBinding
import com.dimalahmad.kpu.Network.APIService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class UserHomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUserHomeBinding
    private lateinit var prefManager: PrefManager
    private lateinit var adapter: UserDataPemilihAdapter

    // APIService instance
    private val apiService: APIService = APIClient.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        prefManager = PrefManager.getInstance(this)

        // Check login status
        checkLoginStatus()

        // Set up RecyclerView
        setupRecyclerView()

        // Set up button listeners
        with(binding) {
            btnLogout.setOnClickListener {
                prefManager.setLoggedIn(false)
                navigateToLoginActivity()
            }
        }
    }

    private fun setupRecyclerView() {
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = UserDataPemilihAdapter(this) { data ->  }
        binding.recyclerView.adapter = adapter

        // Fetch data from API and update UI
        apiService.getAllPemilih().enqueue(object : Callback<List<DataPemilih>> {
            override fun onResponse(
                call: Call<List<DataPemilih>>,
                response: Response<List<DataPemilih>>
            ) {
                if (response.isSuccessful) {
                    val dataList = response.body() ?: emptyList()
                    adapter.submitList(dataList)
                } else {
                    Toast.makeText(this@UserHomeActivity, "Failed to load data", Toast.LENGTH_SHORT).show()
                }
            }

            override fun onFailure(call: Call<List<DataPemilih>>, t: Throwable) {
                Toast.makeText(this@UserHomeActivity, "Error: ${t.message}", Toast.LENGTH_SHORT).show()
            }
        })
    }

    private fun checkLoginStatus() {
        val isLoggedIn = prefManager.isLoggedIn()
        if (!isLoggedIn) {
            navigateToLoginActivity()
        }
    }

    private fun navigateToLoginActivity() {
        val intent = Intent(this@UserHomeActivity, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }
}
