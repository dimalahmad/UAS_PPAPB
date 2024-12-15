// ApiService.kt
package com.dimalahmad.kpu.Network

import com.dimalahmad.kpu.Database.DataPemilih
import com.dimalahmad.kpu.Database.User
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface APIService {

    // Endpoint untuk mendapatkan semua data pemilih
    @GET("dataPemilih_table")
    fun getAllPemilih(): Call<List<DataPemilih>>

    // Endpoint untuk mendapatkan detail pemilih berdasarkan ID
    @GET("dataPemilih_table/{id}")
    fun getPemilihById(@Path("id") id: Int): Call<DataPemilih>

    // Endpoint untuk menambahkan data pemilih baru
    @POST("dataPemilih_table")
    fun addPemilih(@Body dataPemilih: DataPemilih): Call<DataPemilih>

    // Endpoint untuk memperbarui data pemilih berdasarkan ID
    @PUT("dataPemilih_table/{id}")
    fun updatePemilih(@Path("id") id: Int, @Body dataPemilih: DataPemilih): Call<DataPemilih>

    // Endpoint untuk menghapus data pemilih berdasarkan ID
    @DELETE("dataPemilih_table/{id}")
    fun deletePemilih(@Path("id") id: Int): Call<DataPemilih>

    // Endpoint untuk mendapatkan semua user
    @GET("user")
    fun getAllUsers(): Call<List<User>>

    // Endpoint untuk menambahkan user baru
    @POST("user")
    fun addUser(@Body user: User): Call<User>

    // Endpoint untuk memperbarui data user berdasarkan ID
    @PUT("user/{id}")
    fun updateUser(@Path("id") id: Int, @Body user: User): Call<User>

    // Endpoint untuk mendapatkan detail user berdasarkan ID
    @GET("user/{id}")
    fun getUserById(@Path("id") id: Int): Call<User>

    // Endpoint untuk menghapus user berdasarkan ID
    @DELETE("user/{id}")
    fun deleteUser(@Path("id") id: Int): Call<User>
}
