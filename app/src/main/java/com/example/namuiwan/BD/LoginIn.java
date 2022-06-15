package com.example.namuiwan.BD;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.namuiwan.BD.DBHELPER.DBhelper;
import com.example.namuiwan.Menued;
import com.example.namuiwan.R;

public class LoginIn extends AppCompatActivity {
    EditText Nick;
    Button Iniciar,Registro;
    DBhelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_in);
        referenciar();

        Iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nick = Nick.getText().toString();
                if(TextUtils.isEmpty(nick)){
                    Toast.makeText(LoginIn.this, "EL CAMPO ES REQUERIDO", Toast.LENGTH_SHORT).show();
                } else{
                    if(DB.checkusername(nick) == true){
                        Toast.makeText(LoginIn.this, "Bienvenido: "+nick, Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), Menued.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(LoginIn.this, "USUARIO NO ENCONTRADO", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        Registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Login.class);
                startActivity(intent);
            }
        });
    }
    public void referenciar(){
        Nick = findViewById(R.id.Nick);
        Iniciar = findViewById(R.id.Iniciar);
        Registro = findViewById(R.id.Registro);
        DB = new DBhelper(this);
    }
}