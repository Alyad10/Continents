package com.example.continents;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.continents.databinding.ItemContinentsBinding;

import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentViewHolder> {


    private ArrayList <Continent> continentList;
    private Listener listener;


    public ContinentAdapter(ArrayList<Continent> continentList, Listener listener) {
        this.continentList = continentList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ContinentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinentViewHolder(ItemContinentsBinding.inflate(LayoutInflater.from(parent.getContext()),
                parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentViewHolder holder, int position) {
        holder.bind(continentList.get(position), listener);

    }

    @Override
    public int getItemCount() {
        return continentList.size();
    }
}

class ContinentViewHolder extends RecyclerView.ViewHolder {
    private ItemContinentsBinding binding;


    public ContinentViewHolder(ItemContinentsBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
    public void bind(Continent continent, Listener listener){
        binding.tvContinent.setText(continent.getContinent());
        Glide.with(binding.imgIcon).load(continent.getEmblems()).into(binding.imgIcon);

        itemView.setOnClickListener(view -> listener.onContinentClick(continent));
    }
}


interface Listener{
    void onContinentClick(Continent continent);
}