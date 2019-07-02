package com.kharis.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(this,"App on Start",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(this,"App on Stop",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart(){
        Toast.makeText(this,"App on Restart",Toast.LENGTH_SHORT).show();
        super.onRestart();
    }

    @Override
    protected void onResume(){
        Toast.makeText(this,"App on Resume",Toast.LENGTH_SHORT).show();
        super.onResume();
    }

    @Override
    protected void onPause(){
        Toast.makeText(this,"App on Pause",Toast.LENGTH_SHORT).show();
        super.onPause();
    }

    @Override
    protected void onDestroy(){
        Toast.makeText(this,"App on Destroy",Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }
}
