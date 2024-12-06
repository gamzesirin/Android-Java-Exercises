package com.gamzesirin.widgetsapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.gamzesirin.widgetsapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private boolean kontrol = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // butona basınca editTexte girilen veriyi textView de yazan uygulamma
        binding.button1.setOnClickListener(view->{
            String alinanVeri = binding.editText1.getText().toString();
            binding.textView1.setText(alinanVeri);
        });

        // butona bastıkça resim değiştiren uygulamma
        binding.button2.setOnClickListener(view->{
            binding.imageView.setImageResource(R.drawable.mavi_resim);
        });
        binding.button3.setOnClickListener(view->{
            binding.imageView.setImageResource(R.drawable.kirmizi_resim);
        });

        // swicth butona bastıkça on off olma durumunu görmek için kod

        binding.switch1.setOnCheckedChangeListener(((compoundButton, isChecked) -> {
            if(isChecked){
                Log.e("sonuç","Switch : ON");
            }else{
                Log.e("sonuç","Switch : OFF");
            }
        }));

        //toggle butona tıklanınca hangisine tıklandıysa yazıyı alıp console 'a yazar
        binding.toggleButton.addOnButtonCheckedListener(((group, checkedId, isChecked) -> {
            kontrol = isChecked;
            if(kontrol){
                Button secilenButton = findViewById(binding.toggleButton.getCheckedButtonId());
                String buttonYazi = secilenButton.getText().toString();
                Log.e("Sonuç",buttonYazi);
            }
        }));

        // toggle buton için liste
        ArrayList<String> ulkeler = new ArrayList<>();
        ulkeler.add("Türkiye");
        ulkeler.add("İtalya");
        ulkeler.add("Japonya");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,ulkeler);
        binding.autoCompleteTextView.setAdapter(arrayAdapter);


        //butona basınca progressBar gösterip gizleyen kod
        binding.button5.setOnClickListener(view -> {
            binding.progressBar.setVisibility(View.VISIBLE);
        });

        binding.button6.setOnClickListener(view -> {
            binding.progressBar.setVisibility(View.INVISIBLE);
        });



        //butona basınca switchin son durumunu öğrenmek için , toggleButonun seçilenin ne olduğunu gösteren kod
        binding.button4.setOnClickListener(view -> {
            Log.e("sonuç","Switch Durum : "+ binding.switch1.isChecked());

            if(kontrol){
                Button secilenButton = findViewById(binding.toggleButton.getCheckedButtonId());
                String buttonYazi = secilenButton.getText().toString();
                Log.e("Sonuç","Toggle durum : "+buttonYazi);
            }

            String ulke = binding.autoCompleteTextView.getText().toString();
            Log.e("sonuç","ülke durumu : "+ulke);
        });

    }
}