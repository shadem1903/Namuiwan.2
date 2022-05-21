package com.example.namuiwan.yatulve;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;

public class Frio extends AppCompatActivity implements View.OnClickListener {
    ImageView imgUlluco,imgPapaColorada,imgPapaAmarilla,imgRepollo;
    MediaPlayer ulluco,papacolorada,papaamarilla,repollo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friove);
        referenciar();
    }
    private void referenciar() {
        imgUlluco = findViewById(R.id.imgUlluco);
        imgUlluco.setOnClickListener(this);
        imgPapaColorada = findViewById(R.id.imgPapaColorada);
        imgPapaColorada.setOnClickListener(this);
        imgPapaAmarilla   = findViewById(R.id.imgPapaAmarilla);
        imgPapaAmarilla.setOnClickListener(this);
        imgRepollo    = findViewById(R.id.imgRepollo);
        imgRepollo.setOnClickListener(this);
        //almacena sonido en la variable gallina
        ulluco    = MediaPlayer.create(this,R.raw.lau);
        papacolorada  = MediaPlayer.create(this,R.raw.pikoye);
        papaamarilla       = MediaPlayer.create(this,R.raw.maiye);
        repollo      = MediaPlayer.create(this,R.raw.tulurmon);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imgUlluco:
                ulluco.start();
                break;
            case R.id.imgPapaColorada:
                papacolorada.start();
                break;
            case R.id.imgPapaAmarilla:
                papaamarilla.start();
                break;
            case R.id.imgRepollo:
                repollo.start();
                break;
        }
    }
}