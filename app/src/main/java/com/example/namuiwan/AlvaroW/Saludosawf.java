package com.example.namuiwan.AlvaroW;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;

public class Saludosawf extends AppCompatActivity implements View.OnClickListener{

    ImageView imgcalido,imgfrio,imgtarde,imgnoche;
    Button btnsaludoss;
    TextView txcalido,txfrio,txtarde,txnoche,txtsaludo;
    MediaPlayer pachito,pishinto,mawan,yemkon,saludosawf;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludosawf);

        referenciar();

    }

    private void referenciar() {

        imgcalido = findViewById(R.id.imgcalido);
        imgcalido.setOnClickListener(this);

        imgfrio = findViewById(R.id.imgfrio);
        imgfrio.setOnClickListener(this);

        imgtarde = findViewById(R.id.imgtarde);
        imgtarde.setOnClickListener(this);

        imgnoche = findViewById(R.id.imgnoche);
        imgnoche.setOnClickListener(this);

        btnsaludoss = findViewById(R.id.btnsaludoss);
        btnsaludoss.setOnClickListener(this);



        txcalido = findViewById(R.id.txcalido);
        txfrio = findViewById(R.id.txfrio);
        txtarde = findViewById(R.id.txtarde);
        txnoche = findViewById(R.id.txnoche);
        txtsaludo = findViewById(R.id.txtsaludo);


        // almacenar sonidos

        pachito = MediaPlayer.create(this, R.raw.pachito);
        pishinto = MediaPlayer.create(this, R.raw.pishinto);
        mawan = MediaPlayer.create(this, R.raw.mawan);
        yemkon = MediaPlayer.create(this, R.raw.yemkon);
        saludosawf= MediaPlayer.create(this, R.raw.saludosawf);




    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.imgcalido:
                txcalido.setText("Clima Calido ");
                pachito.start();
                break;

            case R.id.imgfrio:
                txfrio.setText("Clima Frio");
                pishinto.start();
                break;

            case R.id.imgtarde:
                txtarde.setText("Buenas Tardes");
                mawan.start();
                break;

            case R.id.imgnoche:
                txnoche.setText("Buenas Noches");
                yemkon.start();
                break;

            case R.id.btnsaludoss:
                txtsaludo.setText("Saludos Y Clima");
                saludosawf.start();
                break;


        }


    }






}