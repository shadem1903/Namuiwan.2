package com.example.namuiwan.erikadaniel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;

public class Casaed extends AppCompatActivity implements View.OnClickListener {

    ImageView btntierra, btnfamilia, btncuerpo, btnorientacion, btngeometrica, btndomestico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_casaed);
        referenciar();
    }
    private void referenciar(){
        btntierra= findViewById(R.id.btntierra);
        btntierra.setOnClickListener(this);
        btnfamilia= findViewById(R.id.btnfamilia);
        btnfamilia.setOnClickListener(this);
        btncuerpo= findViewById(R.id.btncuerpo);
        btncuerpo.setOnClickListener(this);
        btnorientacion= findViewById(R.id.btnorientacion);
        btnorientacion.setOnClickListener(this);
        btngeometrica= findViewById(R.id.btngeometrica);
        btngeometrica.setOnClickListener(this);
        btndomestico= findViewById(R.id.btndomestico);
        btndomestico.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btntierra:
                Toast.makeText(Casaed.this, "A seleccionado  Tierra", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Casaed.this, Tierraed.class);
                startActivity(intent);
                break;

            case R.id.btnfamilia:
                Toast.makeText(Casaed.this, "A seleccionado Familia", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(Casaed.this, Familiaed.class);
                startActivity(intent1);
                break;

            case R.id.btncuerpo:
                Toast.makeText(Casaed.this, "A seleccionado Partes del Cuerpos", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(Casaed.this, Cuerpoed.class);
                startActivity(intent2);
                break;

            case R.id.btnorientacion:
                Toast.makeText(Casaed.this, "A seleccionado Orientacion", Toast.LENGTH_SHORT).show();
                Intent intent3 = new Intent(Casaed.this, Orientacioned.class);
                startActivity(intent3);
                break;

            case R.id.btngeometrica:
                Toast.makeText(Casaed.this, "A seleccionado Figuras Geometricas", Toast.LENGTH_SHORT).show();
                Intent intent4 = new Intent(Casaed.this, Geometricaed.class);
                startActivity(intent4);

                break;
            case R.id.btndomestico:
                Toast.makeText(Casaed.this, "A seleccionado Animales Domesticos", Toast.LENGTH_SHORT).show();
                Intent intent5 = new Intent(Casaed.this, Domesticoed.class);
                startActivity(intent5);

                break;



        }
    }
}