package com.gamzesirin.final5app;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.gamzesirin.final5app.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //butona tıklanınca snackbar oluşturduk ve buna bir buton ekledik buna tıklanınca textViewde yazı yazar
        binding.button1.setOnClickListener(view->{
            Snackbar snackbar = Snackbar.make(view,"Snackbar örneği",Snackbar.LENGTH_LONG);
            snackbar.setAction("Tamam", new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    binding.textView.setText("Sanckbar butonuna tıklandı");
                }
            });
            snackbar.show();
        });

        //fab butonuna tıklayınca sncakbar çıkan uygulama
        binding.floatingActionButton.setOnClickListener(view -> {
            Snackbar.make(view,"Fab butonuna tıkladınız",Snackbar.LENGTH_LONG).show();
        });

        //textInputLayout'a girilen veriyi textView de gösteren uygulama
        binding.button3.setOnClickListener(view -> {
            binding.textView.setText(binding.textInputEditText.getText());
        });
    }
}