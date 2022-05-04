package com.example.namuiwan.yatulve;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;

public class Frutas extends AppCompatActivity implements View.OnClickListener {
    ImageView imgUchuvas, imgMora, imgMortino, imgFresas;
    TextView txtUchuvas, txtMora, txtMortino, txtFresas;
    MediaPlayer uchuvas, mora, mortino, fresas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frutasve);
        referenciar();
    }
    private void referenciar(){
        imgUchuvas= findViewById(R.id.imgUchuvas);
        imgUchuvas.setOnClickListener(this);
        imgMora=findViewById(R.id.imgMora);
        imgMora.setOnClickListener(this);
        imgMortino=findViewById(R.id.imgMortino);
        imgMortino.setOnClickListener(this);
        imgFresas=findViewById(R.id.imgFresas);
        imgFresas.setOnClickListener(this);

        txtUchuvas=findViewById(R.id.txtUchuvas);
        txtMora=findViewById(R.id.txtMora);
        txtMortino=findViewById(R.id.txtMortino);
        txtFresas=findViewById(R.id.txtFresas);

        uchuvas = MediaPlayer.create(this,R.raw.gallinaaa);
        mora = MediaPlayer.create(this,R.raw.venado);
        mortino = MediaPlayer.create(this,R.raw.gatoaa);
        fresas = MediaPlayer.create(this,R.raw.perroaa);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imgUchuvas:
                txtUchuvas.setText("Pϴtsϴ");
                uchuvas.start();
                break;
            case R.id.imgMora:
                txtMora.setText("Kaltrul");
                mora.start();
                break;
            case R.id.imgMortino:
                txtMortino.setText("Kamϴ");
                mortino.start();
                break;
            case R.id.imgFresas:
                txtFresas.setText("Nϴtrϴ Kaltrul");
                fresas.start();
                break;
        }
    }
}