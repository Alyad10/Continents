package com.example.continents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.continents.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding activityBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityBinding.getRoot());


        if (savedInstanceState == null) {


            getSupportFragmentManager().beginTransaction().add(R.id.container, new FirstFragment()).commit();

        }
    }
}