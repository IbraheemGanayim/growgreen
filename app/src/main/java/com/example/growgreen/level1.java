package com.example.growgreen;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class level1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level1);

        VideoView videoView = findViewById(R.id.videoView);
        Button nextButton = findViewById(R.id.nextButton);

        // Set video URI to videoView
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.my_video;
        videoView.setVideoURI(Uri.parse(videoPath));
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        videoView.start();

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go back to main activity
                Intent intent = new Intent(level1.this, qusetions.class);
                startActivity(intent);
            }
        });

        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                videoView.start();
            }
        });

    }
}
