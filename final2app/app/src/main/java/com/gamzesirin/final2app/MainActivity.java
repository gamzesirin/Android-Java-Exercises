package com.gamzesirin.final2app;

import android.os.Bundle;
import android.widget.SeekBar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.gamzesirin.final2app.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        setContentView(binding.getRoot());

        //butona tıklayınca progres bar gözüküp kaybolur yapan program
        binding.button.setOnClickListener(view -> {
            int gorunur = binding.progressBar.getVisibility();
            if(gorunur ==0){
                binding.progressBar.setVisibility(view.INVISIBLE);
            }
            else{
                binding.progressBar.setVisibility(view.VISIBLE);

            }
            //Rating de gelen yıldızı snackbarla ekrana yazan program
            float yildiz = binding.ratingBar.getRating();
            Snackbar.make(view,"Yildiz sayısı : "+yildiz,Snackbar.LENGTH_LONG).show();
        });

        //prgressteki değeri textView e yazan program
        binding.seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                binding.textView.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}