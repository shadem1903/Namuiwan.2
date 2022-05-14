package com.example.namuiwan.erikadaniel;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;

public class Familiaed extends AppCompatActivity implements View.OnClickListener{


    ImageView  imgabuela, imgabuelo, imgpapa, imgmama, imgnina, imgnino;
    TextView txfamiliar, txparentesco;
    MediaPlayer abuela, abuelo, papa, mama, hijo, hija;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_familiaed);
        referenciar();
    }

    private void referenciar(){

        imgabuela = findViewById(R.id.imgabuela);
        imgabuela.setOnClickListener(this);
        imgabuelo = findViewById(R.id.imgabuelo);
        imgabuelo.setOnClickListener(this);
        imgpapa = findViewById(R.id.imgpapa;
        imgpapa.setOnClickListener(this);
        imgmama = findViewById(R.id.imgmama;
        imgmama.setOnClickListener(this);
        imgnino = findViewById(R.id.imgnino);
        imgnino.setOnClickListener(this);
        imgnina = findViewById(R.id.nina);
        imgnina.setOnClickListener(this);

        //almacenamiento de sonidos en variables
        abuela= MediaPlayer.create(this,R.raw.abuelaed);
        abuelo= MediaPlayer.create(this,R.raw.abueloed);
        mama= MediaPlayer.create(this,R.raw.mamaed);
        papa= MediaPlayer.create(this,R.raw.papaed);
        hija= MediaPlayer.create(this,R.raw.hijaed);
        hijo= MediaPlayer.create(this,R.raw.hijoed);


    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case.R.id.imgabuela:

        }

    }
}