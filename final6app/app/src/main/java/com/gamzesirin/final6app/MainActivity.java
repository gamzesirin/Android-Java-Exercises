package com.gamzesirin.final6app;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.gamzesirin.final6app.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener{
private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar1);//mainActivitye toolbarı entegre ettik görünmesini sağladık
    }

    //search vs kısmını getirdik toolbardaki  // toolbara hangi menünün ekleneceğini söyledik
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu,menu);
//        return true;
//    }

    // search kısmından arama yapma kısmı
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        MenuItem mi = menu.findItem(R.id.menu5);
        SearchView searchView = (SearchView) mi.getActionView();
        searchView.setOnQueryTextListener(this);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        return false;
    }

    //yapılan aramayı snackbarda gösteren uygulama
    @Override
    public boolean onQueryTextSubmit(String s) {
        Snackbar.make(findViewById(android.R.id.content),"Arama Yapıldı"+ s,Snackbar.LENGTH_LONG).show();
        return true;
    }

    //toolbardaki menüyü bağlama

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.menu1){
            Snackbar.make(findViewById(android.R.id.content),"birinci menü",Snackbar.LENGTH_LONG).show();
        }
        else if (id==R.id.menu2) {
            Snackbar.make(findViewById(android.R.id.content),"ikinci menü",Snackbar.LENGTH_LONG).show();
        }
        else if (id==R.id.menu3) {
            Snackbar.make(findViewById(android.R.id.content),"üçüncü menü",Snackbar.LENGTH_LONG).show();
        }
        else if (id==R.id.menu4) {
            Snackbar.make(findViewById(android.R.id.content),"dördüncü menü",Snackbar.LENGTH_LONG).show();
        }
//        else{
//            Snackbar.make(findViewById(android.R.id.content),"search menü",Snackbar.LENGTH_LONG).show();
//       }
        return super.onOptionsItemSelected(item);
   }
}