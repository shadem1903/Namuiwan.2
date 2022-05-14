package com.example.namuiwan.willi_zaret;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import com.example.namuiwan.R;


import androidx.appcompat.app.AppCompatActivity;

public class Principal_wz extends AppCompatActivity implements View.OnClickListener {
ImageButton imgBtnPatio, imgBtnArtesania;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_wz);
        references();
    }
    public void references(){
        imgBtnPatio=findViewById(R.id.imgBtnPatio);
        imgBtnPatio.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imgBtnPatio:
                Toast.makeText(Principal_wz.this, "ah selecionado patio", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Principal_wz.this, Patio_wz.class);
                startActivity(intent);
                break;

        }
    }
}