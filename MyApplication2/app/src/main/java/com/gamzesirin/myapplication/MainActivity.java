package com.gamzesirin.myapplication;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;
import com.gamzesirin.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Customers c1 = new Customers(1,"GAMZE",10.500); //Customer sınıfından nesne ürettim
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Snackbar.make(v, "Butona bastınız", Snackbar.LENGTH_SHORT).show();//butona tıklanınca snackbar çıkar
                //binding.textView.setText("Merhabaaa"); // butona tıklanınca textView de merhaba yazar
                Snackbar.make(v, c1.getCustomerId() +" id'li "+ c1.getCustomerName() + " isimli müşteri "+ c1.getTotalPrice() +" ödeyecektir. ",Snackbar.LENGTH_LONG).show();
            }
        });
    }
}