package com.example.namuiwan.yatulve;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;

public class Huerta extends AppCompatActivity implements View.OnClickListener {
    //variables
    VideoView video;
    TextView txtContenido;
    ImageView imgSonido;
    MediaPlayer contenido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huertave);

        video =findViewById(R.id.vvHuerta);//referencia
        video.setVideoPath("android.resource://"+ getPackageName()+ "/" +R.raw.huertave);//Ruta del video
        MediaController mediaController = new MediaController(this); // activar contrles de pausa y start
        mediaController.setAnchorView(video);//ancho de video
        video.setMediaController(mediaController);//asigna controles al video view
        //video.start();Ejecuta el video
        contenido = MediaPlayer.create(this,R.raw.yatulyu_lutokutri_asinuk);

        referenciar();
    }
    private void referenciar(){


        imgSonido=findViewById(R.id.imgSonido);
        imgSonido.setOnClickListener(this);

        contenido = MediaPlayer.create(this,R.raw.yatulyu_lutokutri_asinuk);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imgSonido:
                contenido.start();
                break;
    }}
}