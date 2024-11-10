package com.gamzesirin.fragmentapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gamzesirin.fragmentapp.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {
    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(inflater, container, false);

        binding.button.setOnClickListener(view -> {
            // getText'i button click içinde alıyoruz ki güncel değeri alalım
            String name = binding.editText.getText().toString();
            String sifre = binding.editText2.getText().toString();

            // Boş kontrolü ekleyelim
            if (!name.isEmpty() && !sifre.isEmpty()) {
                FirstFragmentDirections.ActionFirstFragmentToThirdFragment action =
                        FirstFragmentDirections.actionFirstFragmentToThirdFragment(name, sifre);
                Navigation.findNavController(view).navigate(action);
            }
        });

        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}