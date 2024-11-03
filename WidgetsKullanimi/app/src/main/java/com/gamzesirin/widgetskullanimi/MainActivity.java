package com.gamzesirin.widgetskullanimi;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.gamzesirin.widgetskullanimi.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        EdgeToEdge.enable(this);
        setContentView(binding.getRoot());

        binding.button.setOnClickListener(view->{
            String alinanVeri = binding.editText.getText().toString();//plain texte girilen veriyi alıyorum
            binding.textView.setText(alinanVeri); // aldığımı textView de ekrana yazıyorum
        });
        binding.button2.setOnClickListener(view->{

            binding.imageView.setImageResource(R.drawable.baseline_icecream_24);
        });
        binding.button3.setOnClickListener(view->{
           // binding.imageView.setImageResource(R.drawable.baseline_icecream_48);
            binding.imageView.setImageResource(getResources().getIdentifier("baseline_icecream_48","drawable",getPackageName()));// db den resim alınırken kullanılabilir
        });
        binding.switch1.setOnCheckedChangeListener(((compoundButton, isChecked) ->{
            if (isChecked){
                Log.e("Sonuc ","Switch : On");
            }else{
                Log.e("Sonuc ","Switch : Off");
            }
                } )
        );

        binding.button4.setOnClickListener(view->{

            Log.e("Sonuc ","Switch Durum : " + binding.switch1.isChecked());

        });
    }
}