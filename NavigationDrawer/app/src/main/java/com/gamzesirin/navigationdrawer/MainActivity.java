package com.gamzesirin.navigationdrawer;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.gamzesirin.navigationdrawer.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private NavController navController;
    private AppBarConfiguration appBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Toolbar'ı ayarla
        setSupportActionBar(binding.toolbar);

        // NavHostFragment'i al  //VİZE
        NavHostFragment navHostFragment =
                (NavHostFragment) getSupportFragmentManager()
                        .findFragmentById(R.id.fragmentContainerView);

        if (navHostFragment != null) {
            navController = navHostFragment.getNavController();

            // AppBarConfiguration'ı ayarla
            appBarConfiguration = new AppBarConfiguration.Builder(
                    R.id.firstFragment,
                    R.id.secondFragment,
                    R.id.thirdFragment
            )
                    .setOpenableLayout(binding.drawerLayout)
                    .build();

            // Toolbar ile Navigation'ı bağla
            NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);// VİZE

            // NavigationView ile Navigation'ı bağla
            NavigationUI.setupWithNavController(binding.navigationView, navController);
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }

    @Override
    public void onBackPressed() {
        if (binding.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            binding.drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}