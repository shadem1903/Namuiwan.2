package com.example.namuiwan.erikadaniel;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;
public class Geometricaed extends AppCompatActivity implements View.OnClickListener{

    ImageView imggrande, imgmediano, imgpequeno, imgcuadrado, imgrectangulo, imgtriangulo, imgcirculo, imgbtngrande, imgbtnmediano, imgbtnpequeno, imgbtncuadrado, imgbtncirculo, imgbtntriangulo, imgbtnrectangulo;
    MediaPlayer circulo,recta,tria,grande,media,peque;
    int valor=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geometricaed);

        referenciar();
    }
    private void referenciar() {
        imgcirculo = findViewById(R.id.imgcirculo);
        imgcirculo.setOnClickListener(this);
        imgcuadrado = findViewById(R.id.imgcuadrado);
        imgcuadrado.setOnClickListener(this);
        imgrectangulo = findViewById(R.id.imgrectangulo);
        imgrectangulo.setOnClickListener(this);
        imgtriangulo = findViewById(R.id.imgtriangulo);
        imgtriangulo.setOnClickListener(this);
        imggrande = findViewById(R.id.imggrande);
        imggrande.setOnClickListener(this);
        imgmediano = findViewById(R.id.imgmediano);
        imgmediano.setOnClickListener(this);
        imgpequeno = findViewById(R.id.imgpequeno);
        imgpequeno.setOnClickListener(this);
        imgbtncirculo = findViewById(R.id.imgbtncirculo);
        imgbtncirculo.setOnClickListener(this);
        imgbtncuadrado = findViewById(R.id.imgbtncuadrado);
        imgbtncuadrado.setOnClickListener(this);
        imgbtnrectangulo = findViewById(R.id.imgbtnrectangulo);
        imgbtnrectangulo.setOnClickListener(this);
        imgbtntriangulo = findViewById(R.id.imgbtntriangulo);
        imgbtntriangulo.setOnClickListener(this);
        imgbtngrande = findViewById(R.id.imgbtngrande);
        imgbtngrande.setOnClickListener(this);
        imgbtnmediano = findViewById(R.id.imgbtnmediano);
        imgbtnmediano.setOnClickListener(this);
        imgbtnpequeno = findViewById(R.id.imgbtnpequeno);
        imgbtnpequeno.setOnClickListener(this);


        //almacenar sonido en la variables


        circulo= MediaPlayer.create(this,R.raw.circuloed);
        recta=MediaPlayer.create(this,R.raw.rectaed);
        tria= MediaPlayer.create(this,R.raw.triaed);
        grande= MediaPlayer.create(this,R.raw.grandeed);
        media=MediaPlayer.create(this,R.raw.mediaed);
        peque= MediaPlayer.create(this,R.raw.pequeed);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.imggrande:
                switch (valor) {
                    case 1:
                        imggrande.setImageResource(R.drawable.grandeedg);
                        imgbtngrande.setVisibility(View.INVISIBLE);
                        valor = 0;
                        break;
                    case 0:
                        imggrande.setImageResource(R.drawable.grandeed);
                        imgbtngrande.setVisibility(View.VISIBLE);
                        valor = 1;
                        grande.start();
                        break;
                }
                break;
            case R.id.imgmediano:
                switch (valor) {
                    case 1:
                        imgmediano.setImageResource(R.drawable.medianoedg);
                        imgbtnmediano.setVisibility(View.INVISIBLE);
                        valor = 0;
                        break;
                    case 0:
                        imgmediano.setImageResource(R.drawable.medianoed);
                        imgbtnmediano.setVisibility(View.VISIBLE);
                        valor = 1;
                        media.start();
                        break;
                }
                break;
            case R.id.imgpequeno:
                switch (valor) {
                    case 1:
                        imgpequeno.setImageResource(R.drawable.pequenoedg);
                        imgbtnpequeno.setVisibility(View.INVISIBLE);
                        valor = 0;
                        break;
                    case 0:
                        imgpequeno.setImageResource(R.drawable.pequenoed);
                        imgbtnpequeno.setVisibility(View.VISIBLE);
                        valor = 1;
                        peque.start();
                        break;
                }
                break;
            case R.id.imgcuadrado:
                switch (valor) {
                    case 1:
                        imgcuadrado.setImageResource(R.drawable.cuadradoedg);
                        imgbtncuadrado.setVisibility(View.INVISIBLE);
                        valor = 0;
                        break;
                    case 0:
                        imgcuadrado.setImageResource(R.drawable.cuadradoed);
                        imgbtncuadrado.setVisibility(View.VISIBLE);
                        valor = 1;
                        break;
                }
                break;
            case R.id.imgrectangulo:
                switch (valor) {
                    case 1:
                        imgrectangulo.setImageResource(R.drawable.rectanguloedg);
                        imgbtnrectangulo.setVisibility(View.INVISIBLE);
                        valor = 0;
                        break;
                    case 0:
                        imgrectangulo.setImageResource(R.drawable.rectanguloed);
                        imgbtnrectangulo.setVisibility(View.VISIBLE);
                        valor = 1;
                        recta.start();
                        break;
                }
                break;
            case R.id.imgtriangulo:
                switch (valor) {
                    case 1:
                        imgtriangulo.setImageResource(R.drawable.trianguloedg);
                        imgbtntriangulo.setVisibility(View.INVISIBLE);
                        valor = 0;
                        break;
                    case 0:
                        imgtriangulo.setImageResource(R.drawable.trianguloed);
                        imgbtntriangulo.setVisibility(View.VISIBLE);
                        valor = 1;
                        tria.start();
                        break;
                }
                break;
            case R.id.imgcirculo:
                switch (valor) {
                    case 1:
                        imgcirculo.setImageResource(R.drawable.circuloedg);
                        imgbtncirculo.setVisibility(View.INVISIBLE);
                        valor = 0;
                        break;
                    case 0:
                        imgcirculo.setImageResource(R.drawable.circuloed);
                        imgbtncirculo.setVisibility(View.VISIBLE);
                        valor = 1;
                        circulo.start();
                        break;
                }
                break;
        }
    }
}