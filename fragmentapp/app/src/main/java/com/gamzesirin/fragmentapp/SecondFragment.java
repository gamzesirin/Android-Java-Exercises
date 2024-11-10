package com.gamzesirin.fragmentapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gamzesirin.fragmentapp.databinding.FragmentFirstBinding;
import com.gamzesirin.fragmentapp.databinding.FragmentSecondBinding;
import com.google.android.material.snackbar.Snackbar;

public class SecondFragment extends Fragment {
    private FragmentSecondBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(inflater, container, false);

        Ogrenciler ogr1 = new Ogrenciler(1, "gamze", 22);

        binding.button2.setOnClickListener(view -> {
            String message = ogr1.getOgrenciId() + " " + ogr1.getOgrenciNo() + " " + ogr1.getOgrenciName();
            Snackbar.make(view, message, Snackbar.LENGTH_LONG).show();
        });

        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}