// Generated by view binder compiler. Do not edit!
package com.dimalahmad.kpu.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dimalahmad.kpu.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatButton btnLogin;

  @NonNull
  public final CardView cardViewContainer;

  @NonNull
  public final EditText edtPassword;

  @NonNull
  public final EditText edtUsername;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView txtRegister;

  private ActivityLoginBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatButton btnLogin, @NonNull CardView cardViewContainer,
      @NonNull EditText edtPassword, @NonNull EditText edtUsername, @NonNull ImageView imageView,
      @NonNull ConstraintLayout main, @NonNull ProgressBar progressBar, @NonNull TextView textView,
      @NonNull TextView txtRegister) {
    this.rootView = rootView;
    this.btnLogin = btnLogin;
    this.cardViewContainer = cardViewContainer;
    this.edtPassword = edtPassword;
    this.edtUsername = edtUsername;
    this.imageView = imageView;
    this.main = main;
    this.progressBar = progressBar;
    this.textView = textView;
    this.txtRegister = txtRegister;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_login;
      AppCompatButton btnLogin = ViewBindings.findChildViewById(rootView, id);
      if (btnLogin == null) {
        break missingId;
      }

      id = R.id.cardViewContainer;
      CardView cardViewContainer = ViewBindings.findChildViewById(rootView, id);
      if (cardViewContainer == null) {
        break missingId;
      }

      id = R.id.edt_password;
      EditText edtPassword = ViewBindings.findChildViewById(rootView, id);
      if (edtPassword == null) {
        break missingId;
      }

      id = R.id.edt_username;
      EditText edtUsername = ViewBindings.findChildViewById(rootView, id);
      if (edtUsername == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.txt_register;
      TextView txtRegister = ViewBindings.findChildViewById(rootView, id);
      if (txtRegister == null) {
        break missingId;
      }

      return new ActivityLoginBinding((ConstraintLayout) rootView, btnLogin, cardViewContainer,
          edtPassword, edtUsername, imageView, main, progressBar, textView, txtRegister);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
