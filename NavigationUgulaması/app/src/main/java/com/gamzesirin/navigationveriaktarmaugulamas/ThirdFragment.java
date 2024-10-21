package com.gamzesirin.navigationveriaktarmaugulamas;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gamzesirin.navigationveriaktarmaugulamas.databinding.FragmentFirstBinding;
import com.gamzesirin.navigationveriaktarmaugulamas.databinding.FragmentThirdBinding;

public class ThirdFragment extends Fragment {

    private FragmentThirdBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentThirdBinding.inflate(inflater,container,false);
        binding.button3.setOnClickListener(view -> {
           Navigation.findNavController(view).navigate(R.id.action_thirdFragment_to_firstFragment);
        });
        return binding.getRoot();
    }
}