package ac.id.atmaluhur.mhs.uas_dpm_1911500036_bakti_tokoonline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void cari(View view) {
        Intent intent = new Intent(MainActivity.this,Profil.class);
        startActivity(intent);
    }
    public void favorit(View view) {
        Intent intent = new Intent(MainActivity.this,Akun.class);
        startActivity(intent);
    }
}