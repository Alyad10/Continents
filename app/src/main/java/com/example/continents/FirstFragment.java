package com.example.continents;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.continents.databinding.FragmentFirstBinding;

import java.util.ArrayList;


public class FirstFragment extends Fragment implements Listener {
    private FragmentFirstBinding binding;
    private ArrayList<Continent>continentList = new ArrayList<>();
    private ContinentAdapter adapter;


    public FirstFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadData();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(getLayoutInflater());
        requireActivity().setTitle("Continents");

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        adapter = new ContinentAdapter(continentList, this);
        binding.recyclerView.setAdapter(adapter);

    }


    private void loadData() {
     continentList.add(new Continent("Eurasia","https://www.thoughtco.com/thmb/OMD9SiFy83IQ2N-U5h-fJL5K7SU=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/Eurasia_location_map_-_Physical-5c21c2ba46e0fb0001c9c702.jpg"));
     continentList.add(new Continent("Africa","https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Africa_satellite_orthographic.jpg/1200px-Africa_satellite_orthographic.jpg"));
     continentList.add(new Continent("South America","https://upload.wikimedia.org/wikipedia/commons/thumb/5/54/South_America_-_Blue_Marble_orthographic.jpg/220px-South_America_-_Blue_Marble_orthographic.jpg"));
     continentList.add(new Continent("North America","https://upload.wikimedia.org/wikipedia/commons/thumb/2/29/North_America_satellite_orthographic.jpg/300px-North_America_satellite_orthographic.jpg"));
     continentList.add(new Continent("Australia","https://upload.wikimedia.org/wikipedia/commons/thumb/e/ed/Australia_satellite_plane.jpg/640px-Australia_satellite_plane.jpg"));
    }

    @Override
    public void onContinentClick(Continent continent) {
        CountryFragment countryFragment = new CountryFragment();
        Bundle bundle = new Bundle();
        bundle.putString("continent", continent.getContinent());
        countryFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, countryFragment).addToBackStack("").commit();
    }
}