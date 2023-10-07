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

public class loginActivity extends AppCompatActivity {

    private EditText editTextEmail;
    private EditText editTextPassword;
    SharedPreferencesHelper prefsHelper ;

//    private final String UserEmail = "a@gmail.com";
//    private final String UserPassword = "12345";
//    private final String fullName= "Ahmed-M-Hamzah";

    private ImageView btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextEmail = findViewById(R.id.edit_text_email);
        editTextPassword = findViewById(R.id.edit_text_password);
        btnLogin = findViewById(R.id.button_sginup);
        prefsHelper = new SharedPreferencesHelper(this);

        String UserEmail = prefsHelper.getEmail();
        String UserPassword = prefsHelper.getPassword();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = editTextEmail.getText().toString();
                String password = editTextPassword.getText().toString();

                if (email.equals(UserEmail) && password.equals(UserPassword)) {
                    Intent intent = new Intent(loginActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } else {

                    Toast.makeText(loginActivity.this, "Invalid email or password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}