package com.example.continents;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.continents.databinding.ItemCountryBinding;

import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<CountryViewHolder>{
    private ArrayList<Country> countryList;

    public CountryAdapter(ArrayList<Country> countryList) {
        this.countryList = countryList;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CountryViewHolder(ItemCountryBinding.inflate(LayoutInflater.from(parent.getContext()),
                parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        holder.bind(countryList.get(position));

    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }

}







class CountryViewHolder extends RecyclerView.ViewHolder{
    private ItemCountryBinding binding2;

    public CountryViewHolder(ItemCountryBinding binding2) {
        super(binding2.getRoot());
        this.binding2 = binding2;
    }

    public void bind(Country country){
        binding2.tvCountry.setText(country.getCountry());
        Glide.with(binding2.imgFlag).load(country.getFlags()).into(binding2.imgFlag);

    }
}
