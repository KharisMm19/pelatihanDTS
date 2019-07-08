package polinema.ac.id.dtsdesigntolayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import polinema.ac.id.dtsdesigntolayout.Model.Register;

public class RegisterActivity extends AppCompatActivity {

    // Tambahkan variabel di sini
    private final String TAG = RegisterActivity.class.getName();
    public static final String Key_RegisterAtivity = "Key__RegisterActivity";

    EditText editTextNama, editTextTanggalLahir, editTextUsername, editTextPass;
    //RadioButton rbLaki, rbPerempuan;
    RadioButton rbJK;
    RadioGroup rgJenisKelamin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        // Inisialisasi variabel
        editTextNama = findViewById(R.id.edt_txt_nama);
        editTextTanggalLahir = findViewById(R.id.edt_tanggal_lahir);
        editTextUsername = findViewById(R.id.edt_username);
        editTextPass = findViewById(R.id.edt_password);
        //rbLaki = findViewById(R.id.rb_laki);
        //rbPerempuan = findViewById(R.id.rb_perempuan);
        rgJenisKelamin = findViewById(R.id.rg_jenis_kelamin);
    }

    public void postSignUp(View view) {
        // Tambahkan kode untuk proses sign up
        String pass = editTextPass.getText().toString();
        String username = editTextUsername.getText().toString();
        String nama = editTextNama.getText().toString();
        //String jk = rbPerempuan.isChecked() ? "Perempuan" : "Laki - laki";

        int selectedJk = rgJenisKelamin.getCheckedRadioButtonId();
        // Jadikan id radio button sebagai rujukan binding view
        rbJK = findViewById(selectedJk);

        // Hasilnya sama persis dengan baris 40, namun dengan pendekatan yang berbeda
        String jk = rbJK.getText().toString();

        String tanggalLahir = editTextTanggalLahir.getText().toString();
//        Log.d(TAG,"postSignUp"+pass);
//        Log.d(TAG,"postSignUp"+username);
//        Log.d(TAG,"postSignUp"+nama);
//        Log.d(TAG,"postSignUp"+jk);
//        Log.d(TAG,"postSignUp"+tanggalLahir);
        Intent intent = new Intent(RegisterActivity.this, RegisterResultActivity.class);
        Register register = new Register(nama, tanggalLahir, jk, username, pass);
        intent.putExtra(Key_RegisterAtivity, register);
        startActivity(intent);
    }
}
