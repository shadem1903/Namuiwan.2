package com.example.namuiwan.erikadaniel;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;

public class Domesticoed extends AppCompatActivity implements View.OnClickListener {

    ImageView imgcuy, imgconejo,imggallina, imggato, imgperro, imgcaballo, imgvaca, imgovejo;
    TextView txcuy, txconejo, txgallina, txgato, txperro, txcaballo, txvaca, txovejo;
    MediaPlayer caballo, conejo, cuy, gallina, gato, ovejo, perro, vaca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_domesticoed);
        referenciar();
    }

    private void referenciar(){
        imgcuy= findViewById(R.id.imgcuy);
        imgcuy.setOnClickListener(this);
        imgconejo= findViewById(R.id.imgconejo);
        imgconejo.setOnClickListener(this);
        imggallina= findViewById(R.id.imggallina);
        imggallina.setOnClickListener(this);
        imggato= findViewById(R.id.imggato);
        imggato.setOnClickListener(this);
        imgperro= findViewById(R.id.imgperro);
        imgperro.setOnClickListener(this);
        imgvaca= findViewById(R.id.imgvaca);
        imgvaca.setOnClickListener(this);
        imgovejo= findViewById(R.id.imgovejo);
        imgovejo.setOnClickListener(this);
        imgcaballo= findViewById(R.id.imgcaballo);
        imgcaballo.setOnClickListener(this);
        txcuy= findViewById(R.id.txcuy);
        txconejo= findViewById(R.id.txconejo);
        txgallina= findViewById(R.id.txgallina);
        txgato= findViewById(R.id.txgato);
        txperro= findViewById(R.id.txperro);
        txcaballo= findViewById(R.id.txcaballo);
        txvaca= findViewById(R.id.txvaca);
        txovejo= findViewById(R.id.txovejo);


        //almacenar sonido en la variables
        caballo= MediaPlayer.create(this,R.raw.caballoed);
        conejo= MediaPlayer.create(this,R.raw.conejoed);
        cuy= MediaPlayer.create(this,R.raw.cuyed);
        gallina= MediaPlayer.create(this,R.raw.gallinaed);
        gato= MediaPlayer.create(this,R.raw.gatoed);
        ovejo= MediaPlayer.create(this,R.raw.ovejoed);
        perro= MediaPlayer.create(this,R.raw.perroed);
        vaca= MediaPlayer.create(this,R.raw.vacaed);



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.imgcuy:
                txcuy.setText("Pulkϴtsϴ");
                cuy.start();
                break;

            case R.id.imgconejo:
                txconejo.setText("Kalulapenku");
                conejo.start();
                break;

            case R.id.imggallina:
                txgallina.setText("Atwall");
                gallina.start();
                break;

            case R.id.imggato:
                txgato.setText("Mish");
                gato.start();
                break;

            case R.id.imgperro:
                txperro.setText("Wera");
                perro.start();
                break;

            case R.id.imgcaballo:
                txcaballo.setText("Kaulli");
                caballo.start();
                break;

            case R.id.imgvaca:
                txvaca.setText("Wara");
                vaca.start();
                break;

            case R.id.imgovejo:
                txovejo.setText("Upisha");
                ovejo.start();
                break;

        }

    }
}