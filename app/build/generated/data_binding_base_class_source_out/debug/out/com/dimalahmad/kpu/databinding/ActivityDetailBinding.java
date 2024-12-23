// Generated by view binder compiler. Do not edit!
package com.dimalahmad.kpu.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
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

public final class ActivityDetailBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final AppCompatButton btnBack;

  @NonNull
  public final TextView tvAlamat;

  @NonNull
  public final TextView tvGender;

  @NonNull
  public final TextView tvNamaPemilih;

  @NonNull
  public final TextView tvNik;

  @NonNull
  public final TextView tvTitle;

  private ActivityDetailBinding(@NonNull LinearLayout rootView, @NonNull AppCompatButton btnBack,
      @NonNull TextView tvAlamat, @NonNull TextView tvGender, @NonNull TextView tvNamaPemilih,
      @NonNull TextView tvNik, @NonNull TextView tvTitle) {
    this.rootView = rootView;
    this.btnBack = btnBack;
    this.tvAlamat = tvAlamat;
    this.tvGender = tvGender;
    this.tvNamaPemilih = tvNamaPemilih;
    this.tvNik = tvNik;
    this.tvTitle = tvTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_back;
      AppCompatButton btnBack = ViewBindings.findChildViewById(rootView, id);
      if (btnBack == null) {
        break missingId;
      }

      id = R.id.tv_alamat;
      TextView tvAlamat = ViewBindings.findChildViewById(rootView, id);
      if (tvAlamat == null) {
        break missingId;
      }

      id = R.id.tv_gender;
      TextView tvGender = ViewBindings.findChildViewById(rootView, id);
      if (tvGender == null) {
        break missingId;
      }

      id = R.id.tv_nama_pemilih;
      TextView tvNamaPemilih = ViewBindings.findChildViewById(rootView, id);
      if (tvNamaPemilih == null) {
        break missingId;
      }

      id = R.id.tv_nik;
      TextView tvNik = ViewBindings.findChildViewById(rootView, id);
      if (tvNik == null) {
        break missingId;
      }

      id = R.id.tv_title;
      TextView tvTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvTitle == null) {
        break missingId;
      }

      return new ActivityDetailBinding((LinearLayout) rootView, btnBack, tvAlamat, tvGender,
          tvNamaPemilih, tvNik, tvTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
