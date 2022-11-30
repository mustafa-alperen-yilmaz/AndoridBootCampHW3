package com.example.bootcamphw3;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bootcamphw3.databinding.FragmentPurchaseBinding;


public class PurchaseFragment extends Fragment {
    private FragmentPurchaseBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentPurchaseBinding.inflate(inflater, container, false);
        binding.goMainPageButton.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.navigate_purchasePage_To_movieMainPage);
        });
        return binding.getRoot();
    }
}