package com.example.namuiwan.erikadaniel;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;

public class Plantased extends AppCompatActivity implements View.OnClickListener {

    ImageView imgflor,imguchuva,imgrosa,imgsuculentas;
    TextView  txtflor,txtuchuva,txtrosa,txtsuculentas;
    MediaPlayer flor,uchuva,rosa,suculentas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plantased);

        referenciar();
    }
    private void referenciar() {
        imgflor = findViewById(R.id.imgflor);
        imgflor.setOnClickListener(this);

        imguchuva = findViewById(R.id.imguchuva);
        imguchuva.setOnClickListener(this);


        imgrosa = findViewById(R.id.imgrosa);
        imgrosa.setOnClickListener(this);

        imgsuculentas = findViewById(R.id.imgsuculentas);
        imgsuculentas.setOnClickListener(this);

        txtflor= findViewById(R.id.txtflor);
        txtuchuva= findViewById(R.id.txtuchuva);
        txtrosa= findViewById(R.id.txtrosa);
        txtsuculentas= findViewById(R.id.txtsuculentas);



        //almacenar sonido en la variables


        flor= MediaPlayer.create(this,R.raw.flored);
        uchuva=MediaPlayer.create(this,R.raw.uchuvaed);
        rosa= MediaPlayer.create(this,R.raw.rosaed);
        suculentas= MediaPlayer.create(this,R.raw.suculentased);

        }


    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.imgflor:
                txtflor.setText("U");
                flor.start();
                break;

            case R.id.imguchuva:
                txtuchuva.setText("Pϴtsϴ");
                uchuva.start();
                break;

            case R.id.imgrosa:
                txtrosa.setText("pikϴ U");
                rosa.start();
                break;

            case R.id.imgsuculentas:
                txtsuculentas.setText("Pshinkalu");
                suculentas.start();
                break;


        }

    }







































}