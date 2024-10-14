package com.gamzesirin.coklusayfalararasigecis;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.gamzesirin.coklusayfalararasigecis.databinding.ActivityMainBinding;
import com.gamzesirin.coklusayfalararasigecis.databinding.ActivitySayfa2Binding;
import com.gamzesirin.coklusayfalararasigecis.databinding.ActivitySayfa3Binding;

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
        binding.button3.setOnClickListener(view-> {
            Intent gec = new Intent(Sayfa2.this, Sayfa3.class);
           // finish();//bu sayfaya bir daha geri dönülmesini istemiyorsak bunu yapıyoruz bu sayfa arka plandan silinmiş olur
            startActivity(gec);
        });
    }
}