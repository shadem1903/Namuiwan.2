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

public class Manualeswz extends AppCompatActivity implements View.OnClickListener {
    ImageButton imgBtnMochila, imgBtnChumbe, imgBtnSombrero;
    MediaPlayer mochilawz,chumbewz,sombrerowz;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manualeswz);
        references();
    }

    public void references(){
        imgBtnChumbe=findViewById(R.id.imgBtnChumbe);
        imgBtnChumbe.setOnClickListener(this);
        imgBtnMochila=findViewById(R.id.imgBtnMochila);
        imgBtnMochila.setOnClickListener(this);
        imgBtnSombrero=findViewById(R.id.imgBtnSombrero);
        imgBtnSombrero.setOnClickListener(this);

        mochilawz=MediaPlayer.create(this,R.raw.mochila);
        chumbewz=MediaPlayer.create(this,R.raw.chumbe);
        sombrerowz=MediaPlayer.create(this,R.raw.sombrerowx);
    }

    public void alertMochila(){
        AlertDialog.Builder builder=new AlertDialog.Builder(Manualeswz.this);
        LayoutInflater inflater=getLayoutInflater();
        View view =inflater.inflate(R.layout.alertmochilawz,null);
        builder.setView(view);

        AlertDialog dialog=builder.create();
        dialog.show();

        TextView txt=view.findViewById(R.id.text_dialog_alafareria);
        txt.setText("MOCHILA    ");

        ImageButton btnAlert=view.findViewById(R.id.imgbtnAlertMochilawz);
        btnAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"saliste",Toast.LENGTH_SHORT).show();
                dialog.dismiss();

            }

        });
        ImageButton btnImgReproducirAnaco=view.findViewById(R.id.btnImgReproducirMochila);
        btnImgReproducirAnaco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mochilawz.start();
            }
        });

    }

    public void alertChumbe(){
        AlertDialog.Builder builder=new AlertDialog.Builder(Manualeswz.this);
        LayoutInflater inflater=getLayoutInflater();
        View view =inflater.inflate(R.layout.alertchumbewz,null);
        builder.setView(view);

        AlertDialog dialog=builder.create();
        dialog.show();

        TextView txt=view.findViewById(R.id.text_dialog_alafareria);
        txt.setText("CHUMBE");

        ImageButton btnAlert=view.findViewById(R.id.imgbtnAlertChumbewz);
        btnAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"saliste",Toast.LENGTH_SHORT).show();
                dialog.dismiss();

            }

        });
        ImageButton btnImgReproducirAnaco=view.findViewById(R.id.btnImgReproducirChumbe);
        btnImgReproducirAnaco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chumbewz.start();
            }
        });
    }

    public void alertSombrero(){
        AlertDialog.Builder builder=new AlertDialog.Builder(Manualeswz.this);
        LayoutInflater inflater=getLayoutInflater();
        View view =inflater.inflate(R.layout.alertsombrerowz,null);
        builder.setView(view);

        AlertDialog dialog=builder.create();
        dialog.show();

        TextView txt=view.findViewById(R.id.text_dialog_alafareria);
        txt.setText("CHUMBE");

        ImageButton btnAlert=view.findViewById(R.id.imgbtnAlertSombrerowz);
        btnAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"saliste",Toast.LENGTH_SHORT).show();
                dialog.dismiss();

            }

        });
        ImageButton btnImgReproducirAnaco=view.findViewById(R.id.btnImgReproducirSombrero);
        btnImgReproducirAnaco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sombrerowz.start();
            }
        });
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imgBtnMochila:
                mochilawz.start();
                alertMochila();
                break;

            case R.id.imgBtnChumbe:
                chumbewz.start();
                alertChumbe();
                break;

            case R.id.imgBtnSombrero:
                sombrerowz.start();
                alertSombrero();
                break;
        }

    }
}