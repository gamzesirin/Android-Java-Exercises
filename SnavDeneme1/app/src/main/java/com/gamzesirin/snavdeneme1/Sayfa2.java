package com.gamzesirin.snavdeneme1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.gamzesirin.snavdeneme1.databinding.ActivitySayfa2Binding;
import com.google.android.material.snackbar.Snackbar;

public class Sayfa2 extends AppCompatActivity {

    private ActivitySayfa2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivitySayfa2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Ogrenciler ogr = new Ogrenciler(1, "gamze", 58);

        binding.button2.setOnClickListener(view -> {
            Snackbar.make(view, ogr.getOgrenciId() + " " + ogr.getOgrenciNo() + " " + ogr.getOgrenciName(), Snackbar.LENGTH_LONG).show();
        });
    }
}