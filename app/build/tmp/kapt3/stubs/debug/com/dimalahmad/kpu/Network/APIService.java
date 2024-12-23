package com.dimalahmad.kpu.Network;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\'J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\b\b\u0001\u0010\b\u001a\u00020\u0007H\'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\n\u001a\u00020\u000bH\'J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r0\u0003H\'J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u0003H\'J\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\n\u001a\u00020\u0010H\'J\"\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\n\u001a\u00020\u00102\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\'\u00a8\u0006\u0012"}, d2 = {"Lcom/dimalahmad/kpu/Network/APIService;", "", "addPemilih", "Lretrofit2/Call;", "Lcom/dimalahmad/kpu/Database/DataPemilih;", "dataPemilih", "addUser", "Lcom/dimalahmad/kpu/Database/User;", "user", "deletePemilih", "id", "", "getAllPemilih", "", "getAllUsers", "getPemilihById", "", "updatePemilih", "app_debug"})
public abstract interface APIService {
    
    @retrofit2.http.GET(value = "dataPemilih_table")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<java.util.List<com.dimalahmad.kpu.Database.DataPemilih>> getAllPemilih();
    
    @retrofit2.http.GET(value = "dataPemilih_table/{id}")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<com.dimalahmad.kpu.Database.DataPemilih> getPemilihById(@retrofit2.http.Path(value = "id")
    int id);
    
    @retrofit2.http.POST(value = "dataPemilih_table")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<com.dimalahmad.kpu.Database.DataPemilih> addPemilih(@retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.dimalahmad.kpu.Database.DataPemilih dataPemilih);
    
    @retrofit2.http.POST(value = "dataPemilih_table/{id}")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<com.dimalahmad.kpu.Database.DataPemilih> updatePemilih(@retrofit2.http.Path(value = "id")
    int id, @retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.dimalahmad.kpu.Database.DataPemilih dataPemilih);
    
    @retrofit2.http.DELETE(value = "dataPemilih_table/{id}")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<com.dimalahmad.kpu.Database.DataPemilih> deletePemilih(@retrofit2.http.Path(value = "id")
    @org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @retrofit2.http.GET(value = "user")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<java.util.List<com.dimalahmad.kpu.Database.User>> getAllUsers();
    
    @retrofit2.http.POST(value = "user")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<com.dimalahmad.kpu.Database.User> addUser(@retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.dimalahmad.kpu.Database.User user);
}