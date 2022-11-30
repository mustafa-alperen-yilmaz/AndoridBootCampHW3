package com.example.bootcamphw3;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bootcamphw3.databinding.FragmentInterstellarBinding;


public class InterstellarFragment extends Fragment {

    private FragmentInterstellarBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentInterstellarBinding.inflate(inflater, container, false);
        binding.buyInerstellarButton.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.navigate_interstallerPage_To_purchasePage);
        });
        return binding.getRoot();
    }
}