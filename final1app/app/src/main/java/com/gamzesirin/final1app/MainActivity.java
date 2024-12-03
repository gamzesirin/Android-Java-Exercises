package com.gamzesirin.final1app;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.gamzesirin.final1app.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    //1. uygulama => editText e girilen metni textviewde butona tıklayınca getiren uygulama
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        setContentView(binding.getRoot());

        binding.button.setOnClickListener(view->{
            String s=binding.editTextText.getText().toString();
            binding.textView.setText(s);
        });

        //2. uygulama => view nesnesi oluşturarak ( content oluşturarak ) snackbar kullanım örneği  // sayfa açılır açılmaz snackbar mesajı gösterin
        View parentLayout = findViewById(android.R.id.content);
        Snackbar.make(parentLayout,"Yeni mesaj",Snackbar.LENGTH_LONG).show();

        //3.uygulama =>

            //toggle butona basınca snackbar mesajı gösteren uygulama
            binding.toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if(isChecked){
                        Snackbar.make(buttonView,"Toggle Butonu Açtınız",Snackbar.LENGTH_LONG).show();
                    }
                    else{
                        Snackbar.make(buttonView,"Toggle Butonu Kapattınız",Snackbar.LENGTH_LONG).show();
                    }
                }
            });

            //switch butona basınca snackbar mesajı gösteren uygulama
            binding.switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if(isChecked){
                        Snackbar.make(buttonView,"Switch Butonu Açtınız",Snackbar.LENGTH_LONG).show();
                    }
                    else{
                        Snackbar.make(buttonView,"Switch Butonu Kapattınız",Snackbar.LENGTH_LONG).show();
                    }
                }
            });
            //butona tıklanınca toggle ve switch butonların durumunu ekrana yazan uygulama
            binding.button.setOnClickListener(view -> {
                Boolean switch1 = binding.switch1.isChecked();
                Boolean toggleButton1 = binding.toggleButton.isChecked();
                Snackbar.make(view,"Switch butonu: "+switch1+"Toggle butonu: "+toggleButton1,Snackbar.LENGTH_LONG).show();
            });

            //4.uygulama
            binding.radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if(isChecked){
                        Snackbar.make(buttonView,"Erkek Radio Butonda Seçim Yapıldı",Snackbar.LENGTH_LONG).show();
                    }

                }
            });
        binding.radioButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Snackbar.make(buttonView,"Kadın Radio Butonda Seçim Yapıldı",Snackbar.LENGTH_LONG).show();
                }

            }
        });

        binding.checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Snackbar.make(buttonView,"Pizza checkboxı seçildi",Snackbar.LENGTH_LONG).show();
                }
                else{
                    Snackbar.make(buttonView,"Pizza checkboxı seçilmedi",Snackbar.LENGTH_LONG).show();
                }
            }
        });

        binding.checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Snackbar.make(buttonView,"Makarna checkboxı seçildi",Snackbar.LENGTH_LONG).show();
                }
                else{
                    Snackbar.make(buttonView,"Makarna checkboxı seçilmedi",Snackbar.LENGTH_LONG).show();
                }
            }
        });

        binding.checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Snackbar.make(buttonView,"Sote checkboxı seçildi",Snackbar.LENGTH_LONG).show();
                }
                else{
                    Snackbar.make(buttonView,"Sote checkboxı seçilmedi",Snackbar.LENGTH_LONG).show();
                }
            }
        });

        binding.button.setOnClickListener(view -> {
            Boolean radio1 = binding.radioButton.isChecked();
            Boolean radio2 = binding.radioButton2.isChecked();

            Boolean chechbox = binding.checkBox.isChecked();
            Boolean chechbox2 = binding.checkBox2.isChecked();
            Boolean chechbox3 = binding.checkBox3.isChecked();

            binding.textView.setText("Radio button1 : "+ radio1+ " Radio button2 : "+radio2+" Chechbox1 : "+chechbox+" Chechbox2 : "+chechbox2+" Chechbox3 : "+chechbox3 );
        });
    }
}