package com.example.ders3b2024_2;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.example.ders3b2024_2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());

        NavHostFragment nf=(NavHostFragment)
                getSupportFragmentManager().findFragmentById(R.id.fragmentContainerView);
        NavigationUI.setupWithNavController(b.nv, nf.getNavController());

        b.toolbar.setTitle("Menu");

        ActionBarDrawerToggle tggl=new ActionBarDrawerToggle(this,b.drawer,
                b.toolbar,0,0);
        b.drawer.addDrawerListener(tggl);
        tggl.syncState();
    }
}