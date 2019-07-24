package com.kharis.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MockUpNama extends AppCompatActivity {

    EditText textNama;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mock_up_nama);

        textNama = findViewById(R.id.edt_nama);
        hasil = findViewById(R.id.txt_hasil);
    }

    public void TampilNama(View view){
        hasil.setText("Nama Anda : "+textNama.getText());
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
