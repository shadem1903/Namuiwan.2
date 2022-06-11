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

public class Frio extends AppCompatActivity implements View.OnClickListener {
    ImageView imgUlluco,imgPapaColorada,imgPapaAmarilla,imgRepollo, imgPregunta,imgtitlerepollo,imgtitlepapaamarilla,imgtitlepapacolorada,imgtitleullucos;
    MediaPlayer ulluco,papacolorada,papaamarilla,repollo,pregunta1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friove);
        referenciar();
    }
    private void referenciar() {
        imgPregunta = findViewById(R.id.imgPregunta);
        imgPregunta.setOnClickListener(this);
        imgUlluco = findViewById(R.id.imgUlluco);
        imgUlluco.setOnClickListener(this);
        imgPapaColorada = findViewById(R.id.imgPapaColorada);
        imgPapaColorada.setOnClickListener(this);
        imgPapaAmarilla   = findViewById(R.id.imgPapaAmarilla);
        imgPapaAmarilla.setOnClickListener(this);
        imgRepollo    = findViewById(R.id.imgRepollo);
        imgRepollo.setOnClickListener(this);
        imgtitlerepollo = findViewById(R.id.imgtitlerepollo);
        imgtitlerepollo.setOnClickListener(this);
        imgtitlepapaamarilla = findViewById(R.id.imgtitlepapaamarilla);
        imgtitlepapaamarilla.setOnClickListener(this);
        imgtitlepapacolorada = findViewById(R.id.imgtitlepapacolorada);
        imgtitlepapacolorada.setOnClickListener(this);
        imgtitleullucos = findViewById(R.id.imgtitleullucos);
        imgtitleullucos.setOnClickListener(this);



        //almacena sonido en la variable gallina
        ulluco    = MediaPlayer.create(this,R.raw.lau);
        papacolorada  = MediaPlayer.create(this,R.raw.pikoye);
        papaamarilla       = MediaPlayer.create(this,R.raw.maiye);
        repollo      = MediaPlayer.create(this,R.raw.tulurmon);
        pregunta1 = MediaPlayer.create(this,R.raw.pregunta1vegetcualesrepollo);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imgPregunta:
                Toast.makeText(Frio.this, "¿Cual es el repollo...?", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(Frio.this, Pregunta1vegefrio.class);
                startActivity(intent1);
                pregunta1.start();
                break;

            case R.id.imgUlluco:
                imgtitleullucos.setVisibility(View.VISIBLE);
                ulluco.start();
                TimerTask esperar1 = new TimerTask() {
                    @Override
                    public void run() {
                        imgtitleullucos.setVisibility(View.INVISIBLE);
                    }
                };
                Timer timer1 = new Timer();
                timer1.schedule(esperar1,1400);

                break;
            case R.id.imgPapaColorada:
                imgtitlepapacolorada.setVisibility(View.VISIBLE);
                papacolorada.start();
                TimerTask esperar2 = new TimerTask() {
                    @Override
                    public void run() {
                        imgtitlepapacolorada.setVisibility(View.INVISIBLE);
                    }
                };
                Timer timer2 = new Timer();
                timer2.schedule(esperar2,1400);

                break;
            case R.id.imgPapaAmarilla:
                imgtitlepapaamarilla.setVisibility(View.VISIBLE);
                papaamarilla.start();
                TimerTask esperar3 = new TimerTask() {
                    @Override
                    public void run() {
                        imgtitlepapaamarilla.setVisibility(View.INVISIBLE);
                    }
                };
                Timer timer3 = new Timer();
                timer3.schedule(esperar3,1400);

                break;
            case R.id.imgRepollo:
                imgtitlerepollo.setVisibility(View.VISIBLE);
                repollo.start();

                TimerTask esperar4 = new TimerTask() {
                    @Override
                    public void run() {
                        imgtitlerepollo.setVisibility(View.INVISIBLE);
                    }
                };
                Timer timer4 = new Timer();
                timer4.schedule(esperar4,1400);

                break;
        }
    }
}