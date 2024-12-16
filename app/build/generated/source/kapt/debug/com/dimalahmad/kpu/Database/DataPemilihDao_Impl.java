package com.dimalahmad.kpu.Database;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
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

  private final SharedSQLiteStatement __preparedStmtOfDeleteById;

  public DataPemilihDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDataPemilih = new EntityInsertionAdapter<DataPemilih>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `dataPemilih_table` (`_id`,`nama`,`nik`,`alamat`,`jenis_kelamin`) VALUES (?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final DataPemilih entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getId());
        }
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
        return "DELETE FROM `dataPemilih_table` WHERE `_id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final DataPemilih entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getId());
        }
      }
    };
    this.__updateAdapterOfDataPemilih = new EntityDeletionOrUpdateAdapter<DataPemilih>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `dataPemilih_table` SET `_id` = ?,`nama` = ?,`nik` = ?,`alamat` = ?,`jenis_kelamin` = ? WHERE `_id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final DataPemilih entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getId());
        }
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
        if (entity.getId() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getId());
        }
      }
    };
    this.__preparedStmtOfDeleteById = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM dataPemilih_table WHERE _id = ?";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(final List<DataPemilih> dataPemilihList) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfDataPemilih.insert(dataPemilihList);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final DataPemilih dataPemilih) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfDataPemilih.handle(dataPemilih);
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
  public void deleteById(final int id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteById.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, id);
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfDeleteById.release(_stmt);
    }
  }

  @Override
  public LiveData<List<DataPemilih>> getAllDataPemilih() {
    final String _sql = "SELECT * FROM dataPemilih_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[] {"dataPemilih_table"}, false, new Callable<List<DataPemilih>>() {
      @Override
      @Nullable
      public List<DataPemilih> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
          final int _cursorIndexOfNama = CursorUtil.getColumnIndexOrThrow(_cursor, "nama");
          final int _cursorIndexOfNik = CursorUtil.getColumnIndexOrThrow(_cursor, "nik");
          final int _cursorIndexOfAlamat = CursorUtil.getColumnIndexOrThrow(_cursor, "alamat");
          final int _cursorIndexOfJenisKelamin = CursorUtil.getColumnIndexOrThrow(_cursor, "jenis_kelamin");
          final List<DataPemilih> _result = new ArrayList<DataPemilih>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final DataPemilih _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
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
