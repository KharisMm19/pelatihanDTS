package polinema.ac.id.dtsdesigntolayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import polinema.ac.id.dtsdesigntolayout.Model.Register;

public class RegisterResultActivity extends AppCompatActivity {

    // Tambahkan variabel di sini
    TextView tvResultNama, tvResultTaanggalLahir, tvResultJenisKelamin, tvResultUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_result);

        tvResultNama = findViewById(R.id.tvResultNama);
        tvResultTaanggalLahir= findViewById(R.id.tvResultTanggalLahir);
        tvResultJenisKelamin = findViewById(R.id.tvResultJenisKelamin);
        tvResultUsername = findViewById(R.id.tvResultUsername);

        //String[] fromIntent = getIntent().getStringArrayExtra(RegisterActivity.Key_RegisterAtivity);
        Register register = getIntent().getParcelableExtra(RegisterActivity.Key_RegisterAtivity);

        tvResultNama.setText(register.getNama());
        tvResultTaanggalLahir.setText(register.getTanggalLahir());
        tvResultJenisKelamin.setText(register.getJenisKelamin());
        tvResultUsername.setText(register.getUsername());
    }
}
