package com.dimalahmad.kpu;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\u0012\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/dimalahmad/kpu/UserHomeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lcom/dimalahmad/kpu/DataPemilihAdapter;", "binding", "Lcom/dimalahmad/kpu/databinding/ActivityUserHomeBinding;", "dataPemilihDao", "Lcom/dimalahmad/kpu/Database/DataPemilihDao;", "executorService", "Ljava/util/concurrent/ExecutorService;", "prefManager", "Lcom/dimalahmad/kpu/PrefManager/PrefManager;", "checkLoginStatus", "", "navigateToLoginActivity", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setupRecyclerView", "app_debug"})
public final class UserHomeActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.dimalahmad.kpu.databinding.ActivityUserHomeBinding binding;
    private com.dimalahmad.kpu.PrefManager.PrefManager prefManager;
    private com.dimalahmad.kpu.Database.DataPemilihDao dataPemilihDao;
    private java.util.concurrent.ExecutorService executorService;
    private com.dimalahmad.kpu.DataPemilihAdapter adapter;
    
    public UserHomeActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupRecyclerView() {
    }
    
    private final void checkLoginStatus() {
    }
    
    private final void navigateToLoginActivity() {
    }
}