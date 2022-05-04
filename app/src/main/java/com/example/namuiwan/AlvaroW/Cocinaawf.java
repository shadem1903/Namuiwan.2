package com.example.namuiwan.AlvaroW;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;


public class Cocinaawf extends AppCompatActivity implements View.OnClickListener {

    Button butconvivencia, butautoridad, butespiritualidad;
    TextView textcocina;

    MediaPlayer fogon;
    MediaPlayer autoridad;
    MediaPlayer convivencia;
    MediaPlayer espiritualidad;

    ImageButton imgFogon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cocinaawf);
        referencia();
    }
    private void referencia (){
        butconvivencia = findViewById(R.id.butconvivencia);
        butconvivencia.setOnClickListener(this);
        convivencia = MediaPlayer.create(this, R.raw.convivencia);

        butautoridad = findViewById(R.id.butautoridad);
        butautoridad.setOnClickListener(this);
        autoridad = MediaPlayer.create(this, R.raw.autoridad);

        butespiritualidad = findViewById(R.id.butespiritualidad);
        butespiritualidad.setOnClickListener(this);
        espiritualidad = MediaPlayer.create(this, R.raw.espiritualidad);


        textcocina = findViewById(R.id.textcocina);
        imgFogon=findViewById(R.id.imgFogon);
        imgFogon.setOnClickListener(this);

        fogon = MediaPlayer.create(this, R.raw.nakchakfogon);


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.imgFogon:
                fogon.start();
                break;

            case R.id.butconvivencia:
                Toast.makeText(Cocinaawf.this, "A seleccionado convivencia ", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(Cocinaawf.this, Convivenciaawf.class);
                startActivity(intent1);
                convivencia.start();
                break;

            case R.id.butautoridad:
                Toast.makeText(Cocinaawf.this, "A seleccionado autoridad", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(Cocinaawf.this, Autoridadawf.class);
                startActivity(intent2);
                autoridad.start();
                break;

            case R.id.butespiritualidad:
                Toast.makeText(Cocinaawf.this, "A seleccionado Espiritualidad", Toast.LENGTH_SHORT).show();
                Intent intent3 = new Intent(Cocinaawf.this, Espiritualidadawf.class);
                startActivity(intent3);
                espiritualidad.start();
                break;


        }

    }
}