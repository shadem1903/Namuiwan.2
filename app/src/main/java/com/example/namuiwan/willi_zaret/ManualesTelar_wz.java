package com.example.namuiwan.willi_zaret;

import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.example.namuiwan.R;
import android.widget.ImageButton;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class ManualesTelar_wz extends AppCompatActivity {
ImageButton imgBtnruana, imgBtnChumbe, imgBtnCorrea, imgBtnAnaco;
MediaPlayer scorrea, sruana, schumbe, sanaco;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manuales_telar_wz);
        mostrarCorrea();
        mostrarChumbe();
        mostrarAnaco();
        mostrarRuana();
    }
    private void mostrarCorrea(){
        scorrea=MediaPlayer.create(this,R.raw.scorrea);
        LayoutInflater image_alert_correa_wz=LayoutInflater.from(ManualesTelar_wz.this);
        final View vista=image_alert_correa_wz.inflate(R.layout.image_alert_correa_wz,null);
        imgBtnCorrea= (ImageButton) findViewById(R.id.imgBtnCorrea);
        imgBtnCorrea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alerta = new AlertDialog.Builder(ManualesTelar_wz.this);
                scorrea.start();

                alerta.setMessage("")
                        .setCancelable(false)
                        .setPositiveButton("reproducir", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                scorrea.start();
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

                titulo.setTitle("Manuales en telar");

                titulo.show();

            }
        });

    }

    private void mostrarChumbe(){
        schumbe=MediaPlayer.create(this,R.raw.schumbe);
        LayoutInflater image_alert_chumbe_wz=LayoutInflater.from(ManualesTelar_wz.this);
        final View vista=image_alert_chumbe_wz.inflate(R.layout.image_alert_chumbe_wz,null);
        imgBtnChumbe= (ImageButton) findViewById(R.id.imgBtnChumbe);
        imgBtnChumbe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alerta = new AlertDialog.Builder(ManualesTelar_wz.this);
                schumbe.start();

                alerta.setMessage("")
                        .setCancelable(false)
                        .setPositiveButton("reproducir", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                schumbe.start();
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

                titulo.setTitle("Manuales en telar");

                titulo.show();

            }
        });

    }

    private void mostrarAnaco(){
        sanaco=MediaPlayer.create(this,R.raw.sanaco);
        LayoutInflater image_alert_anaco_wz=LayoutInflater.from(ManualesTelar_wz.this);
        final View vista=image_alert_anaco_wz.inflate(R.layout.image_alert_anaco_wz,null);
        imgBtnAnaco= (ImageButton) findViewById(R.id.imgBtnAnanco);
        imgBtnAnaco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alerta = new AlertDialog.Builder(ManualesTelar_wz.this);
                sanaco.start();

                alerta.setMessage("")
                        .setCancelable(false)
                        .setPositiveButton("reproducir", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                sanaco.start();
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

                titulo.setTitle("Manuales en telar");

                titulo.show();

            }
        });

    }

    private void mostrarRuana(){
        sruana=MediaPlayer.create(this,R.raw.sruana);
        LayoutInflater image_alert_ruana_wz=LayoutInflater.from(ManualesTelar_wz.this);
        final View vista=image_alert_ruana_wz.inflate(R.layout.image_alert_ruana_wz,null);
        imgBtnruana= (ImageButton) findViewById(R.id.imgBtnRuana);
        imgBtnruana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alerta = new AlertDialog.Builder(ManualesTelar_wz.this);
                sruana.start();

                alerta.setMessage("")
                        .setCancelable(false)
                        .setPositiveButton("reproducir", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                sruana.start();
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

                titulo.setTitle("Manuales en telar");

                titulo.show();

            }
        });

    }
}