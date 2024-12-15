// Generated by view binder compiler. Do not edit!
package com.dimalahmad.kpu.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dimalahmad.kpu.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCreateBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final AppCompatButton btnSimpan;

  @NonNull
  public final EditText etAlamat;

  @NonNull
  public final EditText etNamaPemilih;

  @NonNull
  public final EditText etNik;

  @NonNull
  public final RadioButton rbFemale;

  @NonNull
  public final RadioButton rbMale;

  @NonNull
  public final RadioGroup rgGender;

  @NonNull
  public final TextView tvTitle;

  private ActivityCreateBinding(@NonNull LinearLayout rootView, @NonNull AppCompatButton btnSimpan,
      @NonNull EditText etAlamat, @NonNull EditText etNamaPemilih, @NonNull EditText etNik,
      @NonNull RadioButton rbFemale, @NonNull RadioButton rbMale, @NonNull RadioGroup rgGender,
      @NonNull TextView tvTitle) {
    this.rootView = rootView;
    this.btnSimpan = btnSimpan;
    this.etAlamat = etAlamat;
    this.etNamaPemilih = etNamaPemilih;
    this.etNik = etNik;
    this.rbFemale = rbFemale;
    this.rbMale = rbMale;
    this.rgGender = rgGender;
    this.tvTitle = tvTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCreateBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCreateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_create, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCreateBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_simpan;
      AppCompatButton btnSimpan = ViewBindings.findChildViewById(rootView, id);
      if (btnSimpan == null) {
        break missingId;
      }

      id = R.id.et_alamat;
      EditText etAlamat = ViewBindings.findChildViewById(rootView, id);
      if (etAlamat == null) {
        break missingId;
      }

      id = R.id.et_nama_pemilih;
      EditText etNamaPemilih = ViewBindings.findChildViewById(rootView, id);
      if (etNamaPemilih == null) {
        break missingId;
      }

      id = R.id.et_nik;
      EditText etNik = ViewBindings.findChildViewById(rootView, id);
      if (etNik == null) {
        break missingId;
      }

      id = R.id.rb_female;
      RadioButton rbFemale = ViewBindings.findChildViewById(rootView, id);
      if (rbFemale == null) {
        break missingId;
      }

      id = R.id.rb_male;
      RadioButton rbMale = ViewBindings.findChildViewById(rootView, id);
      if (rbMale == null) {
        break missingId;
      }

      id = R.id.rg_gender;
      RadioGroup rgGender = ViewBindings.findChildViewById(rootView, id);
      if (rgGender == null) {
        break missingId;
      }

      id = R.id.tv_title;
      TextView tvTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvTitle == null) {
        break missingId;
      }

      return new ActivityCreateBinding((LinearLayout) rootView, btnSimpan, etAlamat, etNamaPemilih,
          etNik, rbFemale, rbMale, rgGender, tvTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}