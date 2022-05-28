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

public class ManualesTelarwz extends AppCompatActivity implements View.OnClickListener {
    ImageButton imgBtnRuana, imgBtnAnanco, imgBtnBufanda;
    MediaPlayer anaco,ruana,bufanda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manuales_telarwz);
        references();
    }
    public void references(){
        imgBtnAnanco=findViewById(R.id.imgBtnAnaco);
        imgBtnAnanco.setOnClickListener(this);
        imgBtnBufanda=findViewById(R.id.imgBtnBufanda);
        imgBtnBufanda.setOnClickListener(this);
        imgBtnRuana=findViewById(R.id.imgBtnRuana);
        imgBtnRuana.setOnClickListener(this);

        anaco=MediaPlayer.create(this,R.raw.anaco);
        ruana=MediaPlayer.create(this,R.raw.turi);
        bufanda=MediaPlayer.create(this,R.raw.bufanda);

    }
    private void alertAnaco(){
        AlertDialog.Builder builder=new AlertDialog.Builder(ManualesTelarwz.this);
        LayoutInflater inflater=getLayoutInflater();
        View view =inflater.inflate(R.layout.alertanacowz,null);
        builder.setView(view);

        AlertDialog dialog=builder.create();
        dialog.show();

        TextView txt=view.findViewById(R.id.text_dialog_alafareria);
        txt.setText("ANACO");

        ImageButton btnAlert=view.findViewById(R.id.imgbtnAlertAlfareriawz);
        btnAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"saliste",Toast.LENGTH_SHORT).show();
                dialog.dismiss();

            }

        });
        ImageButton btnImgReproducirAnaco=view.findViewById(R.id.btnImgReproducirAnaco);
        btnImgReproducirAnaco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                anaco.start();
            }
        });

    }


    private void alertRuana(){

        AlertDialog.Builder builder=new AlertDialog.Builder(ManualesTelarwz.this);
        LayoutInflater inflater=getLayoutInflater();
        View view =inflater.inflate(R.layout.alertruanawz,null);
        builder.setView(view);

        AlertDialog dialog=builder.create();
        dialog.show();

        TextView txt=view.findViewById(R.id.text_dialog_alafareria);
        txt.setText("RUANA");

        ImageButton btnAlert=view.findViewById(R.id.imgbtnAlertRuana);
        btnAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"saliste",Toast.LENGTH_SHORT).show();
                dialog.dismiss();

            }

        });
        ImageButton btnImgReproducirAnaco=view.findViewById(R.id.btnImgReproducirRuana);
        btnImgReproducirAnaco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ruana.start();
            }
        });

    }

    private void alertBufanda(){
        AlertDialog.Builder builder=new AlertDialog.Builder(ManualesTelarwz.this);
        LayoutInflater inflater=getLayoutInflater();
        View view =inflater.inflate(R.layout.alertbufandawz,null);
        builder.setView(view);

        AlertDialog dialog=builder.create();
        dialog.show();

        TextView txt=view.findViewById(R.id.text_dialog_alafareria);
        txt.setText("RUANA");

        ImageButton btnAlert=view.findViewById(R.id.imgbtnAlertBufandawz);
        btnAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"saliste",Toast.LENGTH_SHORT).show();
                dialog.dismiss();

            }

        });
        ImageButton btnImgReproducirAnaco=view.findViewById(R.id.btnImgReproducirBufanda);
        btnImgReproducirAnaco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bufanda.start();
            }
        });

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imgBtnAnaco:
                anaco.start();
                alertAnaco();
                break;

            case  R.id.imgBtnRuana:
                ruana.start();
                alertRuana();
                break;

            case R.id.imgBtnBufanda:
                bufanda.start();
                alertBufanda();
                break;
        }

    }
}