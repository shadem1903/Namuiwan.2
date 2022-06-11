package com.example.namuiwan.yatulve;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;

import java.util.Timer;
import java.util.TimerTask;

public class Verduras extends AppCompatActivity implements View.OnClickListener{
    ImageView imgCebolla,imgZanahoria,imgTomate,imgPimiento, imgPregunta,imgtitlecebolla,imgtitlezanahoria,imgtitlepimiento,imgtitletomate;
    MediaPlayer cebolla,zanahoria,tomate,pimiento,pregunta3;
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
        imgPregunta = findViewById(R.id.imgPregunta);
        imgPregunta.setOnClickListener(this);
        imgtitlecebolla = findViewById(R.id.imgtitlecebolla);
        imgtitlecebolla.setOnClickListener(this);
        imgtitlezanahoria = findViewById(R.id.imgtitlezanahoria);
        imgtitlezanahoria.setOnClickListener(this);
        imgtitlepimiento = findViewById(R.id.imgtitlepimiento);
        imgtitlepimiento.setOnClickListener(this);
        imgtitletomate = findViewById(R.id.imgtitletomate);
        imgtitletomate.setOnClickListener(this);

        //almacena sonido en las variable
        cebolla    = MediaPlayer.create(this,R.raw.cebollave);
        zanahoria  = MediaPlayer.create(this,R.raw.zanahoriave);
        tomate       = MediaPlayer.create(this,R.raw.gatoaa);
        pimiento      = MediaPlayer.create(this,R.raw.perroaa);
        pregunta3 = MediaPlayer.create(this,R.raw.pregunta1vegetcualeszanahoriave);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imgPregunta:
                Toast.makeText(Verduras.this, "¿Cual es la zanahoria...?", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(Verduras.this, Pregunta3verdura.class);
                startActivity(intent1);
                pregunta3.start();
                break;

            case R.id.imgCebolla:
                imgtitlecebolla.setVisibility(View.VISIBLE);
                cebolla.start();
                TimerTask esperar1 = new TimerTask() {
                    @Override
                    public void run() {
                        imgtitlecebolla.setVisibility(View.INVISIBLE);
                    }
                };
                Timer timer1 = new Timer();
                timer1.schedule(esperar1,1400);

                break;
            case R.id.imgZanahoria:
                imgtitlezanahoria.setVisibility(View.VISIBLE);
                zanahoria.start();
                TimerTask esperar2 = new TimerTask() {
                    @Override
                    public void run() {
                        imgtitlezanahoria.setVisibility(View.INVISIBLE);
                    }
                };
                Timer timer2 = new Timer();
                timer2.schedule(esperar2,1400);

                break;
            case R.id.imgTomate:
                imgtitletomate.setVisibility(View.VISIBLE);
                tomate.start();
                TimerTask esperar3 = new TimerTask() {
                    @Override
                    public void run() {
                        imgtitletomate.setVisibility(View.INVISIBLE);
                    }
                };
                Timer timer3 = new Timer();
                timer3.schedule(esperar3,1400);

                break;
            case R.id.imgPimiento:
                imgtitlepimiento.setVisibility(View.VISIBLE);
                pimiento.start();

                TimerTask esperar4 = new TimerTask() {
                    @Override
                    public void run() {
                        imgtitlepimiento.setVisibility(View.INVISIBLE);
                    }
                };
                Timer timer4 = new Timer();
                timer4.schedule(esperar4,1400);

                break;
        }
    }
}