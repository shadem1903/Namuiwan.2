package com.example.namuiwan.AlvaroW;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.example.namuiwan.R;


public class Autoridadawf extends AppCompatActivity implements View.OnClickListener {

    Button bttnsigui;
    ImageView imgbttni, imgbttnna;
    TextView txtni, txtna;
    MediaPlayer naawf, niaawf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.autoridadawf);

        referenciar();
    }
    private void referenciar() {

        imgbttni = findViewById(R.id.imgbttni);
        imgbttni.setOnClickListener(this);

        imgbttnna = findViewById(R.id.imgbttnna);
        imgbttnna.setOnClickListener(this);

        bttnsigui = findViewById(R.id.bttnsigui);
        bttnsigui.setOnClickListener(this);

        txtni = findViewById(R.id.txtni);
        txtna = findViewById(R.id.txtna);


        // almacenar sonidos

        naawf = MediaPlayer.create(this, R.raw.naawf);
        niaawf = MediaPlayer.create(this, R.raw.niaawf);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.imgbttni:
                txtni.setText("MADRE");
                niaawf.start();
                break;

            case R.id.imgbttnna:
                txtna.setText("PADRE");
                naawf.start();
                break;

            case R.id.bttnsigui:
                Toast.makeText(Autoridadawf.this, "A seleccionado Autoridad de la comunidad", Toast.LENGTH_SHORT).show();
                Intent intent4 = new Intent(Autoridadawf.this, Autoridadcomunidadawf.class);
                startActivity(intent4);
                break;
        }
    }
}