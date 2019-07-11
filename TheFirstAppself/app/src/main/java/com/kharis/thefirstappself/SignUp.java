package com.kharis.thefirstappself;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SignUp extends AppCompatActivity {

    private final String TAG = SignUp.class.getName();
    public static final String Key_SignUp = "Key_SignUp";

    EditText newTextEmail;
    EditText newTextPassword;
    EditText name;
    EditText tanggalLahir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        name = findViewById(R.id.edt_firstname);
        tanggalLahir = findViewById(R.id.edt_tanggal_lahir);
        newTextEmail = findViewById(R.id.edt_username);
        newTextPassword = findViewById(R.id.edt_password);
    }

    public void postSignUp(View view) {
        String pass = newTextPassword.getText().toString();
        String username = newTextEmail.getText().toString();
        String nama = name.getText().toString();
        String tangga_lahir = tanggalLahir.getText().toString();
        Intent i = new Intent(SignUp.this, Login.class);
        i.putExtra(Key_SignUp, new String[]{nama, tangga_lahir, username});
        startActivity(i);
    }

    public void clickLogin(View view) {
        Intent i = new Intent(SignUp.this, Login.class);
        startActivity(i);
    }
}
