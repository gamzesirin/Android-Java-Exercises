package com.gamzesirin.final4app;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.gamzesirin.final4app.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;

//        ArrayAdapter<String>adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,isim);
public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(binding.getRoot());
        //listView oluşturma ve listviewde tıklanan ögeyi textviewde gösterme uygulaması
//        String [] isim = {"Gamze","Berkay","Zeynep","Ali","Ayşe","Berrak","Ada"};
//        ArrayAdapter<String>adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,isim);
//        binding.listView.setAdapter(adapter);
//        binding.listView.setOnItemClickListener((parent,view,position,id)->{
//            String secim = (String)parent.getItemAtPosition(position);
//        binding.textView.setText(secim);
//        });
// //gridView oluşturma ve gridViewde tıklanan ögeyi textviewde gösterme uygulaması
//        binding.gridView.setAdapter(adapter);;
//        binding.gridView.setOnItemClickListener((parent,view,position,id)->{
//            String secim = (String)parent.getItemAtPosition(position);
//            binding.textView.setText(secim);
//        });




//pozisyonunu snackbara yazan ,spinnerdan seçileni textviewde yazan uygulama
        String [] isim = {"Gamze","Berkay","Zeynep","Ali","Ayşe","Berrak","Ada"};
        ArrayAdapter<String>adapter=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,isim);
        binding.spinner.setAdapter(adapter);
      adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        binding.spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String secim = (String) adapterView.getItemAtPosition(i);
                binding.textView.setText(secim);
                int m= binding.spinner.getSelectedItemPosition();
                Snackbar.make(view,"Pozisyon"+m ,Snackbar.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


}}