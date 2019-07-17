package com.kharis.thefirstappself;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.kharis.thefirstappself.adapter.isiAdapter;
import com.kharis.thefirstappself.model.isiRV;

import java.util.ArrayList;
import java.util.List;

public class HomeScreen extends AppCompatActivity {
    RecyclerView recyclerView;

    List<isiRV> listnama = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        recyclerView = findViewById(R.id.rvIsi);

        isiRV namae = new isiRV("Petruk");
        //menambahkan hero ke listSuperHero
        listnama.add(namae);
        //membuat object hero baru
        namae = new isiRV("Gareng");
        //menambahkan hero baru ke listSuperhero
        listnama.add(namae);

        isiAdapter isiAdapter = new isiAdapter(listnama);
        recyclerView.setAdapter(isiAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
