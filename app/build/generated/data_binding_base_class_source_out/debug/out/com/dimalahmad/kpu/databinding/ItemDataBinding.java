// Generated by view binder compiler. Do not edit!
package com.dimalahmad.kpu.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dimalahmad.kpu.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemDataBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView delete;

  @NonNull
  public final TextView nama;

  @NonNull
  public final TextView nomer;

  @NonNull
  public final ImageView viewDetail;

  private ItemDataBinding(@NonNull LinearLayout rootView, @NonNull ImageView delete,
      @NonNull TextView nama, @NonNull TextView nomer, @NonNull ImageView viewDetail) {
    this.rootView = rootView;
    this.delete = delete;
    this.nama = nama;
    this.nomer = nomer;
    this.viewDetail = viewDetail;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemDataBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemDataBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_data, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemDataBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.delete;
      ImageView delete = ViewBindings.findChildViewById(rootView, id);
      if (delete == null) {
        break missingId;
      }

      id = R.id.nama;
      TextView nama = ViewBindings.findChildViewById(rootView, id);
      if (nama == null) {
        break missingId;
      }

      id = R.id.nomer;
      TextView nomer = ViewBindings.findChildViewById(rootView, id);
      if (nomer == null) {
        break missingId;
      }

      id = R.id.viewDetail;
      ImageView viewDetail = ViewBindings.findChildViewById(rootView, id);
      if (viewDetail == null) {
        break missingId;
      }

      return new ItemDataBinding((LinearLayout) rootView, delete, nama, nomer, viewDetail);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
