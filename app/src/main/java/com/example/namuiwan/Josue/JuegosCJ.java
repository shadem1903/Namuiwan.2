package com.example.namuiwan.Josue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.namuiwan.Josue.ArrastrarFiguras.ArrastrarySoltar;
import com.example.namuiwan.Josue.rompeca.Home;
import com.example.namuiwan.R;

public class JuegosCJ extends AppCompatActivity {
    Button btnPuzzle,btnMemorie,btnAdivina,btnHabilidades,btnArrastrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juegos_cj);

        btnPuzzle = findViewById(R.id.btnPuzzle);

        btnPuzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Home.class);
                startActivityForResult(intent, 0);
            }
        });
        btnAdivina = findViewById(R.id.btnAdivina);
        btnAdivina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MenuAdivina.class);
                startActivityForResult(intent, 0);
            }
        });
        btnArrastrar = findViewById(R.id.btnArrastrar);
        btnArrastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ArrastrarySoltar.class);
                startActivity(intent);
            }
        });



    }
}