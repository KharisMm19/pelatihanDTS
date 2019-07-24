package com.kharis.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MockUpListView extends AppCompatActivity {

    private ListView lvItem;
    private String[] namaNegara = new String[]{
            "Indonesia", "Malaysia", "Singapore", "Spanyol", "Jepang",
            "Inggris", "Belanda", "Mesir", "Brazil", "Italia", "Prancis",
            "Thailand"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mock_up_list_view);

        getSupportActionBar().setTitle("ListView Sederhana");

        lvItem = findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MockUpListView.this,
                android.R.layout.simple_list_item_1, android.R.id.text1, namaNegara);

        lvItem.setAdapter(adapter);

        lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(MockUpListView.this,"Memilih : "
                        +namaNegara[position],Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void clickNama(View view) {
        Intent i = new Intent(MockUpListView.this, MockUpNama.class);
        startActivity(i);
    }

    public void clickKalkulator(View view) {
        Intent i = new Intent(MockUpListView.this, MockUpKalkulator.class);
        startActivity(i);
    }
}
