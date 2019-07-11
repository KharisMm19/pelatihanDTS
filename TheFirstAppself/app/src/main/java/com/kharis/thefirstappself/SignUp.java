package com.kharis.thefirstappself;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void clickSignUp(View view) {
        Intent i = new Intent(SignUp.this, Login.class);
        startActivity(i);
    }

    public void clickLogin(View view) {
        Intent i = new Intent(SignUp.this, Login.class);
        startActivity(i);
    }
}
