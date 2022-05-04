
package com.example.namuiwan.AlvaroW;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;


public class Autoridadcomunidadawf extends AppCompatActivity implements View.OnClickListener {

    ImageView imgbttmama,imgbttntata;
    MediaPlayer mamawf,tataawf;
    TextView txtmama,txttata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.autoridadcomunidadawf);

        referencia();

    }

    private void referencia() {

        imgbttmama =findViewById(R.id.imgbttmama);
        imgbttmama.setOnClickListener(this);

        imgbttntata = findViewById(R.id.imgbttntata);
        imgbttntata.setOnClickListener(this);


        txtmama= findViewById(R.id.txtmama);
        txttata= findViewById(R.id.txttata);



        // almacenar sonidos
        mamawf = MediaPlayer.create(this, R.raw.mamawf);
        tataawf = MediaPlayer.create(this, R.raw.tataawf);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.imgbttmama:
                txtmama.setText("MAMA");
                mamawf.start();
                break;

            case R.id.imgbttntata:
                txttata.setText("TATA");
                tataawf.start();
                break;



        }


    }
}
