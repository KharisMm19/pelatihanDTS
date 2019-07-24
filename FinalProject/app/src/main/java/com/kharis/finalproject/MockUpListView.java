package com.kharis.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MockUpListView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mock_up_list_view);
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
