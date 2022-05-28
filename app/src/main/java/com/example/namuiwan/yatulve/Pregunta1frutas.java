package com.example.namuiwan.yatulve;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;
import java.util.Timer;
import java.util.TimerTask;
public class Pregunta1frutas extends AppCompatActivity implements View.OnClickListener{

    MediaPlayer correcto, incorrecto, fresa, mora, uchuva, mortino;
    ImageView imgUchuvas, imgMora, imgMortino, imgFresas;

    //TextView txtPregunta1;

    //TextView txt_puntos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pegunta1frutasve);
        referenciar();
    }

    private void referenciar() {
        correcto = MediaPlayer.create(this, R.raw.correctove);
        incorrecto = MediaPlayer.create(this,R.raw.incorrectove);
        fresa = MediaPlayer.create(this, R.raw.fresasve);
        mora = MediaPlayer.create(this,R.raw.morave);
        uchuva =  MediaPlayer.create(this,R.raw.uchuvave);
        mortino = MediaPlayer.create(this,R.raw.mortinove);

        imgUchuvas = findViewById(R.id.imgUchuvas);
        imgUchuvas.setOnClickListener(this);
        imgMora = findViewById(R.id.imgMora);
        imgMora.setOnClickListener(this);
        imgMortino = findViewById(R.id.imgMortino);
        imgMortino.setOnClickListener(this);
        imgFresas = findViewById(R.id.imgFresas);
        imgFresas.setOnClickListener(this);
        //txtPregunta1 = findViewById(R.id.txtPregunta1);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imgUchuvas:
                //txtPregunta1.setText("!!!!!excelente!!!!!");
                correcto.start();
                TimerTask esperar1 = new TimerTask() {
                    @Override
                    public void run() {

                        uchuva.start();
                        Intent intent = new Intent(Pregunta1frutas.this, Pregunta2frutas.class);
                        startActivity(intent);
                    }
                };
                Timer timer1 = new Timer();
                timer1.schedule(esperar1,1000);
                break;

            case R.id.imgMora:
                //txtPregunta1.setText("no como se te ocurre!!!");
                incorrecto.start();
                TimerTask esperar2 = new TimerTask() {
                    @Override
                    public void run() {

                        mora.start();

                    }
                };
                Timer timer2 = new Timer();
                timer2.schedule(esperar2,1000);
                break;

            case R.id.imgMortino:
                //txtPregunta1.setText("no como se te ocurre!!!");
                incorrecto.start();
                TimerTask esperar3 = new TimerTask() {
                    @Override
                    public void run() {

                        mortino.start();

                    }
                };
                Timer timer3 = new Timer();
                timer3.schedule(esperar3,1000);
                break;

            case R.id.imgFresas:
                //txtPregunta1.setText("no como se te ocurre!!!");
                incorrecto.start();
                TimerTask esperar4 = new TimerTask() {
                    @Override
                    public void run() {

                        fresa.start();

                    }
                };
                Timer timer4 = new Timer();
                timer4.schedule(esperar4,1000);
                break;
        }

    }
}