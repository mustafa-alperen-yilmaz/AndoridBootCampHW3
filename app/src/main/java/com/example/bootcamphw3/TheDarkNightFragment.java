package com.example.bootcamphw3;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bootcamphw3.databinding.FragmentTheDarkNightBinding;

public class TheDarkNightFragment extends Fragment {
    private FragmentTheDarkNightBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentTheDarkNightBinding.inflate(inflater, container, false);
        binding.photoOfTheDarkNightButton.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.navigate_theDarkNightPage_To_theDarkNightDetailPage);
        });
        return binding.getRoot();
    }
}