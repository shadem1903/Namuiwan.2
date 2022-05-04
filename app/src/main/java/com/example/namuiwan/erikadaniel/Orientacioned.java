package com.example.namuiwan.erikadaniel;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;

public class Orientacioned extends AppCompatActivity implements View.OnClickListener{

    ImageView imgpuerta,imgventana,imgbano,imglavadero,imgarriba,imgabajo,imgderecha,imgizquierda;
    TextView txtpuerta,txtventana,txtbano,txtlavadero,txtarriba,txtabajo,txtderecha,txtizquierda;
    MediaPlayer abajo,arriba,derecha,izquierda,bno,lava,puert,ventna;

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

        txtpuerta= findViewById(R.id.txtpuerta);
        txtventana= findViewById(R.id.txtventana);
        txtbano= findViewById(R.id.txtbano);
        txtlavadero= findViewById(R.id.txtlavadero);
        txtarriba= findViewById(R.id.txtarriba);
        txtabajo= findViewById(R.id.txtabajo);
        txtderecha= findViewById(R.id.txtderecha);
        txtizquierda= findViewById(R.id.txtizquierda);

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

            case R.id.imgbano:
                txtbano.setText("baño");
                bno.start();
                break;

            case R.id.imglavadero:
                txtlavadero.setText("lavadero");
                lava.start();
                break;

            case R.id.imgpuerta:
                txtpuerta.setText("puerta");
                puert.start();
                break;

            case R.id.imgventana:
                txtventana.setText("ventana");
                ventna.start();
                break;

            case R.id.imgarriba:
                txtarriba.setText("arriba");
                arriba.start();
                break;

            case R.id.imgabajo:
                txtabajo.setText("abajo");
                abajo.start();
                break;
            case R.id.imgderecha:
                txtderecha.setText("derecha");
                derecha.start();
                break;

            case R.id.imgizquierda:
                txtizquierda.setText("izquierda");
                izquierda.start();
                break;



        }


    }

































}