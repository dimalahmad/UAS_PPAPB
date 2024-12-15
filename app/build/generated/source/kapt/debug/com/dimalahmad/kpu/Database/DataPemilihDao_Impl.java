package com.dimalahmad.kpu.Database;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class DataPemilihDao_Impl implements DataPemilihDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<DataPemilih> __insertionAdapterOfDataPemilih;

  private final EntityDeletionOrUpdateAdapter<DataPemilih> __deletionAdapterOfDataPemilih;

  private final EntityDeletionOrUpdateAdapter<DataPemilih> __updateAdapterOfDataPemilih;

  public DataPemilihDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDataPemilih = new EntityInsertionAdapter<DataPemilih>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `dataPemilih_table` (`id`,`nama`,`NIK`,`alamat`,`jenis_kelamin`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final DataPemilih entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getNama() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getNama());
        }
        if (entity.getNik() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getNik());
        }
        if (entity.getAlamat() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getAlamat());
        }
        if (entity.getJenisKelamin() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getJenisKelamin());
        }
      }
    };
    this.__deletionAdapterOfDataPemilih = new EntityDeletionOrUpdateAdapter<DataPemilih>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `dataPemilih_table` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final DataPemilih entity) {
        statement.bindLong(1, entity.getId());
      }
    };
    this.__updateAdapterOfDataPemilih = new EntityDeletionOrUpdateAdapter<DataPemilih>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `dataPemilih_table` SET `id` = ?,`nama` = ?,`NIK` = ?,`alamat` = ?,`jenis_kelamin` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final DataPemilih entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getNama() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getNama());
        }
        if (entity.getNik() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getNik());
        }
        if (entity.getAlamat() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getAlamat());
        }
        if (entity.getJenisKelamin() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getJenisKelamin());
        }
        statement.bindLong(6, entity.getId());
      }
    };
  }

  @Override
  public void insert(final DataPemilih datapemilih) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfDataPemilih.insert(datapemilih);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final DataPemilih datapemilih) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfDataPemilih.handle(datapemilih);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final DataPemilih datapemilih) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfDataPemilih.handle(datapemilih);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<DataPemilih>> getAllDataPemilih() {
    final String _sql = "SELECT * from dataPemilih_table ORDER BY id ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[] {"dataPemilih_table"}, false, new Callable<List<DataPemilih>>() {
      @Override
      @Nullable
      public List<DataPemilih> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfNama = CursorUtil.getColumnIndexOrThrow(_cursor, "nama");
          final int _cursorIndexOfNik = CursorUtil.getColumnIndexOrThrow(_cursor, "NIK");
          final int _cursorIndexOfAlamat = CursorUtil.getColumnIndexOrThrow(_cursor, "alamat");
          final int _cursorIndexOfJenisKelamin = CursorUtil.getColumnIndexOrThrow(_cursor, "jenis_kelamin");
          final List<DataPemilih> _result = new ArrayList<DataPemilih>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final DataPemilih _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpNama;
            if (_cursor.isNull(_cursorIndexOfNama)) {
              _tmpNama = null;
            } else {
              _tmpNama = _cursor.getString(_cursorIndexOfNama);
            }
            final String _tmpNik;
            if (_cursor.isNull(_cursorIndexOfNik)) {
              _tmpNik = null;
            } else {
              _tmpNik = _cursor.getString(_cursorIndexOfNik);
            }
            final String _tmpAlamat;
            if (_cursor.isNull(_cursorIndexOfAlamat)) {
              _tmpAlamat = null;
            } else {
              _tmpAlamat = _cursor.getString(_cursorIndexOfAlamat);
            }
            final String _tmpJenisKelamin;
            if (_cursor.isNull(_cursorIndexOfJenisKelamin)) {
              _tmpJenisKelamin = null;
            } else {
              _tmpJenisKelamin = _cursor.getString(_cursorIndexOfJenisKelamin);
            }
            _item = new DataPemilih(_tmpId,_tmpNama,_tmpNik,_tmpAlamat,_tmpJenisKelamin);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
