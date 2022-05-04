package com.example.namuiwan.erikadaniel;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;
public class Familiaed extends AppCompatActivity implements View.OnClickListener {

    ImageView btnabuela, btnabuelo, btnhija, btnhijo, btnmama, btnpapa;
    TextView txfamiliar, txparentesco;
    MediaPlayer abuela, abuelo, papa, mama, hijo, hija;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_familiaed);
        referenciar();
    }

    private void referenciar(){
        txfamiliar = findViewById(R.id.txfamiliar);
        txparentesco = findViewById(R.id.txparentesco);
        btnabuela = findViewById(R.id.btnabuela);
        btnabuela.setOnClickListener(this);
        btnabuelo = findViewById(R.id.btnabuelo);
        btnabuelo.setOnClickListener(this);
        btnhija = findViewById(R.id.btnhija);
        btnhija.setOnClickListener(this);
        btnhijo = findViewById(R.id.btnhijo);
        btnhijo.setOnClickListener(this);
        btnmama = findViewById(R.id.btnmama);
        btnmama.setOnClickListener(this);
        btnpapa = findViewById(R.id.btnpapa);
        btnpapa.setOnClickListener(this);
        btnmama.setOnClickListener(this);

        //almacenamiento de sonidos en variables
        abuela= MediaPlayer.create(this,R.raw.abuelaed);
        abuelo= MediaPlayer.create(this,R.raw.abueloed);
        mama= MediaPlayer.create(this,R.raw.mamaed);
        papa= MediaPlayer.create(this,R.raw.papaed);
        hija= MediaPlayer.create(this,R.raw.hijaed);
        hijo= MediaPlayer.create(this,R.raw.hijoed);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnabuela:
                txfamiliar.setText("Abuela");
                txparentesco.setText("shura");
                abuela.start();
                break;

            case R.id.btnabuelo:
                txfamiliar.setText("Abuelo");
                txparentesco.setText("shur");
                abuelo.start();
                break;

            case R.id.btnhija:
                txfamiliar.setText("Hija");
                txparentesco.setText("nimpasr");
                hija.start();
                break;

            case R.id.btnhijo:
                txfamiliar.setText("Hijo");
                txparentesco.setText("nusrkai");
                hijo.start();
                break;

            case R.id.btnmama:
                txfamiliar.setText("Mamá");
                txparentesco.setText("Usri");
                mama.start();
                break;

            case R.id.btnpapa:
                txfamiliar.setText("Papá");
                txparentesco.setText("mϴskai");
                papa.start();
                break;


        }

    }
}