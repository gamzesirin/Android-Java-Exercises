package com.gamzesirin.snflardaveriaktarma;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.gamzesirin.snflardaveriaktarma.databinding.ActivityMainBinding;
import com.gamzesirin.snflardaveriaktarma.databinding.ActivitySayfa2Binding;
import com.google.android.material.snackbar.Snackbar;

public class Sayfa2 extends AppCompatActivity {
    private ActivitySayfa2Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivitySayfa2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        binding.button2.setOnClickListener(view->{

            Ogrenciler ogrenciler1 = (Ogrenciler) getIntent().getSerializableExtra("ogr");

            Snackbar.make(view,String.valueOf(ogrenciler1.getOgrenciId())+" "+ ogrenciler1.getOgrenciName()+ " "+ String.valueOf(ogrenciler1.getOgrenciNo()),Snackbar.LENGTH_LONG).show();
        }
        );
    }
}