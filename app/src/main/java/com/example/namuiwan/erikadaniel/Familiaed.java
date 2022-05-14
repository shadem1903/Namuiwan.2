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


    ImageView  imgabuela, imgabuelo, imgpapa, imgmama, imgnina, imgnino, mensaje1;
    //TextView txfamiliar, txparentesco;
    TextView msjabuela, msjabuela1, msjabuelo, msjabuelo1, msjpapa, msjpapa1, msjmama, msjmama1, msjnino, msjnino1, msjnina, msjnina1;
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
        mensaje1 = findViewById(R.id.mensaje1);
        msjabuela = findViewById(R.id.msjabuela);
        msjabuela1 = findViewById(R.id.msjabuela1);
        msjabuelo = findViewById(R.id.msjabuelo);
        msjabuelo1 = findViewById(R.id.msjabuelo1);
        msjmama = findViewById(R.id.msjmama);
        msjmama1 = findViewById(R.id.msjmama1);
        msjpapa = findViewById(R.id.msjpapa);
        msjpapa1 = findViewById(R.id.msjpapa1);
        msjnino = findViewById(R.id.msjnino);
        msjnino1 = findViewById(R.id.msjnino1);
        msjnina = findViewById(R.id.msjnina);
        msjnina1 = findViewById(R.id.msjnina1);





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
                          mensaje1.setVisibility(View.INVISIBLE);
                          msjabuela.setVisibility(View.INVISIBLE);
                          msjabuela1.setVisibility(View.INVISIBLE);
                          valor = 0;
                          break;
                      case 0:
                          imgabuela.setImageResource(R.drawable.abuelaed);
                          mensaje1.setVisibility(View.VISIBLE);
                          mensaje1.setVisibility(View.VISIBLE);
                          msjabuela.setVisibility(View.VISIBLE);
                          msjabuela1.setVisibility(View.VISIBLE);
                          valor = 1;
                          break;

                  }
                break;
            case R.id.imgabuelo:
                switch (valor) {
                    case 1:
                        imgabuelo.setImageResource(R.drawable.abueloedg);
                        mensaje1.setVisibility(View.INVISIBLE);
                        msjabuelo.setVisibility(View.INVISIBLE);
                        msjabuelo1.setVisibility(View.INVISIBLE);
                        valor = 0;
                        break;
                    case 0:
                        imgabuelo.setImageResource(R.drawable.abueloed);
                        mensaje1.setVisibility(View.VISIBLE);
                        mensaje1.setVisibility(View.VISIBLE);
                        msjabuelo.setVisibility(View.VISIBLE);
                        msjabuelo1.setVisibility(View.VISIBLE);
                        valor = 1;
                        break;
                }
                break;
            case R.id.imgmama:
                switch (valor) {
                    case 1:
                        imgmama.setImageResource(R.drawable.mamaedg);
                        mensaje1.setVisibility(View.INVISIBLE);
                        msjmama.setVisibility(View.INVISIBLE);
                        msjmama1.setVisibility(View.INVISIBLE);
                        valor = 0;
                        break;
                    case 0:
                        imgmama.setImageResource(R.drawable.mamaed);
                        mensaje1.setVisibility(View.VISIBLE);
                        mensaje1.setVisibility(View.VISIBLE);
                        msjmama.setVisibility(View.VISIBLE);
                        msjmama1.setVisibility(View.VISIBLE);
                        valor = 1;
                        break;
                }
                break;
            case R.id.imgpapa:
                switch (valor) {
                    case 1:
                        imgpapa.setImageResource(R.drawable.papaedg);
                        mensaje1.setVisibility(View.INVISIBLE);
                        msjpapa.setVisibility(View.INVISIBLE);
                        msjpapa1.setVisibility(View.INVISIBLE);
                        valor = 0;
                        break;
                    case 0:
                        imgpapa.setImageResource(R.drawable.papaed);
                        mensaje1.setVisibility(View.VISIBLE);
                        mensaje1.setVisibility(View.VISIBLE);
                        msjpapa.setVisibility(View.VISIBLE);
                        msjpapa1.setVisibility(View.VISIBLE);
                        valor = 1;
                        break;
                }
                break;
            case R.id.imgnino:
                switch (valor) {
                    case 1:
                        imgnino.setImageResource(R.drawable.ninoedg);
                        mensaje1.setVisibility(View.INVISIBLE);
                        msjnino.setVisibility(View.INVISIBLE);
                        msjnino1.setVisibility(View.INVISIBLE);
                        valor = 0;
                        break;
                    case 0:
                        imgnino.setImageResource(R.drawable.ninoed);
                        mensaje1.setVisibility(View.VISIBLE);
                        mensaje1.setVisibility(View.VISIBLE);
                        msjnino.setVisibility(View.VISIBLE);
                        msjnino1.setVisibility(View.VISIBLE);
                        valor = 1;
                        break;
                }
                break;
            case R.id.imgnina:
                switch (valor) {
                    case 1:
                        imgnina.setImageResource(R.drawable.ninaedg);
                        mensaje1.setVisibility(View.INVISIBLE);
                        msjnina.setVisibility(View.INVISIBLE);
                        msjnina1.setVisibility(View.INVISIBLE);
                        valor = 0;
                        break;
                    case 0:
                        imgnina.setImageResource(R.drawable.ninaed);
                        mensaje1.setVisibility(View.VISIBLE);
                        mensaje1.setVisibility(View.VISIBLE);
                        msjnina.setVisibility(View.VISIBLE);
                        msjnina1.setVisibility(View.VISIBLE);
                        valor = 1;
                        break;
                }
                break;

        }


    }
}