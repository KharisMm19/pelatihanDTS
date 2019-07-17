package com.kharis.thefirstappself.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kharis.thefirstappself.R;
import com.kharis.thefirstappself.model.isiRV;

import java.util.List;

public class isiAdapter extends RecyclerView.Adapter<isiAdapter.MyViewHolder> {
    List<isiRV> namaNama;

    public isiAdapter(List<isiRV> namaNama) {
        this.namaNama = namaNama;
    }

    @NonNull
    @Override
    public isiAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View superHeroView = layoutInflater.inflate(R.layout.isi_isian,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(superHeroView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull isiAdapter.MyViewHolder holder, int position) {
        isiRV name = namaNama.get(position);
        holder.isine.setText(name.getIsi());

    }

    @Override
    public int getItemCount() {
        return namaNama.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView isine;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            isine = itemView.findViewById(R.id.isine);
        }
    }
}
