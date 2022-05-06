package com.example.perschoolapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class chat_activity extends AppCompatActivity {
    private ImageView home;
    private ImageView profile3;
    private ImageView chat2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        home = findViewById(R.id.home);
        home.setOnClickListener( view -> {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        });
        profile3 = findViewById(R.id.profile3);
        profile3.setOnClickListener( view -> {
            Intent i = new Intent(this, ProfileActivity.class);
            startActivity(i);
        });
        chat2 = findViewById(R.id.chat2);
        chat2.setOnClickListener( view -> {
            Intent i = new Intent(this, chat_activity.class);
            startActivity(i);
        });
    }


}