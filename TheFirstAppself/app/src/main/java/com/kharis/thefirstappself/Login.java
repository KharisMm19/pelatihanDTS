package com.kharis.thefirstappself;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void clickLogin(View view) {
        Intent i = new Intent(Login.this, HomeScreen.class);
        startActivity(i);
    }

    public void clickSignUp(View view) {
        Intent i = new Intent(Login.this, SignUp.class);
        startActivity(i);
    }
}
