package polinema.ac.id.dtsdesigntolayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeSlideCalendar extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_slide);
    }

    public void clickGetStarted(View view) {
        Intent i = new Intent(WelcomeSlideCalendar.this, WelcomeSlideSuperhero.class);
        startActivity(i);
    }

    public void clickLogin(View view) {
        Intent i = new Intent(WelcomeSlideCalendar.this, WelcomeBack.class);
        startActivity(i);
    }

    public void clickContactUs(View view) {
        // Panggil inplicit intent
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        i.putExtra(Intent.EXTRA_EMAIL, new String[]{"dts@polinema.ac.id","kharism@polinema.ac.id"});
        i.putExtra(Intent.EXTRA_BCC, "BCC");
        i.putExtra(Intent.EXTRA_CC, "CC");
        //i.putExtra(Intent.EXTRA_EMAIL,"dts@polinema.ac.id");
        i.putExtra(Intent.EXTRA_SUBJECT, "Test Email");
        i.putExtra(Intent.EXTRA_TEXT, "Welcome to dts 2019");
        startActivity(i.createChooser(i, "Pilih email client"));
    }
}
