package com.example.namuiwan.willi_zaret;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import com.example.namuiwan.R;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Alfareriawz extends AppCompatActivity implements View.OnClickListener {
ImageButton imgBtnOlla, imgBtnPlato, imgBtnPaila;
MediaPlayer olla,plato,paila;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alfareriawz);
        references();

    }

    public void references(){
        imgBtnOlla=findViewById(R.id.imgBtnOlla);
        imgBtnOlla.setOnClickListener(this);

        imgBtnPaila=findViewById(R.id.imgBtntnPaila);
        imgBtnPaila.setOnClickListener(this);

        imgBtnPlato=findViewById(R.id.imgBtnPlato);
        imgBtnPlato.setOnClickListener(this);

        olla=MediaPlayer.create(this,R.raw.olla);
        paila=MediaPlayer.create(this,R.raw.paila);
        plato=MediaPlayer.create(this,R.raw.nintak);


    }


    private void alertOlla(){
        AlertDialog.Builder builder=new AlertDialog.Builder(Alfareriawz.this);
        LayoutInflater inflater=getLayoutInflater();
        View view =inflater.inflate(R.layout.alertolla,null);
        builder.setView(view);

        AlertDialog dialog=builder.create();
        dialog.show();

        TextView txt=view.findViewById(R.id.text_dialog_alafareria);
        txt.setText("OLLA");
        ImageButton btnAlert=view.findViewById(R.id.imgbtnAlertOllawz);
        btnAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"saliste",Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });
        ImageButton btnImgReproducirPlato=view.findViewById(R.id.btnImgReproducirOlla);
        btnImgReproducirPlato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                olla.start();
            }
        });
    }

    private void  alertPlato(){
        AlertDialog.Builder builder=new AlertDialog.Builder(Alfareriawz.this);
        LayoutInflater inflater=getLayoutInflater();
        View view =inflater.inflate(R.layout.alertplatowz,null);
        builder.setView(view);

        AlertDialog dialog=builder.create();
        dialog.show();

        TextView txt=view.findViewById(R.id.text_dialog_alafareria);
        txt.setText("PLATO");
        ImageButton btnAlert=view.findViewById(R.id.imgbtnAlertPlatowz);
        btnAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"saliste",Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });
        ImageButton btnImgReproducirPlato=view.findViewById(R.id.btnImgReproducirPlato);
        btnImgReproducirPlato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                plato.start();
            }
        });
    }

    private void alertPaila(){
        AlertDialog.Builder builder=new AlertDialog.Builder(Alfareriawz.this);
        LayoutInflater inflater=getLayoutInflater();
        View view =inflater.inflate(R.layout.alertpaila,null);
        builder.setView(view);

        AlertDialog dialog=builder.create();
        dialog.show();

        TextView txt=view.findViewById(R.id.text_dialog_alafareria);
        txt.setText("PLATO");
        ImageButton btnAlert=view.findViewById(R.id.imgbtnAlertPailawz);
        btnAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"saliste",Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });
        ImageButton btnImgReproducirPlato=view.findViewById(R.id.btnImgReproducirPaila);
        btnImgReproducirPlato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                paila.start();
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.imgBtnOlla:
                olla.start();
                alertOlla();
                break;

            case R.id.imgBtntnPaila:
                plato.start();
                alertPlato();

                break;

            case R.id.imgBtnPlato:
                paila.start();
                alertPaila();
                break;
        }
    }
}