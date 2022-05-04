package com.example.namuiwan.yatulve;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;
public class Herramientas extends AppCompatActivity implements View.OnClickListener {
    ImageView imgAzadon, imgHacha,imgMachete,imgPala;
    TextView txtAzadon, txtHacha, txtMachete,txtPala;
    MediaPlayer azadon, hacha, machete,pala;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_herramientasve);
        referenciar();
    }
    private void referenciar(){
        imgAzadon=findViewById(R.id.imgAzadon);
        imgAzadon.setOnClickListener(this);
        imgHacha=findViewById(R.id.imgHacha);
        imgHacha.setOnClickListener(this);
        imgMachete=findViewById(R.id.imgMachete);
        imgMachete.setOnClickListener(this);
        imgPala=findViewById(R.id.imgPala);
        imgPala.setOnClickListener(this);

        txtAzadon=findViewById(R.id.txtAzadon);
        txtHacha=findViewById(R.id.txtHacha);
        txtMachete=findViewById(R.id.txtMachete);
        txtPala=findViewById(R.id.txtPala);

        //almacena sonido en la variable gallina
        azadon = MediaPlayer.create(this,R.raw.anchul_kachull);
        hacha = MediaPlayer.create(this,R.raw.walom);
        machete = MediaPlayer.create(this,R.raw.awinchi);
        pala = MediaPlayer.create(this,R.raw.ol_kachul);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imgAzadon:
                txtAzadon.setText("Anchul Kachull");
                azadon.start();
                break;
            case R.id.imgHacha:
                txtHacha.setText("Walϴm");
                hacha.start();
                break;
            case R.id.imgMachete:
                txtMachete.setText("Awinchi");
                machete.start();
                break;
            case R.id.imgPala:
                txtPala.setText("ϴl kachul");
                pala.start();
                break;
        }
    }
}