package com.kharis.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MockUpKalkulator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mock_up_kalkulator);
    }

    public void clickNama(View view) {
        Intent i = new Intent(MockUpKalkulator.this, MockUpNama.class);
        startActivity(i);
    }

    public void clickListView(View view) {
        Intent i = new Intent(MockUpKalkulator.this, MockUpListView.class);
        startActivity(i);
    }
}
