package com.example.namuiwan.willi_zaret;

import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;

public class Alfareria_wz extends AppCompatActivity {
private ImageButton imgBtnPLato,imgBtnOlla,imgBtnPaila;
    MediaPlayer Solla, splato,strumpal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alfareria_wz);
        mostrarDialogo();
        mostrarOlla();
        mostrarPaila();
    }

private void mostrarDialogo(){
    splato=MediaPlayer.create(this,R.raw.splato);
    LayoutInflater image_alert_plato_wz=LayoutInflater.from(Alfareria_wz.this);
    final View vista=image_alert_plato_wz.inflate(R.layout.image_alert_plato_wz,null);
        imgBtnPLato= (ImageButton) findViewById(R.id.imgBtnPlato);
        imgBtnPLato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alerta = new AlertDialog.Builder(Alfareria_wz.this);
                splato.start();

                alerta.setMessage("")
                        .setCancelable(false)
                        .setPositiveButton("reproducir", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                splato.start();
                            }
                        })
                        .setNegativeButton("continuar", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        });

                AlertDialog titulo = alerta.create();
                titulo.setView(vista);

                titulo.setTitle("Alfarería");

                titulo.show();

            }
        });

}

    private void mostrarOlla(){
        Solla=MediaPlayer.create(this,R.raw.kotso);
        LayoutInflater image_alert_olla=LayoutInflater.from(Alfareria_wz.this);
        final View vista=image_alert_olla.inflate(R.layout.image_alert_olla,null);
        imgBtnPLato= (ImageButton) findViewById(R.id.imgBtnOlla);
        imgBtnPLato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alerta = new AlertDialog.Builder(Alfareria_wz.this);
                Solla.start();

                alerta.setMessage("")
                        .setCancelable(false)
                        .setPositiveButton("reproducir", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                Solla.start();
                            }
                        })
                        .setNegativeButton("continuar", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        });

                AlertDialog titulo = alerta.create();
                titulo.setView(vista);

                titulo.setTitle("Alarería");

                titulo.show();

            }
        });

    }

    private void mostrarPaila(){
        strumpal=MediaPlayer.create(this,R.raw.strumpal);
        LayoutInflater image_alert_paila_wz=LayoutInflater.from(Alfareria_wz.this);
        final View vista=image_alert_paila_wz.inflate(R.layout.image_alert_paila_wz,null);
        imgBtnPLato= (ImageButton) findViewById(R.id.imgBtnPaila);
        imgBtnPLato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alerta = new AlertDialog.Builder(Alfareria_wz.this);
                strumpal.start();

                alerta.setMessage("")
                        .setCancelable(false)
                        .setPositiveButton("reproducir", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                strumpal.start();
                            }
                        })
                        .setNegativeButton("continuar", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        });

                AlertDialog titulo = alerta.create();
                titulo.setView(vista);

                titulo.setTitle("Alfarería");

                titulo.show();

            }
        });

    }
}