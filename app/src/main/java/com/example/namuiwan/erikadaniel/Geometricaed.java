package com.example.namuiwan.erikadaniel;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;
public class Geometricaed extends AppCompatActivity implements View.OnClickListener{

    ImageView imgcir,imgrecta,imgtri,imggrande,imgmedi,imgpeque;
    TextView txtcir,txtrecta,txttri,txtgrande,txtmedi,txtpeque;
    MediaPlayer circulo,recta,tria,grande,media,peque;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geometricaed);

        referenciar();
    }
    private void referenciar() {
        imgcir = findViewById(R.id.imgcir);
        imgcir.setOnClickListener(this);
        imgrecta = findViewById(R.id.imgrecta);
        imgrecta.setOnClickListener(this);
        imgtri = findViewById(R.id.imgtri);
        imgtri.setOnClickListener(this);
        imggrande = findViewById(R.id.imggrande);
        imggrande.setOnClickListener(this);
        imgmedi = findViewById(R.id.imgmedi);
        imgmedi.setOnClickListener(this);
        imgpeque = findViewById(R.id.imgpeque);
        imgpeque.setOnClickListener(this);

        txtcir= findViewById(R.id.txtcir);
        txtrecta= findViewById(R.id.txtrecta);
        txttri= findViewById(R.id.txttri);
        txtgrande= findViewById(R.id.txtgrande);
        txtmedi= findViewById(R.id.txtmedi);
        txtpeque= findViewById(R.id.txtpeque);

        //almacenar sonido en la variables


        circulo= MediaPlayer.create(this,R.raw.circuloed);
        recta=MediaPlayer.create(this,R.raw.rectaed);
        tria= MediaPlayer.create(this,R.raw.triaed);
        grande= MediaPlayer.create(this,R.raw.grandeed);
        media=MediaPlayer.create(this,R.raw.mediaed);
        peque= MediaPlayer.create(this,R.raw.pequeed);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.imgcir:
                txtcir.setText("circulo");
                circulo.start();
                break;

            case R.id.imgrecta:
                txtrecta.setText("rectángulo");
                recta.start();
                break;

            case R.id.imgtri:
                txttri.setText("triangulo");
                tria.start();
                break;

            case R.id.imggrande:
                txtgrande.setText("nuik");
                grande.start();
                break;

            case R.id.imgmedi:
                txtmedi.setText("netik");
                media.start();
                break;

            case R.id.imgpeque:
                txtpeque.setText("lamik");
                peque.start();
                break;
        }
    }
}