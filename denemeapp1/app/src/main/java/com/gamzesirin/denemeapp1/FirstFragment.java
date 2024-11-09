package com.gamzesirin.denemeapp1;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.gamzesirin.denemeapp1.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;
    private int sayi = 0; // Sayaç için değişken

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(inflater, container, false);

        // TextView'e başlangıç değeri atama
        binding.textView.setText(String.valueOf(sayi));

        binding.button.setOnClickListener(view -> {
            sayi++; // Sayıyı artır
            binding.textView.setText(String.valueOf(sayi));
        });

        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null; // Memory leak'i önlemek için binding'i temizle
    }
}