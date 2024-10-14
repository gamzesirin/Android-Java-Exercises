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

public class Sayfa3 extends AppCompatActivity {
    private ActivitySayfa3Binding binding;

    //back tuşunu bir gerideki sayfaya değil başka sayfaya yönlendirme vermek
    //  @Override
    //  public void onBackPressed(){
    //   super.onBackPressed();
    //  Intent i = new Intent(Sayfa3.this,MainActivity.class);
    //     startActivity(i);
    // }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivitySayfa3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        binding.button2.setOnClickListener(view-> {
            Intent gec = new Intent(Sayfa3.this, MainActivity.class);
            startActivity(gec);
        });

    }
}