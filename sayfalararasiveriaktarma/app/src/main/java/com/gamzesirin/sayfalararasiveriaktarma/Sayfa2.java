package com.gamzesirin.sayfalararasiveriaktarma;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.gamzesirin.sayfalararasiveriaktarma.databinding.ActivityMainBinding;
import com.gamzesirin.sayfalararasiveriaktarma.databinding.ActivitySayfa2Binding;
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
        binding.button.setOnClickListener(view-> {

            int age = getIntent().getIntExtra("age",21);
            String age1 = String.valueOf(age);
            double msj = getIntent().getDoubleExtra("double",1.0);
            String msj1 = String.valueOf(msj);
            Snackbar.make(view,msj+" double sayınız "+ age1 +" yaşındasınız", Snackbar.LENGTH_LONG).show();
        });

        String name = getIntent().getStringExtra("name");
        binding.textView.setText(name);

        String surname = getIntent().getStringExtra("surname");
        binding.textView2.setText(surname);



    }
}