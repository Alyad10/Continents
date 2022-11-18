package com.example.continents;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.continents.databinding.FragmentCountryBinding;

import java.util.ArrayList;


public class CountryFragment extends Fragment {
    private FragmentCountryBinding countryBinding;
    private ArrayList <Country>countryList =new ArrayList<>();
    private CountryAdapter countryAdapter;
    private String continent;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null){
           continent = getArguments().getString("continent");
        }

        }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        countryBinding = FragmentCountryBinding.inflate(getLayoutInflater());
        requireActivity().setTitle(continent);
        return countryBinding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        countryAdapter = new CountryAdapter(countryList);
        countryBinding.recyclerView2.setAdapter(countryAdapter);
    }

    private void loadData() {
        switch (continent){
            case "Eurasia":
                countryList.add(new Country("Kyrgyzstan","https://upload.wikimedia.org/wikipedia/commons/thumb/c/c7/Flag_of_Kyrgyzstan.svg/250px-Flag_of_Kyrgyzstan.svg.png"));
                countryList.add(new Country("Russia","https://upload.wikimedia.org/wikipedia/commons/thumb/f/f3/Flag_of_Russia.svg/250px-Flag_of_Russia.svg.png"));
                countryList.add(new Country("China","https://flagof.ru/wp-content/uploads/2018/10/%D0%9A%D0%9D%D0%A0_1.jpg"));
                countryList.add(new Country("Germany","https://www.flagistrany.ru/data/flags/w580/de.png"));
                countryList.add(new Country("Turkey","https://upload.wikimedia.org/wikipedia/commons/thumb/b/b4/Flag_of_Turkey.svg/1280px-Flag_of_Turkey.svg.png"));
                break;

            case "Africa" :
                countryList.add(new Country("Egypt","https://upload.wikimedia.org/wikipedia/commons/thumb/f/fe/Flag_of_Egypt.svg/250px-Flag_of_Egypt.svg.png"));
                countryList.add(new Country("Nigeria","https://simvolplus.ru/upload/iblock/309/3095b7f3469d923e20c2a39eadb066b8.jpg"));
                countryList.add(new Country("Alja","https://upload.wikimedia.org/wikipedia/commons/thumb/7/77/Flag_of_Algeria.svg/250px-Flag_of_Algeria.svg.png"));
                countryList.add(new Country("Sudan","https://flags-world.com/wp-content/uploads/2021/01/flag-sudana-8.png"));
                countryList.add(new Country("Somali","https://upload.wikimedia.org/wikipedia/commons/thumb/a/a0/Flag_of_Somalia.svg/800px-Flag_of_Somalia.svg.png"));
                break;
            case "South America" :
                countryList.add(new Country("Brazil","https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Flag_of_Brazil.svg/250px-Flag_of_Brazil.svg.png"));
                countryList.add(new Country("Peru","https://upload.wikimedia.org/wikipedia/commons/thumb/d/df/Flag_of_Peru_%28state%29.svg/1200px-Flag_of_Peru_%28state%29.svg.png"));
                countryList.add(new Country("Venezuela","https://upload.wikimedia.org/wikipedia/commons/thumb/0/06/Flag_of_Venezuela.svg/250px-Flag_of_Venezuela.svg.png"));
                countryList.add(new Country("Argentina","https://s9.travelask.ru/system/images/files/001/510/804/wysiwyg_jpg/Argentina.jpg?1640806658"));
                countryList.add(new Country("Uruguay","https://upload.wikimedia.org/wikipedia/commons/thumb/f/fe/Flag_of_Uruguay.svg/250px-Flag_of_Uruguay.svg.png"));
                break;
            case "North America" :
                countryList.add(new Country("Mexico","https://cdn.pixabay.com/photo/2012/04/10/23/24/mexico-26989__340.png"));
                countryList.add(new Country("U.S.A","https://infoearth.ru/wp-content/uploads/2020/05/flag-ssha-1847%E2%80%931848-1024x539.png"));
                countryList.add(new Country("Canada","https://flagof.ru/wp-content/uploads/2018/10/1200px-Flag_of_Canada_1964.svg_.png"));
                countryList.add(new Country("Cuba","https://cdn.pixabay.com/photo/2013/07/12/15/20/cuba-149689__480.png"));
                countryList.add(new Country("Dominican Republic","https://upload.wikimedia.org/wikipedia/commons/thumb/9/9f/Flag_of_the_Dominican_Republic.svg/250px-Flag_of_the_Dominican_Republic.svg.png"));
                break;
            case "Australia" :
                countryList.add(new Country("Tasmania","https://upload.wikimedia.org/wikipedia/commons/thumb/4/46/Flag_of_Tasmania.svg/1200px-Flag_of_Tasmania.svg.png"));
                countryList.add(new Country("Kiribati", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/Flag_of_Kiribati.svg/1200px-Flag_of_Kiribati.svg.png"));
                countryList.add(new Country("Papua New Guinea","https://upload.wikimedia.org/wikipedia/commons/thumb/e/e3/Flag_of_Papua_New_Guinea.svg/320px-Flag_of_Papua_New_Guinea.svg.png"));
                countryList.add(new Country("Tonga","https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/Flag_of_Tonga.svg/1280px-Flag_of_Tonga.svg.png"));
                countryList.add(new Country("Samoa","https://upload.wikimedia.org/wikipedia/commons/thumb/3/31/Flag_of_Samoa.svg/250px-Flag_of_Samoa.svg.png"));
                break;

            }


        }
    }

