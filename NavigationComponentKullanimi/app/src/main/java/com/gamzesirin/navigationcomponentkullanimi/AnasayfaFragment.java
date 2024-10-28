package com.gamzesirin.navigationcomponentkullanimi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gamzesirin.navigationcomponentkullanimi.databinding.FragmentAnasayfaBinding;


public class AnasayfaFragment extends Fragment {

   private FragmentAnasayfaBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentAnasayfaBinding.inflate(inflater,container,false);

        binding.button1.setOnClickListener(view -> {

            //   binding.textView1.setText("MERHABAA");
            //   Navigation.findNavController(view).navigate(R.id.detayaGecis);

            //framnetlarda veri transferi
//            AnasayfaFragmentDirections.DetayaGecis gecis = AnasayfaFragmentDirections.detayaGecis();
//            gecis.setAd("Gamze");
//            gecis.setYas(21);
//            gecis.setBoy(1.61f);
//            gecis.setBekar(true);
//            Navigation.findNavController(view).navigate(gecis);

            //fragmentlarda nesne transferi
            Urunler urun = new Urunler(100,"phone");
            AnasayfaFragmentDirections.DetayaGecis gecis = AnasayfaFragmentDirections.detayaGecis(urun);
            Navigation.findNavController(view).navigate(gecis);
        });
        return binding.getRoot();
    }
}