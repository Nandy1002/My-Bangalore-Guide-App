package com.example.mybangaloreguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class EducationFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_education, container, false);

        ArrayList<PlaceBlock> educationBlock = new ArrayList<>();
        educationBlock.add(new PlaceBlock("IIIM - Bangalore",R.drawable.iiim_bangalore,4.1F));
        educationBlock.add(new PlaceBlock("Bangalore University",R.drawable.bangalore_university,4.2F));
        educationBlock.add(new PlaceBlock("RVCE - Bangalore",R.drawable.rv_college,4.8F));
        educationBlock.add(new PlaceBlock("MSRIT - Bangalore",R.drawable.msrit_bangalore,4.6F));
        educationBlock.add(new PlaceBlock("Christ University",R.drawable.christ_univ,4.5F));
        educationBlock.add(new PlaceBlock("PES University",R.drawable.pes_university,4.2F));
        educationBlock.add(new PlaceBlock("BMS College",R.drawable.bms_college,4.0F));
        educationBlock.add(new PlaceBlock("NHCE - Bangalore",R.drawable.new_horizon,3.8F));


        PlaceBlockAdapter placeBlockAdapter = new PlaceBlockAdapter(requireContext(),educationBlock);
        ListView edducationList = view.findViewById(R.id.education_place_list);
        edducationList.setAdapter(placeBlockAdapter);

        return view;
    }
}