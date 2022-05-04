package com.example.namuiwan.erikadaniel;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;

public class
Cuerpoed extends AppCompatActivity implements View.OnClickListener {

    ImageView btncabeza, btnojos, btnorejas, btnnariz, btnboca, btnhombro, btnbrazo, btnmano, btncintura, btnpierna, btnrodilla, btnpie;
    TextView txparte, txcuerpo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuerpoed);
        referenciar();
    }

    private void referenciar(){
        txparte = findViewById(R.id.txparte);
        txcuerpo = findViewById(R.id.txcuerpo);
        btncabeza = findViewById(R.id.btncabeza);
        btncabeza.setOnClickListener(this);
        btnojos = findViewById(R.id.btnojos);
        btnojos.setOnClickListener(this);
        btnorejas = findViewById(R.id.btnorejas);
        btnorejas.setOnClickListener(this);
        btnnariz = findViewById(R.id.btnnariz);
        btnnariz = findViewById(R.id.btnnariz);
        btnnariz.setOnClickListener(this);
        btnboca = findViewById(R.id.btnboca);
        btnboca.setOnClickListener(this);
        btnhombro = findViewById(R.id.btnhombro);
        btnhombro.setOnClickListener(this);
        btnbrazo = findViewById(R.id.btnbrazo);
        btnbrazo.setOnClickListener(this);
        btnmano = findViewById(R.id.btnmano);
        btnmano.setOnClickListener(this);
        btncintura = findViewById(R.id.btncintura);
        btncintura.setOnClickListener(this);
        btnpierna = findViewById(R.id.btnpierna);
        btnpierna.setOnClickListener(this);
        btnrodilla = findViewById(R.id.btnrodilla);
        btnrodilla.setOnClickListener(this);
        btnpie = findViewById(R.id.btnpie);
        btnpie.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btncabeza:
                txparte.setText("Cabeza");
                txcuerpo.setText("Thur");
                break;

            case R.id.btnojos:
                txparte.setText("Ojos");
                txcuerpo.setText("Kap");
                break;

            case R.id.btnorejas:
                txparte.setText("Orejas");
                txcuerpo.setText("Kalu");
                break;

            case R.id.btnnariz:
                txparte.setText("Nariz");
                txcuerpo.setText("Kim");
                break;

            case R.id.btnboca:
                txparte.setText("Boca");
                txcuerpo.setText("Trik");
                break;

            case R.id.btnhombro:
                txparte.setText("Hombro");
                txcuerpo.setText("Kiltun");
                break;

            case R.id.btnbrazo:
                txparte.setText("Brazo");
                txcuerpo.setText("Kual");
                break;

            case R.id.btnmano:
                txparte.setText("Mano");
                txcuerpo.setText("Tasik");
                break;

            case R.id.btncintura:
                txparte.setText("Cintura");
                txcuerpo.setText("Sϴcham");
                break;

            case R.id.btnpierna:
                txparte.setText("Pierna");
                txcuerpo.setText("Srϴp");
                break;

            case R.id.btnrodilla:
                txparte.setText("Rodilla");
                txcuerpo.setText("tϴm");
                break;

            case R.id.btnpie:
                txparte.setText("Pie");
                txcuerpo.setText("Katsik");
                break;




        }

    }
}