package com.gamzesirin.snavdeneme1;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.gamzesirin.snavdeneme1.databinding.ActivityMainBinding;
import com.gamzesirin.snavdeneme1.databinding.ActivitySayfa3Binding;

public class Sayfa3 extends AppCompatActivity {
    private ActivitySayfa3Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivitySayfa3Binding.inflate(getLayoutInflater());

        super.onCreate(savedInstanceState);

        setContentView(binding.getRoot());

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        String gelenAd = getIntent().getStringExtra("gelenAd");
        String gelenSifre = getIntent().getStringExtra("gelenSifre");

        binding.textView1.setText(gelenAd + " "+ gelenSifre);

        // Geri tuşu için yeni yöntem
        getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                Intent gec = new Intent(Sayfa3.this, Sayfa2.class);
                startActivity(gec);
            }
        });

    }
}