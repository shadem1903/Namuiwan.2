package com.example.namuiwan.AlvaroW;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namuiwan.R;

public class Convivenciaawf extends AppCompatActivity implements View.OnClickListener{

    ImageView imgbttconcejos ;
    Button bttntradu1,bttntradu2,bttntradu3,bttntradu4,bttnsaludos;
    TextView txtdis,txtres,txtamor,txtleal,txtconsejos;
    MediaPlayer isuawaminchip,isuamorop, isuaaship,isuaunip,saludosawf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.convivenciaawf);

        referenciar();

    }
    private void referenciar() {

        imgbttconcejos = findViewById(R.id.imgbttconcejos);
        imgbttconcejos.setOnClickListener(this);

        bttntradu1 = findViewById(R.id.bttntradu1);
        bttntradu1.setOnClickListener(this);

        bttntradu2 = findViewById(R.id.bttntradu2);
        bttntradu2.setOnClickListener(this);

        bttntradu3 = findViewById(R.id.bttntradu3);
        bttntradu3.setOnClickListener(this);

        bttntradu4 = findViewById(R.id.bttntradu4);
        bttntradu4.setOnClickListener(this);

        bttnsaludos = findViewById(R.id.bttnsaludos);
        bttnsaludos.setOnClickListener(this);



        txtdis = findViewById(R.id.txtdis);
        txtres = findViewById(R.id.txtres);
        txtamor = findViewById(R.id.txtamor);
        txtleal = findViewById(R.id.txtleal);
        txtconsejos = findViewById(R.id.txtconsejos);


        // almacenar sonidos

        isuawaminchip = MediaPlayer.create(this, R.raw.isuawaminchip);
        isuamorop = MediaPlayer.create(this, R.raw.isuamorop);
        isuaaship = MediaPlayer.create(this, R.raw.isuaaship);
        isuaunip = MediaPlayer.create(this, R.raw.isuaunip);
        saludosawf  = MediaPlayer.create(this, R.raw.saludosawf);


    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.bttntradu1:
                txtdis.setText("discreto y honesto");
                isuawaminchip.start();
                break;

            case R.id.bttntradu2:
                txtleal.setText("lealtad y respeto");
                isuamorop.start();
                break;

            case R.id.bttntradu3:
                txtamor.setText("Integridad, amor y amistad");
                isuaaship.start();
                break;

            case R.id.bttntradu4:
                txtres.setText("Responsabilidad, justicia y tolerancia");
                isuaunip.start();
                break;

            case R.id.bttnsaludos:
                Toast.makeText(Convivenciaawf.this, "A seleccionado Saludos", Toast.LENGTH_SHORT).show();
                Intent intent3 = new Intent(Convivenciaawf.this,Saludosawf.class);
                startActivity(intent3);
                saludosawf.start();
                break;



        }


    }



}