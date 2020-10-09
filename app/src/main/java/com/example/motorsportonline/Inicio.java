package com.example.motorsportonline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Inicio extends AppCompatActivity {
    TextView mitexto;
    Button btn1, btn2, btn3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        mitexto = (TextView) findViewById(R.id.texto_titulo);
        btn1 = (Button) findViewById(R.id.boton_ingresar);
        btn2 = (Button) findViewById(R.id.boton_registrar_evento);
        btn3 = (Button) findViewById(R.id.boton_registrar_taller);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clic_boton_1();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             clic_boton_2();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clic_boton_3();
            }
        });
    }
    private void clic_boton_1()
    {
        Intent miIntent = new Intent(this,MiAdapter.class);
        startActivity(miIntent);
    }
    private void clic_boton_2()
    {
        Intent miIntent = new Intent(this,creacion_evento.class);
        startActivity(miIntent);
    }
    private void clic_boton_3()
    {
        Intent miIntent = new Intent(this,creacion_taller.class);
        startActivity(miIntent);
    }
}