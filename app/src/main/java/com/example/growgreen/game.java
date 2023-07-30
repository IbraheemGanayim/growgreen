package com.example.growgreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class game extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_layout);

        ImageView backgroundImageView = findViewById(R.id.backgroundImageView);
        backgroundImageView.setImageResource(R.drawable.river_bg3);

        Button button1 = findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Inflate the pop-up layout
                LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
                View popupView = inflater.inflate(R.layout.popup_layout, null);

                // Create the PopupWindow
                int width = LinearLayout.LayoutParams.WRAP_CONTENT;
                int height = LinearLayout.LayoutParams.WRAP_CONTENT;
                boolean focusable = true; // lets taps outside the popup also dismiss it
                final PopupWindow popupWindow = new PopupWindow(popupView, width, height, focusable);

                // Show the PopupWindow above the button
                popupWindow.showAsDropDown(v, 0, -v.getHeight()-popupWindow.getHeight());

                // Add 10$ to total
                TextView tot = findViewById(R.id.total);
                tot.setText("10$");

                // Dismiss the popup when the 'Close' button is clicked
                Button closeButton = popupView.findViewById(R.id.closeButton);
                closeButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow.dismiss();
                        // Start Level1 Activity
                        Intent intent = new Intent(v.getContext(), level1.class);
                        v.getContext().startActivity(intent);
                    }
                });
            }
        });

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Inflate the pop-up layout
                LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
                View popupView = inflater.inflate(R.layout.popup_layout2, null);

                // Create the PopupWindow
                int width = LinearLayout.LayoutParams.WRAP_CONTENT;
                int height = LinearLayout.LayoutParams.WRAP_CONTENT;
                boolean focusable = true; // lets taps outside the popup also dismiss it
                final PopupWindow popupWindow = new PopupWindow(popupView, width, height, focusable);

                // Show the PopupWindow above the button
                popupWindow.showAsDropDown(v, 0, -v.getHeight()-popupWindow.getHeight());

                // Add 10$ to total
                TextView tot = findViewById(R.id.total);
                tot.setText("20$");

                // Dismiss the popup when the 'Close' button is clicked
                Button closeButton = popupView.findViewById(R.id.closeButton);
                closeButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow.dismiss();
                        // Start Level2 Activity
                        Intent intent = new Intent(v.getContext(), level2.class);
                        v.getContext().startActivity(intent);
                    }
                });
            }
        });

        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Inflate the pop-up layout
                LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
                View popupView = inflater.inflate(R.layout.popup_layout3, null);

                // Create the PopupWindow
                int width = LinearLayout.LayoutParams.WRAP_CONTENT;
                int height = LinearLayout.LayoutParams.WRAP_CONTENT;
                boolean focusable = true; // lets taps outside the popup also dismiss it
                final PopupWindow popupWindow = new PopupWindow(popupView, width, height, focusable);

                // Show the PopupWindow above the button
                popupWindow.showAsDropDown(v, 0, -v.getHeight()-popupWindow.getHeight());

                // Add 10$ to total
                TextView tot = findViewById(R.id.total);
                tot.setText("30$");

                // Dismiss the popup when the 'Close' button is clicked
                Button closeButton = popupView.findViewById(R.id.closeButton);
                closeButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow.dismiss();
                    }
                });
            }
        });
    }
}
