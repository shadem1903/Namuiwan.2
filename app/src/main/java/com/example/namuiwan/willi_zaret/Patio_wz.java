package com.example.namuiwan.willi_zaret;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import com.example.namuiwan.R;


import androidx.appcompat.app.AppCompatActivity;

public class Patio_wz extends AppCompatActivity implements View.OnClickListener {
    ImageButton  imgBtnArtesania;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patio_wz);
        references();
    }

    public void references(){
        imgBtnArtesania=findViewById(R.id.imgBtnArtesanias);
        imgBtnArtesania.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imgBtnArtesanias:
                Toast.makeText(Patio_wz.this, "ah selecionado artesanias", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Patio_wz.this, Arsesania_wz.class);
                startActivity(intent);
                break;

        }

    }
}