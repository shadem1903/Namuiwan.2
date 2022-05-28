package com.example.namuiwan.yatulve;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;
public class Herramientas extends AppCompatActivity implements View.OnClickListener {
    ImageView imgAzadon, imgHacha,imgMachete,imgPala;
    MediaPlayer azadon, hacha, machete,pala;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_herramientasve);
        referenciar();
    }
    private void referenciar(){
        imgAzadon=findViewById(R.id.imgAzadon);
        imgAzadon.setOnClickListener(this);
        imgHacha=findViewById(R.id.imgHacha);
        imgHacha.setOnClickListener(this);
        imgMachete=findViewById(R.id.imgMachete);
        imgMachete.setOnClickListener(this);
        imgPala=findViewById(R.id.imgPala);
        imgPala.setOnClickListener(this);

        //almacena sonido en la variable gallina
        azadon = MediaPlayer.create(this,R.raw.anchul_kachull);
        hacha = MediaPlayer.create(this,R.raw.walom);
        machete = MediaPlayer.create(this,R.raw.awinchi);
        pala = MediaPlayer.create(this,R.raw.ol_kachul);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imgAzadon:
                azadon.start();
                break;
            case R.id.imgHacha:
                hacha.start();
                break;
            case R.id.imgMachete:
                machete.start();
                break;
            case R.id.imgPala:
                pala.start();
                break;
        }
    }
}