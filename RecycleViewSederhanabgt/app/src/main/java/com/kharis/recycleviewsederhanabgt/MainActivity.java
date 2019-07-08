package com.kharis.recycleviewsederhanabgt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.kharis.recycleviewsederhanabgt.adapters.SuperHeroAdapter;
import com.kharis.recycleviewsederhanabgt.models.SuperHero;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvSuperHero;
    List<SuperHero> heroList = new ArrayList<>();
    SuperHeroAdapter superHeroAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvSuperHero = findViewById(R.id.rv_super_hero);
        superHeroAdapter = new SuperHeroAdapter(heroList);

        populateData();

        //set adapter untuk resyclerview
        rvSuperHero.setAdapter(superHeroAdapter);
        //set layout resyclerview
        rvSuperHero.setLayoutManager(new LinearLayoutManager(this));
    }

    private void populateData(){
        SuperHero hero = new SuperHero("Batman");
        heroList.add(hero);

        hero = new SuperHero("Iron Man");
        heroList.add(hero);

        hero = new SuperHero("Mermaid Man");
        heroList.add(hero);

        hero = new SuperHero("Bernacle Boy");
        heroList.add(hero);

        hero = new SuperHero("Super Man");
        heroList.add(hero);

        hero = new SuperHero("Spider Man");
        heroList.add(hero);

        hero = new SuperHero("Pac Man");
        heroList.add(hero);

        hero = new SuperHero("Kochenk Oren");
        heroList.add(hero);

        hero = new SuperHero("Slender Man");
        heroList.add(hero);

        hero = new SuperHero("Ultra Man");
        heroList.add(hero);

        hero = new SuperHero("Saita Man");
        heroList.add(hero);

        hero = new SuperHero("Iron Man");
        heroList.add(hero);

        hero = new SuperHero("Iron Man");
        heroList.add(hero);

        hero = new SuperHero("Mermaid Man");
        heroList.add(hero);

        hero = new SuperHero("Bernacle Boy");
        heroList.add(hero);

        hero = new SuperHero("Super Man");
        heroList.add(hero);

        hero = new SuperHero("Spider Man");
        heroList.add(hero);

        hero = new SuperHero("Iron Man");
        heroList.add(hero);

        hero = new SuperHero("Iron Man");
        heroList.add(hero);

        hero = new SuperHero("Iron Man");
        heroList.add(hero);

        hero = new SuperHero("Iron Man");
        heroList.add(hero);

        hero = new SuperHero("Iron Man");
        heroList.add(hero);

        hero = new SuperHero("Iron Man");
        heroList.add(hero);
    }
}
