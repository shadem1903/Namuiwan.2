package com.example.namuiwan.erikadaniel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;

public class Menued extends AppCompatActivity  implements View.OnClickListener  {

    Button btncasa, btncocina, btnpatio, btnhuerta, btnjugar, btningresar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menued);
        referenciar();
    }

    private void referenciar() {
        btncasa = findViewById(R.id.btncasa);
        btncasa.setOnClickListener(this);
        btncocina = findViewById(R.id.btncocina);
        btncocina.setOnClickListener(this);
        btnhuerta = findViewById(R.id.btnhuerta);
        btnhuerta.setOnClickListener(this);
        btnpatio = findViewById(R.id.btnpatio);
        btnpatio.setOnClickListener(this);
        btnjugar = findViewById(R.id.btnjugar);
        btnjugar.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.btncasa:
                Toast.makeText(Menued.this, "A seleccionado Casa", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(Menued.this, Casaed.class);
                startActivity(intent2);

                break;
            case R.id.btnpatio:
                Toast.makeText(Menued.this, "A seleccionado Patio", Toast.LENGTH_SHORT).show();
                Intent intent3 = new Intent(Menued.this, Sitioed.class);
                startActivity(intent3);

                break;
            case R.id.btnhuerta:
                Toast.makeText(Menued.this, "A seleccionado huerta", Toast.LENGTH_SHORT).show();
                Intent intent4 = new Intent(Menued.this, Huertaed.class);
                startActivity(intent4);






        }
    }






}
