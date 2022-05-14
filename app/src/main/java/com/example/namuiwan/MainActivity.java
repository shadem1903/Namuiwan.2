package com.example.namuiwan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.namuiwan.AlvaroW.Splashinicioawf;
import com.example.namuiwan.Josue.JuegosCJ;
import com.example.namuiwan.Josue.rompeca.Home;
import com.example.namuiwan.erikadaniel.Casaed;
import com.example.namuiwan.willi_zaret.Principal_wz;
import com.example.namuiwan.yatulve.MenuHuerta;

public class MainActivity extends AppCompatActivity {
    Button btnJuegos, btncasa,btnPatio,btnAlvaro;
    ImageView imgHuerta;
    MediaPlayer huerta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnJuegos = findViewById(R.id.btnJuegos);
        btnJuegos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), JuegosCJ.class);
                startActivityForResult(intent, 0);
            }
        });

        btncasa = findViewById(R.id.btncasa);
        btncasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Casaed.class);
                startActivityForResult(intent, 0);
            }
        });

        huerta = MediaPlayer.create(this,R.raw.yatul);
        imgHuerta = findViewById(R.id.imgHuerta);
        imgHuerta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(), MenuHuerta.class);
                startActivityForResult(intent2, 0);
                huerta.start();
            }
        });

        btnPatio= findViewById(R.id.btnPatio);
        btnPatio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(), Principal_wz.class);
                startActivityForResult(intent2, 0);
                huerta.start();
            }
        });

        btnAlvaro = findViewById(R.id.btnAlvaro);
        btnAlvaro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(), Splashinicioawf.class);
                startActivityForResult(intent2, 0);

            }
        });

    }
}