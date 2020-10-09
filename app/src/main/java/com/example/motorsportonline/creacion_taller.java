package com.example.motorsportonline;

import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.widget.Button;
        import android.widget.EditText;

public class creacion_taller extends AppCompatActivity {
    EditText txt1, txt2, txt3, txt4, txt5;
    Button miboton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creacion_taller);
        txt1 = (EditText) findViewById(R.id.nombre);
        txt2 = (EditText) findViewById(R.id.direccion);
        txt3 = (EditText) findViewById(R.id.horario);
        txt4 = (EditText) findViewById(R.id.tipo_reparacion);
        txt5 = (EditText) findViewById(R.id.contacto);
        miboton = (Button) findViewById(R.id.boton_registro);



    }
}