package com.dimalahmad.kpu.Database;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\'J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\nH\'J\u0016\u0010\f\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\'J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0005H\'\u00a8\u0006\u0010"}, d2 = {"Lcom/dimalahmad/kpu/Database/DataPemilihDao;", "", "delete", "", "dataPemilih", "Lcom/dimalahmad/kpu/Database/DataPemilih;", "deleteById", "id", "", "getAllDataPemilih", "Landroidx/lifecycle/LiveData;", "", "insertAll", "dataPemilihList", "update", "datapemilih", "app_debug"})
@androidx.room.Dao()
public abstract interface DataPemilihDao {
    
    @androidx.room.Insert()
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.dimalahmad.kpu.Database.DataPemilih> dataPemilihList);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.dimalahmad.kpu.Database.DataPemilih dataPemilih);
    
    @androidx.room.Query(value = "DELETE FROM dataPemilih_table WHERE _id = :id")
    public abstract void deleteById(int id);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.dimalahmad.kpu.Database.DataPemilih datapemilih);
    
    @androidx.room.Query(value = "SELECT * FROM dataPemilih_table")
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.dimalahmad.kpu.Database.DataPemilih>> getAllDataPemilih();
}