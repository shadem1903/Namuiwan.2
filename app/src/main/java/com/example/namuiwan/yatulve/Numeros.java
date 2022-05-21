package com.example.namuiwan.yatulve;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;

public class Numeros extends AppCompatActivity implements View.OnClickListener {

    ImageView  imgUno, imgDos, imgTres, imgCuatro, imgCinco, imgSeis, imgSiete,
               imgOcho, imgNueve, imgDiez, imgOnce, imgDoce, imgTrece, imgCatorce, imgQuince, imgDiesciseis,
               imgDiescisiete, imgDiesciocho, imgDiescinueve, imgVeinte;
    MediaPlayer serpiente, sonido, num1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numerosve);
        referenciar();
    }

    private void referenciar() {
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
        imgDiesciocho = findViewById(R.id.imgDiesciocho);
        imgDiesciocho.setOnClickListener(this);
        imgDiescinueve = findViewById(R.id.imgDiescinueve);
        imgDiescinueve.setOnClickListener(this);
        imgVeinte = findViewById(R.id.imgVeinte);
        imgVeinte.setOnClickListener(this);


        sonido = MediaPlayer.create(this, R.raw.gatoaa);
        num1 = MediaPlayer.create(this, R.raw.perroaa);
        serpiente = MediaPlayer.create(this, R.raw.serpienteaa);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imgUno:
                num1.start();
                break;
            case R.id.imgDos:
                sonido.start();
                break;
            case R.id.imgTres:
                num1.start();
                break;
            case R.id.imgCuatro:
                sonido.start();
                break;
            case R.id.imgCinco:
                num1.start();
                break;
            case R.id.imgSeis:
                sonido.start();
                break;
            case R.id.imgSiete:
                num1.start();
                break;
            case R.id.imgOcho:
                sonido.start();
                break;
            case R.id.imgNueve:
                num1.start();
                break;
            case R.id.imgDiez:
                sonido.start();
                break;
            case R.id.imgOnce:
                num1.start();
                break;
            case R.id.imgDoce:
                sonido.start();
                break;
            case R.id.imgTrece:
                num1.start();
                break;
            case R.id.imgCatorce:
                sonido.start();
                break;
            case R.id.imgQuince:
                num1.start();
                break;
            case R.id.imgDiesciseis:
                sonido.start();
                break;
            case R.id.imgDiescisiete:
                num1.start();
                break;
            case R.id.imgDiesciocho:
                sonido.start();
                break;
            case R.id.imgDiescinueve:
                num1.start();
                break;
            case R.id.imgVeinte:
                sonido.start();
                break;
        }
    }
}