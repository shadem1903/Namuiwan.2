package com.example.namuiwan.AlvaroW;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

import com.example.namuiwan.R;

public class Splashinicioawf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_inicioawf);


        llamar();

        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(Splashinicioawf.this, Cocinaawf.class);
                startActivity(intent);
                finish();
            }

        };
        Timer timer = new Timer();
        timer.schedule(tarea, 2000);
    }

    private void llamar() {

        Toast.makeText(this, "Nak chak - Cocina", Toast.LENGTH_SHORT);

    }
}