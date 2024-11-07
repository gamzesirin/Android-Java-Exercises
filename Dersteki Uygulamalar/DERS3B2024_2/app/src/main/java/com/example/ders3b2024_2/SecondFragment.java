package com.example.ders3b2024_2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ders3b2024_2.databinding.FragmentSecondBinding;


public class SecondFragment extends Fragment {

    private FragmentSecondBinding b;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        b=FragmentSecondBinding.inflate(inflater,container,false);

        SecondFragmentArgs al=SecondFragmentArgs.fromBundle(getArguments());
        b.textView2.setText(al.getAd()+" "+al.getYas());
        b.textView4.setText(al.getMstr().getSoyisim()+" "+al.getMstr().getÜcret());

        b.button2.setOnClickListener(view->{


            Navigation.findNavController(view).navigate(R.id.iki);
        });

        return b.getRoot();
    }
}