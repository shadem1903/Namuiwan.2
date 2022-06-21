package com.example.namuiwan.yatulve;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;

import java.util.Timer;
import java.util.TimerTask;

public class Pregunta3numeros extends AppCompatActivity implements View.OnClickListener{

    ImageView imgUno, imgDos, imgTres, imgCuatro, imgCinco, imgSeis, imgSiete,
            imgOcho, imgNueve, imgDiez, imgOnce, imgDoce, imgTrece, imgCatorce, imgQuince, imgDiesciseis,
            imgDiescisiete, imgDiesciocho, imgDiescinueve, imgVeinte,imgParlanteve,imageView4;
    MediaPlayer correcto,incorrecto,serpiente, sonido, pregunta3, pregunta4,num1,num2,num3,num4,num5,
            num6,num7,num8,num9,num10,num11,num12,num13,num14,num15,num16,num17,num18,num19,num20;

    //MediaPlayer num[] = new MediaPlayer[25];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta3numeros);
        referenciar();

    }

    private void referenciar() {
        correcto = MediaPlayer.create(this,R.raw.correctove);
        incorrecto=MediaPlayer.create(this,R.raw.incorrectove);

        num1=MediaPlayer.create(this, R.raw.unove);
        num2=MediaPlayer.create(this, R.raw.dosve);
        num3=MediaPlayer.create(this, R.raw.tresve);
        num4=MediaPlayer.create(this, R.raw.cuatrove);
        num5=MediaPlayer.create(this, R.raw.cincove);
        num6=MediaPlayer.create(this, R.raw.seisve);
        num7=MediaPlayer.create(this, R.raw.sieteve);
        num8=MediaPlayer.create(this, R.raw.ochove);
        num9=MediaPlayer.create(this, R.raw.nueveve);
        num10=MediaPlayer.create(this, R.raw.diezve);
        num11=MediaPlayer.create(this, R.raw.onceve);
        num12=MediaPlayer.create(this, R.raw.doceve);
        num13=MediaPlayer.create(this, R.raw.treceve);
        num14=MediaPlayer.create(this, R.raw.catorceve);
        num15=MediaPlayer.create(this, R.raw.quinceve);
        num16=MediaPlayer.create(this, R.raw.diescieisve);
        num17=MediaPlayer.create(this, R.raw.diescisieteve);
        num18=MediaPlayer.create(this,R.raw.diesciochove);
        num19=MediaPlayer.create(this,R.raw.diescinueveve);
        num20=MediaPlayer.create(this,R.raw.veinteve);
        sonido = MediaPlayer.create(this, R.raw.numerosve);
        pregunta3 = MediaPlayer.create(this,R.raw.pregunta3cualeselcinco);
        pregunta4 = MediaPlayer.create(this,R.raw.pregunta4cualeselseis);

        imgUno = findViewById(R.id.imgUno);
        imgUno.setOnClickListener(this);
        imgDos = findViewById(R.id.imgDos);
        imgDos.setOnClickListener(this);
        imgTres = findViewById(R.id.imgTres);
        imgTres.setOnClickListener(this);
        imgCuatro = findViewById(R.id.imgCuatro);
        imgCuatro.setOnClickListener(this);
        imgCinco = findViewById(R.id.imgCinco);
        imgCinco.setOnClickListener(this);
        imgSeis = findViewById(R.id.imgSeis);
        imgSeis.setOnClickListener(this);
        imgSiete = findViewById(R.id.imgSiete);
        imgSiete.setOnClickListener(this);
        imgOcho = findViewById(R.id.imgOcho);
        imgOcho.setOnClickListener(this);
        imgNueve = findViewById(R.id.imgNueve);
        imgNueve.setOnClickListener(this);
        imgDiez = findViewById(R.id.imgDiez);
        imgDiez.setOnClickListener(this);
        imgOnce = findViewById(R.id.imgOnce);
        imgOnce.setOnClickListener(this);
        imgDoce = findViewById(R.id.imgDoce);
        imgDoce.setOnClickListener(this);
        imgTrece = findViewById(R.id.imgTrece);
        imgTrece.setOnClickListener(this);
        imgCatorce = findViewById(R.id.imgCatorce);
        imgCatorce.setOnClickListener(this);
        imgQuince = findViewById(R.id.imgQuince);
        imgQuince.setOnClickListener(this);
        imgDiesciseis = findViewById(R.id.imgDiesciseis);
        imgDiesciseis.setOnClickListener(this);
        imgDiescisiete = findViewById(R.id.imgDiescisiete);
        imgDiescisiete.setOnClickListener(this);
        imgDiesciocho =findViewById(R.id.imgDiesciocho);
        imgDiesciocho.setOnClickListener(this);
        imgDiescinueve = findViewById(R.id.imgDiescinueve);
        imgDiescinueve.setOnClickListener(this);
        imgVeinte = findViewById(R.id.imgVeinte);
        imgVeinte.setOnClickListener(this);
        imgParlanteve = findViewById(R.id.imgParlanteve);
        imgParlanteve.setOnClickListener(this);
        imageView4=findViewById(R.id.imageView4);
        imageView4.setOnClickListener(this);
        //serpiente = MediaPlayer.create(this, R.raw.numerosve);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imgParlanteve:
                Toast.makeText(Pregunta3numeros.this, "¿Cual es el número 6...?", Toast.LENGTH_SHORT).show();
                pregunta3.start();
                break;
            case R.id.imgUno:
                incorrecto.start();
                hacerSonarNumero(num1);
                break;
            case R.id.imgDos:
                incorrecto.start();
                hacerSonarNumero(num2);
                break;
            case R.id.imgTres:
                incorrecto.start();
                hacerSonarNumero(num3);
                break;
            case R.id.imgCuatro:
                incorrecto.start();
                hacerSonarNumero(num4);
                break;
            case R.id.imgCinco:
                correcto.start();
                Toast.makeText(Pregunta3numeros.this, "Cual es el 6", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Pregunta3numeros.this, Pregunta4numeros.class);
                startActivity(intent);
                hacerSonarNumero(pregunta4);
                break;
            case R.id.imgSeis:
                incorrecto.start();
                hacerSonarNumero(num6);
                break;
            case R.id.imgSiete:
                incorrecto.start();
                hacerSonarNumero(num7);
                break;
            case R.id.imgOcho:
                incorrecto.start();
                hacerSonarNumero(num8);
                break;
            case R.id.imgNueve:
                incorrecto.start();
                hacerSonarNumero(num9);
                break;
            case R.id.imgDiez:
                incorrecto.start();
                hacerSonarNumero(num10);
                break;
            case R.id.imgOnce:
                incorrecto.start();
                hacerSonarNumero(num11);
                break;
            case R.id.imgDoce:
                incorrecto.start();
                hacerSonarNumero(num12);
                break;
            case R.id.imgTrece:
                incorrecto.start();
                hacerSonarNumero(num13);
                break;
            case R.id.imgCatorce:
                incorrecto.start();
                hacerSonarNumero(num14);
                break;
            case R.id.imgQuince:
                incorrecto.start();
                hacerSonarNumero(num15);
                break;
            case R.id.imgDiesciseis:
                incorrecto.start();
                hacerSonarNumero(num16);
                break;
            case R.id.imgDiescisiete:
                incorrecto.start();
                hacerSonarNumero(num17);
                break;
            case R.id.imgDiesciocho:
                incorrecto.start();
                hacerSonarNumero(num18);
                break;
            case R.id.imgDiescinueve:
                incorrecto.start();
                hacerSonarNumero(num19);
                break;
            case R.id.imgVeinte:
                incorrecto.start();
                hacerSonarNumero(num20);
                break;
            case R.id.imageView4:
                Toast.makeText(Pregunta3numeros.this, "numeros...?", Toast.LENGTH_SHORT).show();
                hacerSonarNumero(sonido);
                break;
        }

    }

    private void hacerSonarNumero(MediaPlayer number) {
        TimerTask espera = new TimerTask() {
            @Override
            public void run() {

                number.start();
            }
        };
        Timer timer = new Timer();
        timer.schedule(espera,1000);
    }
}