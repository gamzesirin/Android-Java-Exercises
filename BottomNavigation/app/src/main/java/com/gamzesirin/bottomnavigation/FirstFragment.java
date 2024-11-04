package com.gamzesirin.bottomnavigation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gamzesirin.bottomnavigation.databinding.FragmentFirstBinding;
import com.gamzesirin.bottomnavigation.databinding.FragmentSecondBinding;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            binding = FragmentFirstBinding.inflate(inflater, container, false);
            return binding.getRoot();
        }
    }
