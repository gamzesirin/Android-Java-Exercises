package com.gamzesirin.final3app;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.gamzesirin.final3app.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        binding=ActivityMainBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        setContentView(binding.getRoot());
        // butona bastıkça resim değiştiren uygulamma
        binding.button.setOnClickListener(view->{
            binding.imageView.setImageResource(R.drawable.ic_android_black_24dp);
        });
        binding.button2.setOnClickListener(view->{
            binding.imageView.setImageResource(R.drawable.ic_launcher_foreground);
        });
    }
}