package com.gamzesirin.bottomnavigation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gamzesirin.bottomnavigation.databinding.FragmentSecondBinding;
import com.gamzesirin.bottomnavigation.databinding.FragmentThirdBinding;


public class ThirdFragment extends Fragment {
    private FragmentThirdBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentThirdBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}