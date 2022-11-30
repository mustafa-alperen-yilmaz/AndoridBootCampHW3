package com.example.bootcamphw3;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bootcamphw3.databinding.FragmentTheDarkNightDetailBinding;

public class TheDarkNightDetailFragment extends Fragment {
    private FragmentTheDarkNightDetailBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentTheDarkNightDetailBinding.inflate(inflater, container, false);
        binding.buyTheDarkNightButton.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.navigate_theDarkNightDetailPage_To_purchasePage);
        });
        return binding.getRoot();
    }
}