package com.example.motorsportonline;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MiAdapter extends RecyclerView.Adapter<MiAdapter.MiViewHolder> {

    String N[], U[], H[], T[], C[];
    int A[];
    Context cont;

    public MiAdapter(Context ct, String nombre[], String ubicacion[], String horario[], String tipo_reparacion[], String contacto[], int imagen[]){
        this.cont = ct;
        this.N = nombre;
        this.U = ubicacion;
        this.H = horario;
        this.T = tipo_reparacion;
        this.C = contacto;
        this.A = imagen;
    }

    @NonNull
    @Override
    public MiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(cont);
        View v = inflater.inflate(R.layout.mifila,   parent   , false);
        return new MiViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MiViewHolder holder, int position) {
        holder.ta.setText(this.N[position]);
        holder.ub.setText(this.U[position]);
        holder.ho.setText(this.H[position]);
        holder.ti.setText(this.T[position]);
        holder.co.setText(this.C[position]);
        holder.im.setImageResource(A[position]);

    }

    @Override
    public int getItemCount() { return N.length;}


    public class MiViewHolder extends RecyclerView.ViewHolder {
        TextView ta, ub, ho, ti, co;
        ImageView im;

        public MiViewHolder(@NonNull View itemView) {
            super(itemView);
            ta = itemView.findViewById(R.id.talleres);
            ub = itemView.findViewById(R.id.ubicacion);
            ho = itemView.findViewById(R.id.horario);
            ti = itemView.findViewById(R.id.tipo_reparacion);
            co = itemView.findViewById(R.id.contacto);
            im = itemView.findViewById(R.id.imagen);
        }
    }
}
