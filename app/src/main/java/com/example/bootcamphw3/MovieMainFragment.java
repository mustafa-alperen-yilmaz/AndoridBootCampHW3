package com.example.bootcamphw3;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bootcamphw3.databinding.FragmentMovieMainBinding;


public class MovieMainFragment extends Fragment {
    private FragmentMovieMainBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentMovieMainBinding.inflate(inflater, container, false);
        binding.theDarkNightDetailButton.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.navigate_mainPage_To_theDarkNightPage);
        });
        binding.interstellarDeatilButton.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.navigate_mainPage_To_interstellarPage);
        });
        return binding.getRoot();
    }
}