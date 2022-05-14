package com.example.namuiwan.willi_zaret;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import com.example.namuiwan.R;


import androidx.appcompat.app.AppCompatActivity;

public class Arsesania_wz extends AppCompatActivity implements View.OnClickListener {
ImageButton imgBtnAlfareria,imgBtnManuales, imgBtnManualesTelar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arsesania_wz);
        references();
    }
    public void references(){
        imgBtnAlfareria=findViewById(R.id.imgBtnAlfareria);
        imgBtnAlfareria.setOnClickListener(this);

        imgBtnManuales=findViewById(R.id.imgBtnManuales);
        imgBtnManuales.setOnClickListener(this);

        imgBtnManualesTelar=findViewById(R.id.imgBtnManualesTelar);
        imgBtnManualesTelar.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imgBtnAlfareria:
                Toast.makeText(Arsesania_wz.this, "ah selecionado alfarería", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Arsesania_wz.this, Alfareria_wz.class);
                startActivity(intent);
                break;

            case R.id.imgBtnManuales:
                Toast.makeText(Arsesania_wz.this, "ah selecionado manuales", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(Arsesania_wz.this, Manuales_wz.class);
                startActivity(intent2);
                break;

            case R.id.imgBtnManualesTelar:
                Toast.makeText(Arsesania_wz.this, "ah selecionado a manuales en telar", Toast.LENGTH_SHORT).show();
                Intent intent3 = new Intent(Arsesania_wz.this, ManualesTelar_wz.class);
                startActivity(intent3);
                break;
        }
    }
}