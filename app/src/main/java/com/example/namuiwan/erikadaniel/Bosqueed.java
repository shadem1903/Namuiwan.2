package com.example.namuiwan.erikadaniel;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;

public class Bosqueed extends AppCompatActivity implements View.OnClickListener {

    ImageView imgflores, imgflores1, imguchuva, imgrosa, imgsuculenta, imgaliso, imgchilco, imgsalvia, imgbtnflores, imgbtnrosa, imgbtnsuculenta, imgbtnaliso, imgbtnchilco, imgbtnsalvia, imgbtnuchuva;
    MediaPlayer aliso,chilco,salvia, uchuva, rosa, suculenta,flores ;
    int valor=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bosqueed);

        referenciar();
    }


    private void referenciar(){

        imgflores= findViewById(R.id.imgflores);
        imgflores.setOnClickListener(this);
        imgflores1= findViewById(R.id.imgflores1);
        imgflores1.setOnClickListener(this);
        imguchuva= findViewById(R.id.imguchuva);
        imguchuva.setOnClickListener(this);
        imgrosa= findViewById(R.id.imgrosa);
        imgrosa.setOnClickListener(this);
        imgsuculenta= findViewById(R.id.imgsuculenta);
        imgsuculenta.setOnClickListener(this);
        imgaliso= findViewById(R.id.imgaliso);
        imgaliso.setOnClickListener(this);
        imgchilco= findViewById(R.id.imgchilco);
        imgchilco.setOnClickListener(this);
        imgsalvia= findViewById(R.id.imgsalvia);
        imgsalvia.setOnClickListener(this);

        imgbtnflores= findViewById(R.id.imgbtnflores);
        imgbtnflores.setOnClickListener(this);
        imgbtnuchuva= findViewById(R.id.imgbtnuchuva);
        imgbtnuchuva.setOnClickListener(this);
        imgbtnrosa= findViewById(R.id.imgbtnrosa);
        imgbtnrosa.setOnClickListener(this);
        imgbtnsuculenta= findViewById(R.id.imgbtnsuculenta);
        imgbtnsuculenta.setOnClickListener(this);
        imgbtnaliso= findViewById(R.id.imgbtnaliso);
        imgbtnaliso.setOnClickListener(this);
        imgbtnchilco= findViewById(R.id.imgbtnchilco);
        imgbtnchilco.setOnClickListener(this);
        imgbtnsalvia= findViewById(R.id.imgbtnsalvia);
        imgbtnsalvia.setOnClickListener(this);

        //almacenar sonido en la variables

        aliso= MediaPlayer.create(this,R.raw.alisoed);
        chilco= MediaPlayer.create(this,R.raw.chilcoed);
        salvia= MediaPlayer.create(this,R.raw.salviaed);
        uchuva= MediaPlayer.create(this,R.raw.uchuvaed);
        rosa= MediaPlayer.create(this,R.raw.rosaed);
        suculenta = MediaPlayer.create(this,R.raw.suculentased);
        flores= MediaPlayer.create(this,R.raw.flored);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.imgflores:
                switch (valor){
                    case 1:
                        imgflores.setImageResource(R.drawable.floresed4g);
                        imgbtnflores.setVisibility(View.INVISIBLE);
                        valor = 0;
                        break;
                    case 0:
                        imgflores.setImageResource(R.drawable.floresed4);
                        imgbtnflores.setVisibility(View.VISIBLE);
                        flores.start();
                        valor = 1;
                        break;
                }
                break;

            case R.id.imgflores1:
                switch (valor){
                    case 1:
                        imgflores1.setImageResource(R.drawable.floresed1g);
                        imgbtnflores.setVisibility(View.INVISIBLE);
                        valor = 0;
                        break;
                    case 0:
                        imgflores1.setImageResource(R.drawable.floresed1);
                        imgbtnflores.setVisibility(View.VISIBLE);
                        flores.start();
                        valor = 1;
                        break;
                }
                break;
            case R.id.imguchuva:
                switch (valor){
                    case 1:
                        imguchuva.setImageResource(R.drawable.uchuvaedg);
                        imgbtnuchuva.setVisibility(View.INVISIBLE);
                        valor = 0;
                        break;
                    case 0:
                        imguchuva.setImageResource(R.drawable.uchuvaed);
                        imgbtnuchuva.setVisibility(View.VISIBLE);
                        uchuva.start();
                        valor = 1;
                        break;
                }
                break;
            case R.id.imgrosa:
                switch (valor){
                    case 1:
                        imgrosa.setImageResource(R.drawable.rosaedg);
                        imgbtnrosa.setVisibility(View.INVISIBLE);
                        valor = 0;
                        break;
                    case 0:
                        imgrosa.setImageResource(R.drawable.rosaed);
                        imgbtnrosa.setVisibility(View.VISIBLE);
                        rosa.start();
                        valor = 1;
                        break;
                }
                break;
            case R.id.imgsuculenta:
                switch (valor){
                    case 1:
                        imgsuculenta.setImageResource(R.drawable.suculentasedg);
                        imgbtnsuculenta.setVisibility(View.INVISIBLE);
                        valor = 0;
                        break;
                    case 0:
                        imgsuculenta.setImageResource(R.drawable.suculentased);
                        imgbtnsuculenta.setVisibility(View.VISIBLE);
                        suculenta.start();
                        valor = 1;
                        break;
                }
                break;
            case R.id.imgaliso:
                switch (valor){
                    case 1:
                        imgaliso.setImageResource(R.drawable.alisoedg);
                        imgbtnaliso.setVisibility(View.INVISIBLE);
                        valor = 0;
                        break;
                    case 0:
                        imgaliso.setImageResource(R.drawable.alisoed);
                        imgbtnaliso.setVisibility(View.VISIBLE);
                        aliso.start();
                        valor = 1;
                        break;
                }
                break;
            case R.id.imgchilco:
                switch (valor){
                    case 1:
                        imgchilco.setImageResource(R.drawable.chilcoedg);
                        imgbtnchilco.setVisibility(View.INVISIBLE);
                        valor = 0;
                        break;
                    case 0:
                        imgchilco.setImageResource(R.drawable.chilcoed1);
                        imgbtnchilco.setVisibility(View.VISIBLE);
                        chilco.start();
                        valor = 1;
                        break;
                }
                break;
            case R.id.imgsalvia:
                switch (valor){
                    case 1:
                        imgsalvia.setImageResource(R.drawable.salviaedg);
                        imgbtnsalvia.setVisibility(View.INVISIBLE);
                        valor = 0;
                        break;
                    case 0:
                        imgsalvia.setImageResource(R.drawable.salviaed);
                        imgbtnsalvia.setVisibility(View.VISIBLE);
                        salvia.start();
                        valor = 1;
                        break;
                }
                break;




        }

    }











}