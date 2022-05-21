package com.example.namuiwan.erikadaniel;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;

public class Familiaed extends AppCompatActivity implements View.OnClickListener{


    ImageView  imgabuela, imgabuelo, imgpapa, imgmama, imgnina, imgnino, imgbtnabuela, imgbtnabuelo, imgbtnpapa, imgbtnmama, imgbtnnino, imgbtnnina ;
    //TextView txfamiliar, txparentesco;

    MediaPlayer abuela, abuelo, papa, mama, hijo, hija;
    int valor=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_familiaed);
        referenciar();
    }

    private void referenciar(){


        imgabuela = findViewById(R.id.imgabuela);
        imgabuela.setOnClickListener(this);
        imgabuelo = findViewById(R.id.imgabuelo);
        imgabuelo.setOnClickListener(this);
        imgpapa = findViewById(R.id.imgpapa);
        imgpapa.setOnClickListener(this);
        imgmama = findViewById(R.id.imgmama);
        imgmama.setOnClickListener(this);
        imgnino = findViewById(R.id.imgnino);
        imgnino.setOnClickListener(this);
        imgnina = findViewById(R.id.imgnina);
        imgnina.setOnClickListener(this);

        imgbtnabuela = findViewById(R.id.imgbtnabuela);
        imgbtnabuela.setOnClickListener(this);
        imgbtnabuelo = findViewById(R.id.imgbtnabuelo);
        imgbtnabuelo.setOnClickListener(this);
        imgbtnpapa = findViewById(R.id.imgbtnpapa);
        imgbtnpapa.setOnClickListener(this);
        imgbtnmama = findViewById(R.id.imgbtnmama);
        imgbtnmama.setOnClickListener(this);
        imgbtnnino = findViewById(R.id.imgbtnnino);
        imgbtnnino.setOnClickListener(this);
        imgbtnnina = findViewById(R.id.imgbtnnina);
        imgbtnnina.setOnClickListener(this);






        //almacenamiento de sonidos en variables
        abuela= MediaPlayer.create(this,R.raw.abuelaed);
        abuelo= MediaPlayer.create(this,R.raw.abueloed);
        mama= MediaPlayer.create(this,R.raw.mamaed);
        papa= MediaPlayer.create(this,R.raw.papaed);
        hija= MediaPlayer.create(this,R.raw.hijaed);
        hijo= MediaPlayer.create(this,R.raw.hijoed);


    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.imgabuela:
                  switch (valor){
                      case 1:
                          imgabuela.setImageResource(R.drawable.abuelaedg);
                          imgbtnabuela.setVisibility(View.INVISIBLE);
                          valor = 0;
                          break;
                      case 0:
                          imgabuela.setImageResource(R.drawable.abuelaed);
                          imgbtnabuela.setVisibility(View.VISIBLE);
                          abuela.start();
                          valor = 1;
                          break;
                  }
                break;
            case R.id.imgabuelo:
                switch (valor) {
                    case 1:
                        imgabuelo.setImageResource(R.drawable.abueloedg);
                        imgbtnabuelo.setVisibility(View.INVISIBLE);
                        valor = 0;
                        break;
                    case 0:
                        imgabuelo.setImageResource(R.drawable.abueloed);
                        imgbtnabuelo.setVisibility(View.VISIBLE);
                        abuelo.start();
                        valor = 1;
                        break;
                }
                break;
            case R.id.imgmama:
                switch (valor) {
                    case 1:
                        imgmama.setImageResource(R.drawable.mamaedg);
                        imgbtnmama.setVisibility(View.INVISIBLE);
                        valor = 0;
                        break;
                    case 0:
                        imgmama.setImageResource(R.drawable.mamaed);
                        imgbtnmama.setVisibility(View.VISIBLE);
                        valor = 1;
                        mama.start();
                        break;
                }
                break;
            case R.id.imgpapa:
                switch (valor) {
                    case 1:
                        imgpapa.setImageResource(R.drawable.papaedg);
                        imgbtnpapa.setVisibility(View.INVISIBLE);
                        valor = 0;
                        break;
                    case 0:
                        imgpapa.setImageResource(R.drawable.papaed);
                        imgbtnpapa.setVisibility(View.VISIBLE);
                        papa.start();
                        valor = 1;
                        break;
                }
                break;
            case R.id.imgnino:
                switch (valor) {
                    case 1:
                        imgnino.setImageResource(R.drawable.ninoedg);
                        imgbtnnino.setVisibility(View.INVISIBLE);
                        valor = 0;
                        break;
                    case 0:
                        imgnino.setImageResource(R.drawable.ninoed);
                        imgbtnnino.setVisibility(View.VISIBLE);
                        valor = 1;
                        hijo.start();
                        break;
                }
                break;
            case R.id.imgnina:
                switch (valor) {
                    case 1:
                        imgnina.setImageResource(R.drawable.ninaedg);
                        imgbtnnina.setVisibility(View.INVISIBLE);
                        valor = 0;
                        break;
                    case 0:
                        imgnina.setImageResource(R.drawable.ninaed);
                        imgbtnnina.setVisibility(View.VISIBLE);
                        valor = 1;
                        hija.start();
                        break;
                }
                break;

        }


    }
}