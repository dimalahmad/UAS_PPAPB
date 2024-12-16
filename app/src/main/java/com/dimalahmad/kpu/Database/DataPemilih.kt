package com.dimalahmad.kpu.Database

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "dataPemilih_table")
data class DataPemilih (

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "_id")  // Mapkan _id dari API ke id di model
    val id: String = "", // ID yang berasal dari API, dengan default value kosong (bisa diisi nanti)

    @ColumnInfo(name = "nama")
    val nama: String,

    @ColumnInfo(name = "nik")
    val nik: String,

    @ColumnInfo(name = "alamat")
    val alamat: String,

    @ColumnInfo(name = "jenis_kelamin")
    val jenisKelamin: String
)
