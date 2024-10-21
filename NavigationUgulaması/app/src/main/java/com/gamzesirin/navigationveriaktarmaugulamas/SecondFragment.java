package com.gamzesirin.navigationveriaktarmaugulamas;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gamzesirin.navigationveriaktarmaugulamas.databinding.FragmentFirstBinding;
import com.gamzesirin.navigationveriaktarmaugulamas.databinding.FragmentSecondBinding;
import com.gamzesirin.navigationveriaktarmaugulamas.databinding.FragmentThirdBinding;


public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding= FragmentSecondBinding.inflate(inflater,container,false);
        binding.button2.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.action_secondFragment_to_thirdFragment);
        });
        return binding.getRoot();
    }
}