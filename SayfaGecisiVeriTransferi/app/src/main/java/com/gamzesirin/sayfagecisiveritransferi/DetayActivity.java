package com.gamzesirin.sayfagecisiveritransferi;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.gamzesirin.sayfagecisiveritransferi.databinding.ActivityDetayBinding;
import com.gamzesirin.sayfagecisiveritransferi.databinding.ActivityMainBinding;

public class DetayActivity extends AppCompatActivity {

    private ActivityDetayBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetayBinding.inflate(getLayoutInflater());
        EdgeToEdge.enable(this);

        setContentView(binding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        //binding.textView2.setText("Bu sayfa 2. activity yani detay sayfası");

        String gelenAd=getIntent().getStringExtra("ad");
        String gelenSoyad=getIntent().getStringExtra("soyad");
        Integer gelenYas=getIntent().getIntExtra("yas",0);
        Double gelenBoy = getIntent().getDoubleExtra("boy",0.0);
        Boolean gelenMededniHal = getIntent().getBooleanExtra("bekar",false);

        binding.textView2.setText(gelenAd +" "+gelenSoyad+" "+ gelenYas+" "+ gelenBoy+" "+ gelenMededniHal);

    }
}