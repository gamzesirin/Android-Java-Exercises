package com.gamzesirin.navigationveriaktarmaugulamas;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gamzesirin.navigationveriaktarmaugulamas.databinding.ActivityMainBinding;
import com.gamzesirin.navigationveriaktarmaugulamas.databinding.FragmentFirstBinding;
import com.gamzesirin.navigationveriaktarmaugulamas.databinding.FragmentSecondBinding;


public class FirstFragment extends Fragment {
    private FragmentFirstBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding= FragmentFirstBinding.inflate(inflater,container,false);
        binding.button1.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.action_firstFragment_to_secondFragment);
        });
        return binding.getRoot();
    }
}