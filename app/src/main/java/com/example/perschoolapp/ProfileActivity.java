package com.example.perschoolapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class ProfileActivity extends AppCompatActivity {
    private ImageView home;
    private ImageView profile2;
    private ImageView chat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        home = findViewById(R.id.home);
        home.setOnClickListener( view -> {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        });
        profile2 = findViewById(R.id.profile2);
        profile2.setOnClickListener( view -> {
            Intent i = new Intent(this, ProfileActivity.class);
            startActivity(i);
        });
        chat = findViewById(R.id.chat);
        chat.setOnClickListener( view -> {
            Intent i = new Intent(this, chat_activity.class);
            startActivity(i);
        });
    }
}