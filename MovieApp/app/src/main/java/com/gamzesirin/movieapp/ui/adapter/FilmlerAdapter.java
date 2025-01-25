package com.gamzesirin.movieapp.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.gamzesirin.movieapp.R;
import com.gamzesirin.movieapp.data.entity.Filmler;
import com.gamzesirin.movieapp.databinding.CardTasarimBinding;
import com.google.android.material.snackbar.Snackbar;

import java.util.List;

public class FilmlerAdapter extends RecyclerView.Adapter<FilmlerAdapter.CardTasarimTutucu> {
    private Context mContext;
    private List<Filmler> filmlerListesi;

    public FilmlerAdapter(Context mContext, List<Filmler> filmlerListesi) {
        this.mContext = mContext;
        this.filmlerListesi = filmlerListesi;
    }

    @NonNull
    @Override
    public CardTasarimTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardTasarimBinding binding = CardTasarimBinding.inflate(LayoutInflater.from(mContext),parent,false);
        return new CardTasarimTutucu(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CardTasarimTutucu holder, int position) {
        Filmler film = filmlerListesi.get(position);
        CardTasarimBinding t = holder.tasarim;
        t.imageViewFilm.setImageResource(mContext.getResources().getIdentifier(film.getImage(),"drawable",mContext.getPackageName()));
        t.textViewFilm.setText(film.getPrice() +" TL");
        t.button.setOnClickListener(view -> {
            Snackbar.make(view, film.getName() + " sepete eklendi",Snackbar.LENGTH_LONG).show();
        });
        t.filmCv.setOnClickListener(view -> {
            AnasayfaFragmentDirections.DetayGecis gecis = AnasayfaFragmentDirections.detayGecis(film);
            Navigation.findNavController(view).navigate(gecis);
        });


    }

    @Override
    public int getItemCount() {
        return filmlerListesi.size();
    }

    public class CardTasarimTutucu extends RecyclerView.ViewHolder{
        private CardTasarimBinding tasarim;

        public CardTasarimTutucu(CardTasarimBinding tasarim) {
            super(tasarim.getRoot());
            this.tasarim = tasarim;
        }
    }
}
