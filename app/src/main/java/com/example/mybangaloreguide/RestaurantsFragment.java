package com.example.mybangaloreguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_restaurants, container, false);
        ArrayList<PlaceBlock> foodCorner = new ArrayList<>();
        foodCorner.add(new PlaceBlock("The Only Place",R.drawable.the_only_place,4.5F));
        foodCorner.add(new PlaceBlock("Hoot Brewery & Cafe",R.drawable.hoot_brewery,4.2F));
        foodCorner.add(new PlaceBlock("Onesta",R.drawable.onesta,4F));
        foodCorner.add(new PlaceBlock("Edo Restaurant",R.drawable.edo_restaurant,3.9F));
        foodCorner.add(new PlaceBlock("Tiot",R.drawable.tiot,3.8F));

        PlaceBlockAdapter foodAdapter = new PlaceBlockAdapter(requireContext(),foodCorner);

        ListView restaurantList = view.findViewById(R.id.restaurant_list);
        restaurantList.setAdapter(foodAdapter);
        return view;
    }
}