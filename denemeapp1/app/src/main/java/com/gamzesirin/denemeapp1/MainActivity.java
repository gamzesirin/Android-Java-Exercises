package com.gamzesirin.denemeapp1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;
import com.gamzesirin.denemeapp1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Bottom Navigation ve Navigation Controller kurulumu
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager()
                .findFragmentById(R.id.fragmentContainerView3);

        if (navHostFragment != null) {
            NavController navController = navHostFragment.getNavController();
            binding.bottomNavigationView.inflateMenu(R.menu.bottom_menu);
            NavigationUI.setupWithNavController(binding.bottomNavigationView, navController);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        binding = null; // Memory leak'i önlemek için binding'i temizle
    }
}