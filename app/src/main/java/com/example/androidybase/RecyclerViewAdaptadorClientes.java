package com.example.androidybase;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdaptadorClientes extends RecyclerView.Adapter<RecyclerViewAdaptadorClientes.ViewHoldder> {

    @Override
    public RecyclerViewAdaptadorClientes.ViewHoldder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdaptadorClientes.ViewHoldder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHoldder extends RecyclerView.ViewHolder {
        public ViewHoldder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
