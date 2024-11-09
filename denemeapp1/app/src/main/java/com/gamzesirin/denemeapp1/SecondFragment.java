package com.gamzesirin.denemeapp1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gamzesirin.denemeapp1.databinding.FragmentFirstBinding;
import com.gamzesirin.denemeapp1.databinding.FragmentSecondBinding;
import com.google.android.material.snackbar.Snackbar;


public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(inflater,container,false);
        binding.button2.setOnClickListener(view -> {
            String ad = binding.editText.getText().toString();
            String soyAd = binding.editText2.getText().toString();

            Snackbar.make(view,ad + " "+ soyAd ,Snackbar.LENGTH_LONG).show();

        });


        return binding.getRoot();
    }
}