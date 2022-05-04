package com.example.namuiwan.yatulve;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;
public class Verduras extends AppCompatActivity implements View.OnClickListener{
    ImageView imgCebolla,imgZanahoria,imgTomate,imgPimiento;
    TextView txtCebolla,txtZanahoria, txtTomate, txtPimiento, txtVerdura;
    MediaPlayer cebolla,zanahoria,tomate,pimiento;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verdurasve);
        referenciar();

    }
    private void referenciar() {
        imgCebolla = findViewById(R.id.imgCebolla);
        imgCebolla.setOnClickListener(this);
        imgZanahoria = findViewById(R.id.imgZanahoria);
        imgZanahoria.setOnClickListener(this);
        imgTomate   = findViewById(R.id.imgTomate);
        imgTomate.setOnClickListener(this);
        imgPimiento    = findViewById(R.id.imgPimiento);
        imgPimiento.setOnClickListener(this);
        txtCebolla   = findViewById(R.id.txtCebolla);
        txtZanahoria = findViewById(R.id.txtZanahoria);
        txtTomate   = findViewById(R.id.txtTomate);
        txtPimiento = findViewById(R.id.txtPimiento);

        //almacena sonido en la variable gallina
        cebolla    = MediaPlayer.create(this,R.raw.gallinaaa);
        zanahoria  = MediaPlayer.create(this,R.raw.gallinaaa);
        tomate       = MediaPlayer.create(this,R.raw.gatoaa);
        pimiento      = MediaPlayer.create(this,R.raw.perroaa);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imgCebolla:
                txtCebolla.setText("Itrϴ Mϴn Tur");
                cebolla.start();
                break;
            case R.id.imgZanahoria:
                txtZanahoria.setText("Pikϴskϴ Wau");
                zanahoria.start();
                break;
            case R.id.imgTomate:
                txtTomate.setText("Nϴtrϴ Pikϴ Trul");
                tomate.start();
                break;
            case R.id.imgPimiento:
                txtPimiento.setText("Nϴtrϴ Kϴrϴ");
                pimiento.start();
                break;
        }
    }
}