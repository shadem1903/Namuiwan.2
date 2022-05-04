package com.example.namuiwan.erikadaniel;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;

public class Bosqueed extends AppCompatActivity implements View.OnClickListener {

    ImageView imgaliso,imgcastano,imgchilco,imgsalvia;
    TextView txtaliso,txcastano,txchilco,txsalvia;
    MediaPlayer aliso,castano,chilco,salvia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bosqueed);

        referenciar();
    }


    private void referenciar(){
        imgaliso= findViewById(R.id.imgaliso);
        imgaliso.setOnClickListener(this);

        imgcastano= findViewById(R.id.imgcastano);
        imgcastano.setOnClickListener(this);

        imgchilco= findViewById(R.id.imgchilco);
        imgchilco.setOnClickListener(this);

        imgsalvia= findViewById(R.id.imgsalvia);
        imgsalvia.setOnClickListener(this);

        txtaliso= findViewById(R.id.txtaliso);
        txcastano= findViewById(R.id.txcastano);
        txchilco= findViewById(R.id.txchilco);
        txsalvia= findViewById(R.id.txsalvia);

        //almacenar sonido en la variables

        aliso= MediaPlayer.create(this,R.raw.alisoed);
        castano=MediaPlayer.create(this,R.raw.castanoed);
        chilco= MediaPlayer.create(this,R.raw.chilcoed);
        salvia= MediaPlayer.create(this,R.raw.salviaed);



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.imgaliso:
                txtaliso.setText("pintsu");
                aliso.start();
                break;

            case R.id.imgcastano:
                txcastano.setText("pikϴtsutsik");
                castano.start();
                break;

            case R.id.imgchilco:
                txchilco.setText("kϴshak");
                chilco.start();
                break;

            case R.id.imgsalvia:
                txsalvia.setText("Isϴram");
                salvia.start();
                break;


        }

    }











}