package com.example.realestate.activites;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.realestate.R;

public class aboutActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView textView, txtAboutLink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        imageView =  findViewById(R.id.aboutpict);
        textView =  findViewById(R.id.txt_aboutName);
        txtAboutLink = findViewById(R.id.txt_aboutLink);
        Animation fadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        imageView.startAnimation(fadeInAnimation);
        textView.startAnimation(fadeInAnimation);
        txtAboutLink.startAnimation(fadeInAnimation);
         SpannableString spannableString = new SpannableString(txtAboutLink.getText());
        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                String url = "https://github.com/ahmed-coding/RealEstate";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        };
        spannableString.setSpan(clickableSpan, txtAboutLink.getText().toString().indexOf("https"), txtAboutLink.getText().length(), 0);
        txtAboutLink.setText(spannableString);
        txtAboutLink.setMovementMethod(LinkMovementMethod.getInstance());
    }

    }