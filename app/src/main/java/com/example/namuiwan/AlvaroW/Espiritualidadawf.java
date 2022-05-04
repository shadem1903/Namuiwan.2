package com.example.namuiwan.AlvaroW;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;

public class Espiritualidadawf extends AppCompatActivity implements View.OnClickListener {
    ImageView imglaguna,imgmontana,imgpetro,imgojo;
    TextView txojo,txlaguna,txmontana,txpetro;
    MediaPlayer ojoawf,lagunaawf,montanaawf,petroawf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.espiritualidadawf);
        referenciar();
    }

    private void referenciar() {

        imgojo = findViewById(R.id.imgojo);
        imgojo.setOnClickListener(this);

        imglaguna = findViewById(R.id.imglaguna);
        imglaguna.setOnClickListener(this);

        imgmontana = findViewById(R.id.imgmontana);
        imgmontana.setOnClickListener(this);

        imgpetro = findViewById(R.id.imgpetro);
        imgpetro.setOnClickListener(this);

        txojo= findViewById(R.id.txojo);
        txlaguna= findViewById(R.id.txlaguna);
        txmontana= findViewById(R.id.txmontana);
        txpetro= findViewById(R.id.txpetro);

        // almacenar sonidos
        ojoawf = MediaPlayer.create(this, R.raw.ojoawf);
        lagunaawf = MediaPlayer.create(this, R.raw.lagunaawf);
        montanaawf = MediaPlayer.create(this, R.raw.montanaawf);
        petroawf = MediaPlayer.create(this, R.raw.petroawf);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.imgojo:
                txojo.setText("Ojos de Agua");
                ojoawf.start();
                break;

            case R.id.imglaguna:
                txlaguna.setText("Lagunas");
                lagunaawf.start();
                break;

            case R.id.imgmontana:
                txmontana.setText("Montañas");
                montanaawf.start();
                break;

            case R.id.imgpetro:
                txpetro.setText("petroglifos");
                petroawf.start();
                break;



        }


    }
}