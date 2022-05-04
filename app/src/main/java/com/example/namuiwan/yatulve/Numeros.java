package com.example.namuiwan.yatulve;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;

public class Numeros extends AppCompatActivity implements View.OnClickListener {

    ImageView imgCulebrita, imgSonido, imgUno, imgDos, imgTres, imgCuatro, imgCinco, imgSeis, imgSiete,
            imgOcho, imgNueve, imgDiez, imgOnce, imgDoce, imgTrece, imgCatorce, imgQuince, imgDiesciseis,
            imgDiescisiete, imgDiesciocho, imgDiescinueve, imgVeinte;
    TextView txtCulebrita;
    MediaPlayer serpiente, sonido, num1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numerosve);
        referenciar();
    }

    private void referenciar() {
        imgCulebrita = findViewById(R.id.imgCulebrita);
        imgCulebrita.setOnClickListener(this);
        imgSonido = findViewById(R.id.imgSonido);
        imgSonido.setOnClickListener(this);
        imgUno = findViewById(R.id.imgUno);
        imgUno.setOnClickListener(this);
        imgDos = findViewById(R.id.imgDos);
        imgDos.setOnClickListener(this);
        imgTres = findViewById(R.id.imgTres);
        imgTres.setOnClickListener(this);
        imgCuatro = findViewById(R.id.imgCuatro);
        imgCuatro.setOnClickListener(this);
        imgCinco = findViewById(R.id.imgCinco);
        imgCinco.setOnClickListener(this);
        imgSeis = findViewById(R.id.imgSeis);
        imgSeis.setOnClickListener(this);
        imgSiete = findViewById(R.id.imgSiete);
        imgSiete.setOnClickListener(this);
        imgOcho = findViewById(R.id.imgOcho);
        imgOcho.setOnClickListener(this);
        imgNueve = findViewById(R.id.imgNueve);
        imgNueve.setOnClickListener(this);
        imgDiez = findViewById(R.id.imgDiez);
        imgDiez.setOnClickListener(this);
        imgOnce = findViewById(R.id.imgOnce);
        imgOnce.setOnClickListener(this);
        imgDoce = findViewById(R.id.imgDoce);
        imgDoce.setOnClickListener(this);
        imgTrece = findViewById(R.id.imgTrece);
        imgTrece.setOnClickListener(this);
        imgCatorce = findViewById(R.id.imgCatorce);
        imgCatorce.setOnClickListener(this);
        imgQuince = findViewById(R.id.imgQuince);
        imgQuince.setOnClickListener(this);
        imgDiesciseis = findViewById(R.id.imgDiesciseis);
        imgDiesciseis.setOnClickListener(this);
        imgDiescisiete = findViewById(R.id.imgDiescisiete);
        imgDiescisiete.setOnClickListener(this);
        imgDiesciocho = findViewById(R.id.imgDiesciocho);
        imgDiesciocho.setOnClickListener(this);
        imgDiescinueve = findViewById(R.id.imgDiescinueve);
        imgDiescinueve.setOnClickListener(this);
        imgVeinte = findViewById(R.id.imgVeinte);
        imgVeinte.setOnClickListener(this);
        txtCulebrita = findViewById(R.id.txtCulebrita);
        txtCulebrita.setOnClickListener(this);

        sonido = MediaPlayer.create(this, R.raw.gatoaa);
        num1 = MediaPlayer.create(this, R.raw.perroaa);
        serpiente = MediaPlayer.create(this, R.raw.serpienteaa);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imgCulebrita:
                txtCulebrita.setText("Serpiente");
                serpiente.start();
                break;
            case R.id.imgSonido:
                txtCulebrita.setText("Sonido");
                sonido.start();
                break;
            case R.id.imgUno:
                txtCulebrita.setText("1");
                num1.start();
                break;
            case R.id.imgDos:
                txtCulebrita.setText(" 2 ");
                num1.start();
                break;
            case R.id.imgTres:
                txtCulebrita.setText(" 3 ");
                num1.start();
                break;
            case R.id.imgCuatro:
                txtCulebrita.setText(" 4 ");
                num1.start();
                break;
            case R.id.imgCinco:
                txtCulebrita.setText(" 5 ");
                num1.start();
                break;
            case R.id.imgSeis:
                txtCulebrita.setText(" 6 ");
                num1.start();
                break;
            case R.id.imgSiete:
                txtCulebrita.setText(" 7 ");
                num1.start();
                break;
            case R.id.imgOcho:
                txtCulebrita.setText(" 8 ");
                num1.start();
                break;
            case R.id.imgNueve:
                txtCulebrita.setText(" 9 ");
                num1.start();
                break;
            case R.id.imgDiez:
                txtCulebrita.setText(" 10 ");
                num1.start();
                break;
            case R.id.imgOnce:
                txtCulebrita.setText(" 11 ");
                num1.start();
                break;
            case R.id.imgDoce:
                txtCulebrita.setText(" 12 ");
                num1.start();
                break;
            case R.id.imgTrece:
                txtCulebrita.setText(" 13 ");
                num1.start();
                break;
            case R.id.imgCatorce:
                txtCulebrita.setText(" 14 ");
                num1.start();
                break;
            case R.id.imgQuince:
                txtCulebrita.setText(" 15 ");
                num1.start();
                break;
            case R.id.imgDiesciseis:
                txtCulebrita.setText(" 16 ");
                num1.start();
                break;
            case R.id.imgDiescisiete:
                txtCulebrita.setText(" 17 ");
                num1.start();
                break;
            case R.id.imgDiesciocho:
                txtCulebrita.setText(" 18 ");
                num1.start();
                break;
            case R.id.imgDiescinueve:
                txtCulebrita.setText(" 19 ");
                num1.start();
                break;
            case R.id.imgVeinte:
                txtCulebrita.setText(" 20 ");
                num1.start();
                break;
        }
    }
}