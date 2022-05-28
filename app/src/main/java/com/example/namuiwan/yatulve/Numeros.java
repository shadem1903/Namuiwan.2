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
    MediaPlayer serpiente, sonido, num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,num11,
                num12,num13,num14,num15,num16,num17,num18,num19,num20 ;

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

        sonido = MediaPlayer.create(this, R.raw.numerosve);
        num1 = MediaPlayer.create(this, R.raw.unove);
        num2 = MediaPlayer.create(this, R.raw.dosve);
        num3 = MediaPlayer.create(this, R.raw.treceve);
        num4 = MediaPlayer.create(this, R.raw.cuatrove);
        num5 = MediaPlayer.create(this, R.raw.cincove);
        num6 = MediaPlayer.create(this, R.raw.seisve);
        num7 = MediaPlayer.create(this, R.raw.sieteve);
        num8 = MediaPlayer.create(this, R.raw.ochove);
        num9 = MediaPlayer.create(this, R.raw.nueveve);
        num10 = MediaPlayer.create(this, R.raw.diezve);
        num11 = MediaPlayer.create(this, R.raw.onceve);
        num12 = MediaPlayer.create(this, R.raw.doceve);
        num13 = MediaPlayer.create(this, R.raw.treceve);
        num14 = MediaPlayer.create(this, R.raw.catorceve);
        num15 = MediaPlayer.create(this, R.raw.quinceve);
        num16 = MediaPlayer.create(this, R.raw.diescieisve);
        num17 = MediaPlayer.create(this, R.raw.diescisieteve);
        num18 = MediaPlayer.create(this, R.raw.diesciochove);
        num19 = MediaPlayer.create(this, R.raw.diescinueveve);
        num20 = MediaPlayer.create(this, R.raw.veinteve);
        serpiente = MediaPlayer.create(this, R.raw.numerosve);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imgUno:
                num1.start();
                break;
            case R.id.imgDos:
                num2.start();
                break;
            case R.id.imgTres:
                num3.start();
                break;
            case R.id.imgCuatro:
                num4.start();
                break;
            case R.id.imgCinco:
                num5.start();
                break;
            case R.id.imgSeis:
                num6.start();
                break;
            case R.id.imgSiete:
                num7.start();
                break;
            case R.id.imgOcho:
                num8.start();
                break;
            case R.id.imgNueve:
                num9.start();
                break;
            case R.id.imgDiez:
                num10.start();
                break;
            case R.id.imgOnce:
                num11.start();
                break;
            case R.id.imgDoce:
                num12.start();
                break;
            case R.id.imgTrece:
                num13.start();
                break;
            case R.id.imgCatorce:
                num14.start();
                break;
            case R.id.imgQuince:
                num15.start();
                break;
            case R.id.imgDiesciseis:
                num16.start();
                break;
            case R.id.imgDiescisiete:
                num17.start();
                break;
            case R.id.imgDiesciocho:
                num18.start();
                break;
            case R.id.imgDiescinueve:
                num19.start();
                break;
            case R.id.imgVeinte:
                num20.start();
                break;
        }
    }
}