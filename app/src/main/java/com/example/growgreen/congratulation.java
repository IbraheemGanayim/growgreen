package com.example.growgreen;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class congratulation extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.congratulation);

        ImageView backgroundImageView = findViewById(R.id.backgroundImageView);
        backgroundImageView.setImageResource(R.drawable.vector);
    }
}
