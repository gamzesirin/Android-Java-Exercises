package com.gamzesirin.movieapp.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gamzesirin.movieapp.R;
import com.gamzesirin.movieapp.data.entity.Filmler;
import com.gamzesirin.movieapp.databinding.FragmentAnasayfaBinding;
import com.gamzesirin.movieapp.databinding.FragmentDetayBinding;


public class DetayFragment extends Fragment {
    private FragmentDetayBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDetayBinding.inflate(inflater, container, false);

        DetayFragmentArgs bundle = DetayFragmentArgs.fromBundle(getArguments());
        Filmler film = bundle.getFilm();

        binding.Detaytoolbar.setTitle(film.getName());

        binding.FimIv.setImageResource(
                getResources()
                        .getIdentifier(film.getImage(),"drawable",requireContext().getPackageName()));

        binding.FiyatTv.setText(film.getPrice()+" ₺");






        return binding.getRoot();
    }
}