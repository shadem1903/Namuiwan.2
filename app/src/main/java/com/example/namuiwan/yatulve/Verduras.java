package com.example.namuiwan.yatulve;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;
public class Verduras extends AppCompatActivity implements View.OnClickListener{
    ImageView imgCebolla,imgZanahoria,imgTomate,imgPimiento;
    MediaPlayer cebolla,zanahoria,tomate,pimiento;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verdurasve);
        referenciar();

    }
    private void referenciar() {
        imgCebolla = findViewById(R.id.imgCebolla);
        imgCebolla.setOnClickListener(this);
        imgZanahoria = findViewById(R.id.imgZanahoria);
        imgZanahoria.setOnClickListener(this);
        imgTomate   = findViewById(R.id.imgTomate);
        imgTomate.setOnClickListener(this);
        imgPimiento    = findViewById(R.id.imgPimiento);
        imgPimiento.setOnClickListener(this);

        //almacena sonido en la variable gallina
        cebolla    = MediaPlayer.create(this,R.raw.cebollave);
        zanahoria  = MediaPlayer.create(this,R.raw.zanahoriave);
        tomate       = MediaPlayer.create(this,R.raw.gatoaa);
        pimiento      = MediaPlayer.create(this,R.raw.perroaa);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imgCebolla:
                cebolla.start();
                break;
            case R.id.imgZanahoria:
                zanahoria.start();
                break;
            case R.id.imgTomate:
                tomate.start();
                break;
            case R.id.imgPimiento:
                pimiento.start();
                break;
        }
    }
}