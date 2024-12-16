package com.dimalahmad.kpu.Database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface DataPemilihDao {

    @Insert
    fun insertAll(dataPemilihList: List<DataPemilih>)

    @Delete
    fun delete(dataPemilih: DataPemilih)

    @Query("DELETE FROM dataPemilih_table WHERE _id = :id")
    fun deleteById(id: Int)

    @Update
    fun update(datapemilih: DataPemilih)

    @Query("SELECT * FROM dataPemilih_table")
    fun getAllDataPemilih(): LiveData<List<DataPemilih>>  // Mendapatkan semua data pemilih
}
