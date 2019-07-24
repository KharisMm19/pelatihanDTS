package com.kharis.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MockUpNama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mock_up_nama);
    }

    public void clickKalkulator(View view) {
        Intent i = new Intent(MockUpNama.this, MockUpKalkulator.class);
        startActivity(i);
    }

    public void clickListView(View view) {
        Intent i = new Intent(MockUpNama.this, MockUpListView.class);
        startActivity(i);
    }
}
