package com.example.androidybase;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class RecyclerViewAdaptadorClientes extends RecyclerView.Adapter<RecyclerViewAdaptadorClientes.ViewHolder> {

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_clientes, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;    }

    @Override
    public void onBindViewHolder(RecyclerViewAdaptadorClientes.ViewHolder holder, int position) {

    }
/*
    public RecyclerViewAdaptadorClientes(List<> productos) {
        //this.productos = productos;

    }
*/
    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView infoNom,infoApe,infoUser,infocontra,infoDire,infotel,infoEmail,infoFecha;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            infoNom = (TextView) itemView.findViewById(R.id.InfoNom);
            infoApe = (TextView) itemView.findViewById(R.id.infoApe);
            infoUser = (TextView) itemView.findViewById(R.id.InfoUser);
            infocontra = (TextView) itemView.findViewById(R.id.infoCon);
            infoDire = (TextView) itemView.findViewById(R.id.infoDire);
            infotel = (TextView) itemView.findViewById(R.id.infoTel);
            infoEmail = (TextView) itemView.findViewById(R.id.infoEmail);
            infoFecha = (TextView) itemView.findViewById(R.id.infoFecha);

        }
    }
}
