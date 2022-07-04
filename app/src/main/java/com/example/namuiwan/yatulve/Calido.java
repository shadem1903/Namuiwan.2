package com.example.namuiwan.yatulve;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;

import java.util.Timer;
import java.util.TimerTask;

public class Calido extends AppCompatActivity implements View.OnClickListener {
    ImageView imgPapaGuata,imgArracacha,imgMaiz,imgOca,imgtitlearracacha,imgtitlepapaguata,imgtitlemaiz,imgtitleoca;
    MediaPlayer papaguata,arracacha,maiz,oca;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calidove);
        referenciar();
    }
    private void referenciar(){
        imgPapaGuata = findViewById(R.id.imgPapaGuata);
        imgPapaGuata.setOnClickListener(this);
        imgArracacha = findViewById(R.id.imgArracacha);
        imgArracacha.setOnClickListener(this);
        imgMaiz   = findViewById(R.id.imgMaiz);
        imgMaiz.setOnClickListener(this);
        imgOca    = findViewById(R.id.imgOca);
        imgOca.setOnClickListener(this);
        imgtitlearracacha =findViewById(R.id.imgtitlearracacha);
        imgtitlearracacha.setOnClickListener(this);
        imgtitlepapaguata =findViewById(R.id.imgtitlepapaguata);
        imgtitlepapaguata.setOnClickListener(this);
        imgtitlemaiz =findViewById(R.id.imgtitlemaiz);
        imgtitlemaiz.setOnClickListener(this);
        imgtitleoca =findViewById(R.id.imgtitleoca);
        imgtitleoca.setOnClickListener(this);

        //almacena sonido en la variable gallina
        papaguata = MediaPlayer.create(this,R.raw.wataye);
        arracacha = MediaPlayer.create(this,R.raw.oskowau);
        maiz = MediaPlayer.create(this,R.raw.pura);
        oca = MediaPlayer.create(this,R.raw.mishi);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imgPapaGuata:
                imgtitlearracacha.setVisibility(View.INVISIBLE);
                imgtitlemaiz.setVisibility(View.INVISIBLE);
                imgtitleoca.setVisibility(View.INVISIBLE);
                imgtitlepapaguata.setVisibility(View.VISIBLE);
                papaguata.start();
                /*TimerTask esperar1 = new TimerTask() {
                    @Override
                    public void run() {
                        imgtitlepapaguata.setVisibility(View.INVISIBLE);
                    }
                };
                Timer timer1 = new Timer();
                timer1.schedule(esperar1,1400);*/

                break;
            case R.id.imgArracacha:
                imgtitlemaiz.setVisibility(View.INVISIBLE);
                imgtitleoca.setVisibility(View.INVISIBLE);
                imgtitlepapaguata.setVisibility(View.INVISIBLE);
                imgtitlearracacha.setVisibility(View.VISIBLE);
                arracacha.start();

                break;
            case R.id.imgMaiz:
                imgtitleoca.setVisibility(View.INVISIBLE);
                imgtitlepapaguata.setVisibility(View.INVISIBLE);
                imgtitlearracacha.setVisibility(View.INVISIBLE);
                imgtitlemaiz.setVisibility(View.VISIBLE);
                maiz.start();

                break;
            case R.id.imgOca:
                imgtitlepapaguata.setVisibility(View.INVISIBLE);
                imgtitlearracacha.setVisibility(View.INVISIBLE);
                imgtitlemaiz.setVisibility(View.INVISIBLE);
                imgtitleoca.setVisibility(View.VISIBLE);
                oca.start();

                break;
        }
    }
}