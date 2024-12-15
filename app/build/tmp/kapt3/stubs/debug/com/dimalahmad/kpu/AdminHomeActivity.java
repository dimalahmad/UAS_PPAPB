package com.dimalahmad.kpu;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u000eH\u0002J\u0012\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/dimalahmad/kpu/AdminHomeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lcom/dimalahmad/kpu/DataPemilihAdapter;", "apiService", "Lcom/dimalahmad/kpu/Network/APIService;", "binding", "Lcom/dimalahmad/kpu/databinding/ActivityMainBinding;", "executorService", "Ljava/util/concurrent/ExecutorService;", "prefManager", "Lcom/dimalahmad/kpu/PrefManager/PrefManager;", "checkLoginStatus", "", "deleteData", "dataPemilih", "Lcom/dimalahmad/kpu/Database/DataPemilih;", "navigateToLoginActivity", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setupRecyclerView", "app_debug"})
public final class AdminHomeActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.dimalahmad.kpu.databinding.ActivityMainBinding binding;
    private com.dimalahmad.kpu.PrefManager.PrefManager prefManager;
    private java.util.concurrent.ExecutorService executorService;
    private com.dimalahmad.kpu.DataPemilihAdapter adapter;
    @org.jetbrains.annotations.NotNull()
    private final com.dimalahmad.kpu.Network.APIService apiService = null;
    
    public AdminHomeActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupRecyclerView() {
    }
    
    private final void deleteData(com.dimalahmad.kpu.Database.DataPemilih dataPemilih) {
    }
    
    private final void checkLoginStatus() {
    }
    
    private final void navigateToLoginActivity() {
    }
}