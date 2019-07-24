package com.kharis.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MockUpKalkulator extends AppCompatActivity {

    EditText angka1, angka2;
    Button tambah, kurang, kali, bagi, bersihkan;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mock_up_kalkulator);

        angka1 = findViewById(R.id.angka1);
        angka2 = findViewById(R.id.angka2);
        tambah = findViewById(R.id.btn_plus);
        kurang = findViewById(R.id.btn_min);
        kali = findViewById(R.id.btn_kali);
        bagi = findViewById(R.id.btn_bagi);
        bersihkan = findViewById(R.id.btn_bersih);
        hasil = findViewById(R.id.txt_hasil);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((angka1.getText().length()>0) && (angka2.getText().length()>0)){
                    double angkaPertama = Double.parseDouble(angka1.getText().toString());
                    double angkaKedua = Double.parseDouble(angka2.getText().toString());
                    double result = angkaPertama + angkaKedua;
                    hasil.setText(Double.toString(result));
                }else {
                    Toast.makeText(MockUpKalkulator.this,
                            "Mohon masukan angka pertama dan angka kedua",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((angka1.getText().length()>0) && (angka2.getText().length()>0)){
                    double angkaPertama = Double.parseDouble(angka1.getText().toString());
                    double angkaKedua = Double.parseDouble(angka2.getText().toString());
                    double result = angkaPertama - angkaKedua;
                    hasil.setText(Double.toString(result));
                }else {
                    Toast.makeText(MockUpKalkulator.this,
                            "Mohon masukan angka pertama dan angka kedua",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((angka1.getText().length()>0) && (angka2.getText().length()>0)){
                    double angkaPertama = Double.parseDouble(angka1.getText().toString());
                    double angkaKedua = Double.parseDouble(angka2.getText().toString());
                    double result = angkaPertama * angkaKedua;
                    hasil.setText(Double.toString(result));
                }else {
                    Toast.makeText(MockUpKalkulator.this,
                            "Mohon masukan angka pertama dan angka kedua",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((angka1.getText().length()>0) && (angka2.getText().length()>0)){
                    double angkaPertama = Double.parseDouble(angka1.getText().toString());
                    double angkaKedua = Double.parseDouble(angka2.getText().toString());
                    double result = angkaPertama / angkaKedua;
                    hasil.setText(Double.toString(result));
                }else {
                    Toast.makeText(MockUpKalkulator.this,
                            "Mohon masukan angka pertama dan angka kedua",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        bersihkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angka1.setText("");
                angka2.setText("");
                hasil.setText("0");
                angka1.requestFocus();
            }
        });
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
