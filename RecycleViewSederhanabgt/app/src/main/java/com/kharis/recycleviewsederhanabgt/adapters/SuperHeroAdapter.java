package com.kharis.recycleviewsederhanabgt.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kharis.recycleviewsederhanabgt.R;
import com.kharis.recycleviewsederhanabgt.models.SuperHero;

import java.util.List;

public class SuperHeroAdapter extends RecyclerView.Adapter<SuperHeroAdapter.MyViewHolder> {
    List<SuperHero> heroList;

    public SuperHeroAdapter(List<SuperHero> heroList) {
        this.heroList = heroList;
    }

    @NonNull
    @Override
    public SuperHeroAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View superHeroView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_super_hero,parent,false);
        return new MyViewHolder(superHeroView);
    }

    @Override
    public void onBindViewHolder(@NonNull SuperHeroAdapter.MyViewHolder holder, int position) {
        SuperHero superHero = heroList.get(position);
        holder.heroName.setText(superHero.getHeroName());
    }

    @Override
    public int getItemCount() {
        return heroList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView heroName;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            heroName = itemView.findViewById(R.id.heroName);
        }
    }
}
