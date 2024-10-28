package com.gamzesirin.sayfagecisiveritransferi;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.gamzesirin.sayfagecisiveritransferi.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        EdgeToEdge.enable(this);
        setContentView(binding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        binding.button1.setOnClickListener(view -> {
            //binding.textView.setText("Merhabaa");
            Intent intent = new Intent(MainActivity.this,DetayActivity.class);
            intent.putExtra("ad" ,"Gamze");
            intent.putExtra("soyad" ,"Şirin");
            intent.putExtra("yas",21);
            intent.putExtra("boy" ,1.61);
            intent.putExtra("bekar" ,true);
            startActivity(intent);
        });
    }
}