package com.example.namuiwan.erikadaniel;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;

public class Huertaed extends AppCompatActivity {

    VideoView video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huertaed);

        video= findViewById(R.id.vvhuerta);
        video.setVideoPath("android.resource://"+ getOpPackageName()+"/"+R.raw.huertaed);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(video);
        video.setMediaController(mediaController);
        video.start();
    }
}