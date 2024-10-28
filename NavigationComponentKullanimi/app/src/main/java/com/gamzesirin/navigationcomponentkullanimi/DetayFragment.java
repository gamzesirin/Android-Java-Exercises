package com.gamzesirin.navigationcomponentkullanimi;

import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gamzesirin.navigationcomponentkullanimi.databinding.FragmentDetayBinding;
import com.google.android.material.snackbar.Snackbar;

public class DetayFragment extends Fragment {
    private FragmentDetayBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentDetayBinding.inflate(inflater, container, false);

      //  binding.textView2.setText("Detay Sayfasına Hoşgeldiniz");

        //frgamnetlarda veri transferi
        DetayFragmentArgs bundle = DetayFragmentArgs.fromBundle(getArguments());
        String gelenAd = bundle.getAd();
        Integer gelenYas = bundle.getYas();
        Float gelenBoy = bundle.getBoy();
        Boolean gelenBekar = bundle.getBekar();
        binding.textView2.setText(gelenAd+ " - "+ gelenBekar+" - "+ gelenYas + " - "+gelenBoy);


        //fragmentarda nesne transferi
        Urunler gelenUrun = bundle.getUrun();
        binding.textView2.setText(gelenUrun.getId()+" - "+ gelenUrun.getName());


        OnBackPressedCallback geriTusu = new OnBackPressedCallback(true){
            @Override
            public void handleOnBackPressed(){
                Snackbar.make(binding.textView2 , "Geri dönmek istiyor musunuz ? ",Snackbar.LENGTH_LONG).setAction("Evet", view -> {
                    setEnabled(false);
                    requireActivity().getOnBackPressedDispatcher().onBackPressed();

                }).show();
            }
        };
        requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(),geriTusu);
        return binding.getRoot();
    }
}