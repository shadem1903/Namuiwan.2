package com.example.namuiwan.erikadaniel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;

public class Tierraed extends AppCompatActivity implements View.OnClickListener {

    Button btnplantas,btnbosque;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tierraed);
        referenciar ();
    }


    private void referenciar() {
        btnplantas = findViewById(R.id.btnplantas);
        btnplantas.setOnClickListener(this);

        btnbosque = findViewById(R.id.btnbosque);
        btnbosque.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnbosque:
                Toast.makeText(Tierraed.this, "A seleccionado bosque", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Tierraed.this, Bosqueed.class);
                startActivity(intent);

                break;
            case R.id.btnplantas:
                Toast.makeText(Tierraed.this, "A seleccionado plantas", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(Tierraed.this, Plantased.class);
                startActivity(intent2);

                break;

        }


    }






}