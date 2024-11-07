package com.gamzesirin.snavdeneme1;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.gamzesirin.snavdeneme1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        binding.button1.setOnClickListener(view -> {
            Intent gec = new Intent(MainActivity.this, Sayfa3.class);

            String gelenAd = binding.editText1.getText().toString();
            String gelenSifre =binding.editText2.getText().toString();
            gec.putExtra("gelenAd",gelenAd);
            gec.putExtra("gelenSifre",gelenSifre);

            startActivity(gec);
        });
    }
}