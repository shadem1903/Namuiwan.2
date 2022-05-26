package com.example.namuiwan.erikadaniel;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;

public class
Cuerpoed extends AppCompatActivity implements View.OnClickListener {

    ImageView imgabdomen, imgcabeza, imgbrazod, imgbrazoi, imgmanod, imgmanoi, impiernad, impiernai, imgpied, imgpiei, imgbtncabeza, imgbtnabdomen, imgbtnbrazo, imgbtnmano, imgbtnpierna, imgbtnpie;
    MediaPlayer cabeza, abdomen, brazo, mano, pierna, pie;
    int valor = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuerpoed);
        referenciar();
    }

    private void referenciar(){
        imgabdomen = findViewById(R.id.imgabdomen);
        imgabdomen.setOnClickListener(this);
        imgcabeza = findViewById(R.id.imgcabeza);
        imgcabeza.setOnClickListener(this);
        imgbrazod = findViewById(R.id.imgbrazod);
        imgbrazod.setOnClickListener(this);
        imgbrazoi = findViewById(R.id.imgbrazoi);
        imgbrazoi.setOnClickListener(this);
        imgmanod = findViewById(R.id.imgmanod);
        imgmanod.setOnClickListener(this);
        imgmanoi = findViewById(R.id.imgmanoi);
        imgmanoi.setOnClickListener(this);
        impiernad = findViewById(R.id.imgpiernad);
        impiernad.setOnClickListener(this);
        impiernai = findViewById(R.id.imgpiernai);
        impiernai.setOnClickListener(this);
        imgpied = findViewById(R.id.imgpied);
        imgpied.setOnClickListener(this);
        imgpiei = findViewById(R.id.imgpiei);
        imgpiei.setOnClickListener(this);

        imgbtncabeza = findViewById(R.id.imgbtncabeza);
        imgbtncabeza.setOnClickListener(this);
        imgbtnbrazo = findViewById(R.id.imgbtnbrazo);
        imgbtnbrazo.setOnClickListener(this);
        imgbtnmano = findViewById(R.id.imgbtnmano);
        imgbtnmano.setOnClickListener(this);
        imgbtnpierna = findViewById(R.id.imgbtnpierna);
        imgbtnpierna.setOnClickListener(this);
        imgbtnpie = findViewById(R.id.imgbtnpie);
        imgbtnpie.setOnClickListener(this);
        imgbtnabdomen = findViewById(R.id.imgbtnabdomen);
        imgbtnabdomen.setOnClickListener(this);

        abdomen = MediaPlayer.create(this, R.raw.abdomen);
        cabeza = MediaPlayer.create(this, R.raw.cabeza);
        brazo = MediaPlayer.create(this, R.raw.brazos);
        mano = MediaPlayer.create(this, R.raw.manos);
        pierna = MediaPlayer.create(this, R.raw.piernas);
        pie = MediaPlayer.create(this, R.raw.pies);



    }

    @Override
    public void onClick (View view){
        switch (view.getId()) {
            case R.id.imgcabeza:
                switch (valor) {
                    case 1:
                        imgcabeza.setImageResource(R.drawable.pcabezaedg);
                        imgbtncabeza.setVisibility(View.INVISIBLE);
                        valor = 0;
                        break;
                    case 0:
                        imgcabeza.setImageResource(R.drawable.pcabezaed);
                        imgbtncabeza.setVisibility(View.VISIBLE);
                        valor = 1;
                        cabeza.start();
                        break;
                }
                break;
            case R.id.imgabdomen:
                switch (valor) {
                    case 1:
                        imgabdomen.setImageResource(R.drawable.pabdomenedg);
                        imgbtnabdomen.setVisibility(View.INVISIBLE);
                        valor = 0;
                        break;
                    case 0:
                        imgabdomen.setImageResource(R.drawable.pabdomened);
                        imgbtnabdomen.setVisibility(View.VISIBLE);
                        valor = 1;
                        abdomen.start();
                        break;
                }
                break;
            case R.id.imgbrazod:
                switch (valor) {
                    case 1:
                        imgbrazod.setImageResource(R.drawable.pbrazodedg);
                        imgbtnbrazo.setVisibility(View.INVISIBLE);
                        valor = 0;
                        break;
                    case 0:
                        imgbrazod.setImageResource(R.drawable.pbrazoded);
                        imgbtnbrazo.setVisibility(View.VISIBLE);
                        valor = 1;
                        brazo.start();
                        break;
                }
                break;
            case R.id.imgbrazoi:
                switch (valor) {
                    case 1:
                        imgbrazoi.setImageResource(R.drawable.pbrazoiedg);
                        imgbtnbrazo.setVisibility(View.INVISIBLE);
                        valor = 0;
                        break;
                    case 0:
                        imgbrazoi.setImageResource(R.drawable.pbrazoied);
                        imgbtnbrazo.setVisibility(View.VISIBLE);
                        valor = 1;
                        brazo.start();
                        break;
                }
                break;

            case R.id.imgmanod:
                switch (valor) {
                    case 1:
                        imgmanod.setImageResource(R.drawable.pmanodedg);
                        imgbtnmano.setVisibility(View.INVISIBLE);
                        valor = 0;
                        break;
                    case 0:
                        imgmanod.setImageResource(R.drawable.pmanoded);
                        imgbtnmano.setVisibility(View.VISIBLE);
                        valor = 1;
                        mano.start();
                        break;
                }
                break;

            case R.id.imgmanoi:
                switch (valor) {
                    case 1:
                        imgmanoi.setImageResource(R.drawable.pmanoiedg);
                        imgbtnmano.setVisibility(View.INVISIBLE);
                        valor = 0;
                        break;
                    case 0:
                        imgmanoi.setImageResource(R.drawable.pmanoied);
                        imgbtnmano.setVisibility(View.VISIBLE);
                        valor = 1;
                        mano.start();
                        break;
                }
                break;

            case R.id.imgpiernad:
                switch (valor) {
                    case 1:
                        impiernad.setImageResource(R.drawable.piernadedg);
                        imgbtnpierna.setVisibility(View.INVISIBLE);
                        valor = 0;
                        break;
                    case 0:
                        impiernad.setImageResource(R.drawable.piernaded);
                        imgbtnpierna.setVisibility(View.VISIBLE);
                        valor = 1;
                        pierna.start();
                        break;
                }
                break;

            case R.id.imgpiernai:
                switch (valor) {
                    case 1:
                        impiernai.setImageResource(R.drawable.piernaiedg);
                        imgbtnpierna.setVisibility(View.INVISIBLE);
                        valor = 0;
                        break;
                    case 0:
                        impiernai.setImageResource(R.drawable.piernaied);
                        imgbtnpierna.setVisibility(View.VISIBLE);
                        valor = 1;
                        pierna.start();
                        break;
                }
                break;

            case R.id.imgpied:
                switch (valor) {
                    case 1:
                        imgpied.setImageResource(R.drawable.piededg);
                        imgbtnpie.setVisibility(View.INVISIBLE);
                        valor = 0;
                        break;
                    case 0:
                        imgpied.setImageResource(R.drawable.pieded);
                        imgbtnpie.setVisibility(View.VISIBLE);
                        valor = 1;
                        pie.start();
                        break;
                }
                break;

            case R.id.imgpiei:
                switch (valor) {
                    case 1:
                        imgpiei.setImageResource(R.drawable.pieiedg);
                        imgbtnpie.setVisibility(View.INVISIBLE);
                        valor = 0;
                        break;
                    case 0:
                        imgpiei.setImageResource(R.drawable.pieied);
                        imgbtnpie.setVisibility(View.VISIBLE);
                        valor = 1;
                        pie.start();
                        break;
                }
                break;









        }
    }


}