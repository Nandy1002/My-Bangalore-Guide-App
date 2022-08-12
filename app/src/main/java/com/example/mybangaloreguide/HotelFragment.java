package com.example.mybangaloreguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hotel, container, false);

        ArrayList<PlaceBlock> hotelList= new ArrayList<>();
        hotelList.add(new PlaceBlock("Hilton Hotel",R.drawable.hilton_hotel,4.5F));
        hotelList.add(new PlaceBlock("Kumarakrupa Hotel",R.drawable.kumarakrupa_hotel,4.2F));
        hotelList.add(new PlaceBlock("Lemon Tree Hotel",R.drawable.lemon_tree_hotel,4.3F));
        hotelList.add(new PlaceBlock("Howard Johnson",R.drawable.howard_johnson,4.1F));
        hotelList.add(new PlaceBlock("Leela Palace",R.drawable.leela_palace,4.6F));
        hotelList.add(new PlaceBlock("Royal Heritage Palace",R.drawable.royal_heritage,4F));
        hotelList.add(new PlaceBlock("Draper Startup House",R.drawable.draper_startup,4.8F));

        PlaceBlockAdapter hotelAdapter = new PlaceBlockAdapter(requireContext(),hotelList);

        ListView hotelBlock = view.findViewById(R.id.hotel_list);
        hotelBlock.setAdapter(hotelAdapter);
        return view;
    }
}