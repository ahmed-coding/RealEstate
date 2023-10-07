package com.example.realestate.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.realestate.Models.SharedPreferencesHelper;
import com.example.realestate.R;

public class signupActivity extends AppCompatActivity {
    EditText txt_email,txt_password,txt_password1, txt_fullName;
    ImageView btnSigunup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        txt_email = (EditText) findViewById(R.id.edit_text_email);
        txt_password = (EditText) findViewById(R.id.edit_text_password);
        txt_password1 =  (EditText) findViewById(R.id.edit_text_password2);
        txt_fullName =  (EditText) findViewById(R.id.edit_text_fullName);
        btnSigunup = (ImageView) findViewById(R.id.button_sginup);

        btnSigunup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                String email = txt_email.getText().toString();
                String password = txt_password.getText().toString();
                String password1 = txt_password1.getText().toString();
                String fullName = txt_fullName.getText().toString();
                if (password.equals(password1) && password1.equals(password)) {
                    SharedPreferencesHelper prefsHelper = new SharedPreferencesHelper(signupActivity.this);
                    prefsHelper.saveUserData(fullName, email, password);
                    Toast.makeText(signupActivity.this , "تم انشاء الحساب بنجاح الان يمكنك تسجيل الدخول.", Toast.LENGTH_LONG).show();
                    intent = new Intent(signupActivity.this, MainActivity.class);

                    startActivity(intent);
                    Toast.makeText(signupActivity.this, "تم انشاء الحساب بنجاح الان يمكنك تسجيل الدخول.", Toast.LENGTH_LONG).show();

                    finish();
                } else
                    Toast.makeText(signupActivity.this, "password no match", Toast.LENGTH_SHORT).show();
            }
        });
    }
}