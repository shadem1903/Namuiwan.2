package com.example.namuiwan.yatulve;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;

public class Calido extends AppCompatActivity implements View.OnClickListener {
    ImageView imgPapaGuata,imgArracacha,imgMaiz,imgOca;
    TextView txtPapaGuata,txtArracacha, txtMaiz, txtOca;
    MediaPlayer papaguata,arracacha,maiz,oca;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calidove);
        referenciar();
    }
    private void referenciar(){
        imgPapaGuata = findViewById(R.id.imgPapaGuata);
        imgPapaGuata.setOnClickListener(this);
        imgArracacha = findViewById(R.id.imgArracacha);
        imgArracacha.setOnClickListener(this);
        imgMaiz   = findViewById(R.id.imgMaiz);
        imgMaiz.setOnClickListener(this);
        imgOca    = findViewById(R.id.imgOca);
        imgOca.setOnClickListener(this);

        txtPapaGuata   = findViewById(R.id.txtPapaGuata);
        txtArracacha = findViewById(R.id.txtArracacha);
        txtMaiz   = findViewById(R.id.txtMaiz);
        txtOca = findViewById(R.id.txtOca);
        //almacena sonido en la variable gallina
        papaguata = MediaPlayer.create(this,R.raw.wataye);
        arracacha = MediaPlayer.create(this,R.raw.oskowau);
        maiz = MediaPlayer.create(this,R.raw.pura);
        oca = MediaPlayer.create(this,R.raw.mishi);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imgPapaGuata:
                txtPapaGuata.setText("Wataye");
                papaguata.start();
                break;
            case R.id.imgArracacha:
                txtArracacha.setText("ϴskϴwau");
                arracacha.start();
                break;
            case R.id.imgMaiz:
                txtMaiz.setText("Pura");
                maiz.start();
                break;
            case R.id.imgOca:
                txtOca.setText("Mishi");
                oca.start();
                break;
        }
    }
}