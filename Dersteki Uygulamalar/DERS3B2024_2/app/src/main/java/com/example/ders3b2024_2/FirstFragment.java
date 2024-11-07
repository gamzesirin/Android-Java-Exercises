package com.example.ders3b2024_2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ders3b2024_2.databinding.FragmentFirstBinding;


public class FirstFragment extends Fragment {

   private FragmentFirstBinding b;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        b=FragmentFirstBinding.inflate(inflater,container,false);

        Musteriler m1=new Musteriler("Siseci",10000);
        b.button1.setOnClickListener(view->{

            //Navigation.findNavController(view).navigate(R.id.ilk);
            /*FirstFragmentDirections.Ilk gec=FirstFragmentDirections.ilk(m1);
            gec.setAd("Melike");
            gec.setYas(40);

            Navigation.findNavController(view).navigate((NavDirections)gec);*/
        });
        return b.getRoot();
    }
}