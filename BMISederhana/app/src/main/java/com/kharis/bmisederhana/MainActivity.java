package com.kharis.bmisederhana;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private EditText tinggi;
    private EditText bobot;
    private EditText umur;
    private RadioGroup rgGender;;
    private RadioButton rbGender;

    int tampilBerat;
    int tampilTinggi;
    int tampilUmur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tinggi = findViewById(R.id.inputTinggi);
        bobot = findViewById(R.id.inputBerat);
        umur = findViewById(R.id.inputUmur);
        rgGender = findViewById(R.id.pilihGender);

        bobot.setText("0");



    }

    public void krgBerat(View view){
        tampilBerat = Integer.parseInt(bobot.getText().toString());
        tampilBerat = tampilBerat - 1;
        displayBerat(tampilBerat);
    }public void tmbBerat(View view){
        tampilBerat = Integer.parseInt(bobot.getText().toString());
        tampilBerat = tampilBerat + 1;
        displayBerat(tampilBerat);
    }
    public void krgTinggi(View view){
        tampilTinggi = Integer.parseInt(tinggi.getText().toString());
        tampilTinggi = tampilTinggi - 1;
        displayTinggi(tampilTinggi);
    }public void tmbTinggi(View view){
        tampilTinggi = Integer.parseInt(tinggi.getText().toString());
        tampilTinggi = tampilTinggi + 1;
        displayTinggi(tampilTinggi);
    }
    public void krgUmur(View view){
        tampilUmur = Integer.parseInt(umur.getText().toString());
        tampilUmur = tampilUmur - 1;
        displayUmur(tampilUmur);
    }public void tmbUmur(View view){
        tampilUmur = Integer.parseInt(umur.getText().toString());
        tampilUmur = tampilUmur + 1;
        displayUmur(tampilUmur);
    }

    private void displayBerat(int number){
        EditText inputBerat = findViewById(R.id.inputBerat);
        inputBerat.setText(""+number);
    }
    private void displayTinggi(int number){
        EditText inputTinggi = findViewById(R.id.inputTinggi);
        inputTinggi.setText(""+number);
    }
    private void displayUmur(int number){
        EditText inputUmur = findViewById(R.id.inputUmur);
        inputUmur.setText(""+number);
    }

    public void calculateBMI(View view){
        int pilihGender = rgGender.getCheckedRadioButtonId();
        rbGender = findViewById(pilihGender);

        String tinggiStr = tinggi.getText().toString();
        String bobotStr = bobot.getText().toString();

        if (tinggiStr != null && !"".equals(tinggiStr) && bobotStr != null && !"".equals(bobotStr)){
            float tinggiValue = Float.parseFloat(tinggiStr)/100;
            float bobotValue = Float.parseFloat(bobotStr);

            float bmi = bobotValue / (tinggiValue*tinggiValue);
            displayBMI(bmi);
        }
    }

    private void displayBMI(float bmi){
        int gender = rgGender.getCheckedRadioButtonId();
        rbGender = findViewById(gender);
        String bmiLabel = "";
        String infoUmur = umur.getText().toString();
        String hasilBmi;

        if (Float.compare(bmi, 15f) <= 0){
            bmiLabel = getString(R.string.terlalu_sangat_kurus);
        }else if (Float.compare(bmi, 15f) > 0 && Float.compare(bmi, 16f) <= 0){
            bmiLabel = getString(R.string.sangat_kurus);
        }else if (Float.compare(bmi, 16f) > 0 && Float.compare(bmi, 18.5f) <= 0){
            bmiLabel = getString(R.string.kurus);
        }else if (Float.compare(bmi, 18.5f) > 0 && Float.compare(bmi, 25f) <= 0){
            bmiLabel = getString(R.string.normal);
        }else if (Float.compare(bmi, 25f) > 0 && Float.compare(bmi, 30f) <= 0){
            bmiLabel = getString(R.string.gemuk);
        }else if (Float.compare(bmi, 30f) > 0 && Float.compare(bmi, 35f) <= 0){
            bmiLabel = getString(R.string.cukup_gemuk);
        }else if (Float.compare(bmi, 35f) > 0 && Float.compare(bmi, 40f) <= 0){
            bmiLabel = getString(R.string.sangat_gemuk);
        }else {
            bmiLabel = getString(R.string.terlalu_sangat_gemuk);
        }

        bmiLabel = "Jenis kelamin: " +  rbGender.getText() + "\n\n" + "Hasil     Penghitungan BMI : "
                + bmi + " --- " +  "Kategori: " + "(" + bmiLabel
                + ")" + "\n\n"     + "Umur : " + infoUmur;

        AlertDialog.Builder tampilBMI = new AlertDialog.Builder(this);
        tampilBMI.setTitle("Hasil Penghitunan BMI");
        tampilBMI.setMessage(bmiLabel).setNeutralButton("Tutup", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });

        AlertDialog alertDialog = tampilBMI.create();
        alertDialog.show();
    }
}
