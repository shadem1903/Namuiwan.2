package com.example.namuiwan.willi_zaret;

import android.content.DialogInterface;
import android.media.MediaPlayer;
import com.example.namuiwan.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Manuales_wz extends AppCompatActivity {
ImageButton imgBtnJigra, imgBtnMochila,imgBtnSombrero;
MediaPlayer sjigra,smochila,ssombrero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manuales_wz);
        mostrarMochila();
        mostrarJigra();
        mostrarSombrero();
    }

    private void mostrarMochila(){
        smochila=MediaPlayer.create(this,R.raw.smochilawz);
        LayoutInflater image_alert_mochila_wz=LayoutInflater.from(Manuales_wz.this);
        final View vista=image_alert_mochila_wz.inflate(R.layout.image_alert_mochila_wz,null);
        imgBtnMochila= (ImageButton) findViewById(R.id.imgBtnMochila);
        imgBtnMochila.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alerta = new AlertDialog.Builder(Manuales_wz.this);
                smochila.start();

                alerta.setMessage("")
                        .setCancelable(false)
                        .setPositiveButton("reproducir", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                smochila.start();
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

                titulo.setTitle("Manuales");

                titulo.show();

            }
        });

    }

    private void mostrarJigra(){
        sjigra=MediaPlayer.create(this,R.raw.sjigrawz);
        LayoutInflater image_alert_jigra_wz=LayoutInflater.from(Manuales_wz.this);
        final View vista=image_alert_jigra_wz.inflate(R.layout.image_alert_jigra_wz,null);
        imgBtnJigra= (ImageButton) findViewById(R.id.imgBtnJigra);
        imgBtnJigra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alerta = new AlertDialog.Builder(Manuales_wz.this);
                sjigra.start();

                alerta.setMessage("")
                        .setCancelable(false)
                        .setPositiveButton("reproducir", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                sjigra.start();
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

                titulo.setTitle("Manuales");

                titulo.show();

            }
        });

    }

    private void mostrarSombrero(){
        ssombrero=MediaPlayer.create(this,R.raw.ssombrerowz);
        LayoutInflater image_alert_sombrero_wz=LayoutInflater.from(Manuales_wz.this);
        final View vista=image_alert_sombrero_wz.inflate(R.layout.image_alert_sombrero_wz,null);
        imgBtnSombrero= (ImageButton) findViewById(R.id.imgBtnSombrero);
        imgBtnSombrero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alerta = new AlertDialog.Builder(Manuales_wz.this);
                ssombrero.start();

                alerta.setMessage("")
                        .setCancelable(false)
                        .setPositiveButton("reproducir", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                ssombrero.start();
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

                titulo.setTitle("Manuales");

                titulo.show();

            }
        });

    }


}