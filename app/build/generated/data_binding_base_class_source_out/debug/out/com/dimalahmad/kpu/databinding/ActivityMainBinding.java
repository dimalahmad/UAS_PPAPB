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
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dimalahmad.kpu.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView Text1;

  @NonNull
  public final AppCompatButton btnLogout;

  @NonNull
  public final AppCompatButton btnTambah;

  @NonNull
  public final RecyclerView recyclerView;

  private ActivityMainBinding(@NonNull LinearLayout rootView, @NonNull TextView Text1,
      @NonNull AppCompatButton btnLogout, @NonNull AppCompatButton btnTambah,
      @NonNull RecyclerView recyclerView) {
    this.rootView = rootView;
    this.Text1 = Text1;
    this.btnLogout = btnLogout;
    this.btnTambah = btnTambah;
    this.recyclerView = recyclerView;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Text1;
      TextView Text1 = ViewBindings.findChildViewById(rootView, id);
      if (Text1 == null) {
        break missingId;
      }

      id = R.id.btn_logout;
      AppCompatButton btnLogout = ViewBindings.findChildViewById(rootView, id);
      if (btnLogout == null) {
        break missingId;
      }

      id = R.id.btn_tambah;
      AppCompatButton btnTambah = ViewBindings.findChildViewById(rootView, id);
      if (btnTambah == null) {
        break missingId;
      }

      id = R.id.recyclerView;
      RecyclerView recyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView == null) {
        break missingId;
      }

      return new ActivityMainBinding((LinearLayout) rootView, Text1, btnLogout, btnTambah,
          recyclerView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}