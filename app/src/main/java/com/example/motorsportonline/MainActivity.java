package com.example.motorsportonline;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    RecyclerView MiRecycler;
    String nombre[], ubicacion[], horario[], tipo_reparacion[], contacto[];
    int imagenes[] = {R.drawable.autoplanet,  R.drawable.parabrisas,  R.drawable.lubricar,  R.drawable.lubricentro,  R.drawable.frenos,  R.drawable.neumaticos};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MiRecycler = (RecyclerView) findViewById(R.id.MIRecicler);
        nombre = getResources().getStringArray(R.array.talleres);
        ubicacion = getResources().getStringArray(R.array.ubicacion);
        horario = getResources().getStringArray(R.array.horario);
        tipo_reparacion = getResources().getStringArray(R.array.tipo_reparacion);
        contacto = getResources().getStringArray(R.array.Contacto);

        MiAdapter MA = new MiAdapter(this, this.nombre, this.ubicacion, this.horario, this.tipo_reparacion, this.contacto, this.imagenes);
        MiRecycler.setAdapter(MA);
        MiRecycler.setLayoutManager(new LinearLayoutManager(this));
    }
}