package com.example.namuiwan.AlvaroW;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;


public class Cocinaawf extends AppCompatActivity implements View.OnClickListener {

    ImageView imgconv,imgauto,imgespi,imgFogon;
    MediaPlayer fogon,autoridad,convivencia,espiritualidad;
    TextView texcocina;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cocinaawf);
        referencia();
    }
    private void referencia (){

        imgconv = findViewById(R.id.imgconv);
        imgconv.setOnClickListener(this);

        imgauto = findViewById(R.id.imgauto);
        imgauto.setOnClickListener(this);

        imgespi = findViewById(R.id.imgespi);
        imgespi.setOnClickListener(this);

        imgFogon=findViewById(R.id.imgFogon);
        imgFogon.setOnClickListener(this);


        texcocina = findViewById(R.id.texcocina);


        convivencia = MediaPlayer.create(this, R.raw.convivencia);
        autoridad = MediaPlayer.create(this, R.raw.autoridad);
        espiritualidad = MediaPlayer.create(this, R.raw.espiritualidad);
        fogon = MediaPlayer.create(this, R.raw.nakchakfogon);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.imgFogon:
                fogon.start();
                break;

            case R.id.imgconv:
                Toast.makeText(Cocinaawf.this, "A seleccionado convivencia ", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(Cocinaawf.this, Convivenciaawf.class);
                startActivity(intent1);
                convivencia.start();
                break;

            case R.id.imgauto:
                Toast.makeText(Cocinaawf.this, "A seleccionado autoridad", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(Cocinaawf.this, Autoridadawf.class);
                startActivity(intent2);
                autoridad.start();
                break;

            case R.id.imgespi:
                Toast.makeText(Cocinaawf.this, "A seleccionado Espiritualidad", Toast.LENGTH_SHORT).show();
                Intent intent3 = new Intent(Cocinaawf.this, Espiritualidadawf.class);
                startActivity(intent3);
                espiritualidad.start();
                break;


        }

    }
}