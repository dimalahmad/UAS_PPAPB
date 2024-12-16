package com.dimalahmad.kpu;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/dimalahmad/kpu/EditActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "apiService", "Lcom/dimalahmad/kpu/Network/APIService;", "binding", "Lcom/dimalahmad/kpu/databinding/ActivityEditBinding;", "dataPemilihDao", "Lcom/dimalahmad/kpu/Database/DataPemilihDao;", "executorService", "Ljava/util/concurrent/ExecutorService;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "updateDataLocally", "dataPemilih", "Lcom/dimalahmad/kpu/Database/DataPemilih;", "updateDataToAPI", "app_debug"})
public final class EditActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.dimalahmad.kpu.databinding.ActivityEditBinding binding;
    private com.dimalahmad.kpu.Database.DataPemilihDao dataPemilihDao;
    private java.util.concurrent.ExecutorService executorService;
    @org.jetbrains.annotations.NotNull()
    private final com.dimalahmad.kpu.Network.APIService apiService = null;
    
    public EditActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void updateDataLocally(com.dimalahmad.kpu.Database.DataPemilih dataPemilih) {
    }
    
    private final void updateDataToAPI(com.dimalahmad.kpu.Database.DataPemilih dataPemilih) {
    }
}