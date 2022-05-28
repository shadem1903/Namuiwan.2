package com.example.namuiwan.erikadaniel;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;

public class Orientacioned extends AppCompatActivity implements View.OnClickListener{

    ImageView imgabajo, imgarriba, imgderecha, imgizquierda, imgventana, imgpuerta, imglavadero, imgbano, imgbtnbano, imgbtnlavadero, imgbtnpuerta, imgbtnventana, imgbtnarriba, imgbtnabajo, imgbtnderecha, imgbtnizquierda;
    MediaPlayer abajo,arriba,derecha,izquierda,bno,lava,puert,ventna;
    int valor=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orientacioned);

        referenciar();
    }
    private void referenciar() {
        imgpuerta = findViewById(R.id.imgpuerta);
        imgpuerta.setOnClickListener(this);
        imgventana = findViewById(R.id.imgventana);
        imgventana.setOnClickListener(this);
        imgbano = findViewById(R.id.imgbano);
        imgbano.setOnClickListener(this);
        imglavadero = findViewById(R.id.imglavadero);
        imglavadero.setOnClickListener(this);
        imgarriba = findViewById(R.id.imgarriba);
        imgarriba.setOnClickListener(this);
        imgabajo = findViewById(R.id.imgabajo);
        imgabajo.setOnClickListener(this);
        imgderecha = findViewById(R.id.imgderecha);
        imgderecha.setOnClickListener(this);
        imgizquierda = findViewById(R.id.imgizquierda);
        imgizquierda.setOnClickListener(this);

        imgbtnpuerta = findViewById(R.id.imgbtnpuerta);
        imgbtnpuerta.setOnClickListener(this);
        imgbtnventana = findViewById(R.id.imgbtnventana);
        imgbtnventana.setOnClickListener(this);
        imgbtnbano = findViewById(R.id.imgbtnbano);
        imgbtnbano.setOnClickListener(this);
        imgbtnlavadero = findViewById(R.id.imgbtnlavadero);
        imgbtnlavadero.setOnClickListener(this);
        imgbtnarriba = findViewById(R.id.imgbtnarriba);
        imgbtnarriba.setOnClickListener(this);
        imgbtnabajo = findViewById(R.id.imgbtnabajo);
        imgbtnabajo.setOnClickListener(this);
        imgbtnderecha = findViewById(R.id.imgbtnderecha);
        imgbtnderecha.setOnClickListener(this);
        imgbtnizquierda = findViewById(R.id.imgbtnizquierda);
        imgbtnizquierda.setOnClickListener(this);

        //almacenar sonido en la variables

        abajo= MediaPlayer.create(this,R.raw.abajoed);
        arriba=MediaPlayer.create(this,R.raw.arribaed);
        derecha= MediaPlayer.create(this,R.raw.derechaed);
        izquierda= MediaPlayer.create(this,R.raw.izquierdaed);
        bno=MediaPlayer.create(this,R.raw.bnoed);
        lava= MediaPlayer.create(this,R.raw.lavaed);
        puert=MediaPlayer.create(this,R.raw.puerted);
        ventna= MediaPlayer.create(this,R.raw.ventnaed);


    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.imgabajo:
                switch (valor) {
                    case 1:
                        imgabajo.setImageResource(R.drawable.abajoedg);
                        imgbtnabajo.setVisibility(View.INVISIBLE);
                        valor = 0;
                        break;
                    case 0:
                        imgabajo.setImageResource(R.drawable.abajoed);
                        imgbtnabajo.setVisibility(View.VISIBLE);
                        valor = 1;
                        abajo.start();
                        break;
                }
                break;
            case R.id.imgarriba:
                switch (valor) {
                    case 1:
                        imgarriba.setImageResource(R.drawable.arribaedg);
                        imgbtnarriba.setVisibility(View.INVISIBLE);
                        valor = 0;
                        break;
                    case 0:
                        imgarriba.setImageResource(R.drawable.arribaed);
                        imgbtnarriba.setVisibility(View.VISIBLE);
                        valor = 1;
                        arriba.start();
                        break;
                }
                break;
            case R.id.imgderecha:
                switch (valor) {
                    case 1:
                        imgderecha.setImageResource(R.drawable.derechaedg);
                        imgbtnderecha.setVisibility(View.INVISIBLE);
                        valor = 0;
                        break;
                    case 0:
                        imgderecha.setImageResource(R.drawable.derechaed);
                        imgbtnderecha.setVisibility(View.VISIBLE);
                        valor = 1;
                        derecha.start();
                        break;
                }
                break;
            case R.id.imgizquierda:
                switch (valor) {
                    case 1:
                        imgizquierda.setImageResource(R.drawable.izquierdaedg);
                        imgbtnizquierda.setVisibility(View.INVISIBLE);
                        valor = 0;
                        break;
                    case 0:
                        imgizquierda.setImageResource(R.drawable.izquierdaed);
                        imgbtnizquierda.setVisibility(View.VISIBLE);
                        valor = 1;
                        izquierda.start();
                        break;
                }
                break;
            case R.id.imgventana:
                switch (valor) {
                    case 1:
                        imgventana.setImageResource(R.drawable.ventanaedg);
                        imgbtnventana.setVisibility(View.INVISIBLE);
                        valor = 0;
                        break;
                    case 0:
                        imgventana.setImageResource(R.drawable.ventanaed);
                        imgbtnventana.setVisibility(View.VISIBLE);
                        valor = 1;
                        ventna.start();
                        break;
                }
                break;
            case R.id.imgpuerta:
                switch (valor) {
                    case 1:
                        imgpuerta.setImageResource(R.drawable.puertaedg);
                        imgbtnpuerta.setVisibility(View.INVISIBLE);
                        valor = 0;
                        break;
                    case 0:
                        imgpuerta.setImageResource(R.drawable.puertaed);
                        imgbtnpuerta.setVisibility(View.VISIBLE);
                        valor = 1;
                        puert.start();
                        break;
                }
                break;
            case R.id.imglavadero:
                switch (valor) {
                    case 1:
                        imglavadero.setImageResource(R.drawable.lavaderoedg);
                        imgbtnlavadero.setVisibility(View.INVISIBLE);
                        valor = 0;
                        break;
                    case 0:
                        imglavadero.setImageResource(R.drawable.lavaderoed);
                        imgbtnlavadero.setVisibility(View.VISIBLE);
                        valor = 1;
                        lava.start();
                        break;
                }
                break;
            case R.id.imgbano:
                switch (valor) {
                    case 1:
                        imgbano.setImageResource(R.drawable.banoed1g);
                        imgbtnbano.setVisibility(View.INVISIBLE);
                        valor = 0;
                        break;
                    case 0:
                        imgbano.setImageResource(R.drawable.banoed1);
                        imgbtnbano.setVisibility(View.VISIBLE);
                        valor = 1;
                        bno.start();
                        break;
                }
                break;
        }
    }

































}