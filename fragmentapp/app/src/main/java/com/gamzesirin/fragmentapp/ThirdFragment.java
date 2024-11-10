package com.gamzesirin.fragmentapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gamzesirin.fragmentapp.databinding.FragmentFirstBinding;
import com.gamzesirin.fragmentapp.databinding.FragmentThirdBinding;


    public class ThirdFragment extends Fragment {
        private FragmentThirdBinding binding;

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            binding = FragmentThirdBinding.inflate(inflater, container, false);

            // Arguments'tan verileri alalım
            if (getArguments() != null) {
                ThirdFragmentArgs args = ThirdFragmentArgs.fromBundle(getArguments());
                String gelenAd = args.getAd();
                String gelenSifre = args.getSifre();
                binding.textView2.setText(gelenAd + " " + gelenSifre);
            }

            binding.button3.setOnClickListener(view -> {
                Navigation.findNavController(view).navigate(R.id.action_thirdFragment_to_secondFragment);
            });
            return binding.getRoot();
        }

        @Override
        public void onDestroyView() {
            super.onDestroyView();
            binding = null;
        }
    }