package com.kharis.appchooser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.view.View;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendEmail(View view){
        Intent i = new Intent(Intent.ACTION_SEND);

        i.setType("text/plain");
        i.putExtra(Intent.EXTRA_EMAIL, new String[]{"kharismm19@gmail.com"});
        i.putExtra(Intent.EXTRA_SUBJECT, "Test Email");
        i.putExtra(Intent.EXTRA_TEXT,"Welcome to DTS 2019");

        List<ResolveInfo> possibleApps = getPackageManager().queryIntentActivities(i, PackageManager.MATCH_ALL);

        if (possibleApps.size()>1){
            String title = "Pilih client Email";
            Intent chooser = Intent.createChooser(i,title);
            startActivity(chooser);
        }else if(i.resolveActivity(getPackageManager())!=null){
            startActivity(i);
        }
    }
}
