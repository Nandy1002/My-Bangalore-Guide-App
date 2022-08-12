package com.example.mybangaloreguide;

import android.graphics.drawable.shapes.Shape;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import java.util.ArrayList;

public class TravelFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_travel, container, false);

        ArrayList<PlaceBlock> tourBlock = new ArrayList<>();
        tourBlock.add(new PlaceBlock("Lalbagh Garden",R.drawable.lalbagh, 4.4F));
        tourBlock.add(new PlaceBlock("Bannerghatta Zoo",R.drawable.bannerghatta,4.2F));
        tourBlock.add(new PlaceBlock("St. Mary's Basilica",R.drawable.mary_basilica,4.6F));
        tourBlock.add(new PlaceBlock("Cubbon Park",R.drawable.cubbon,4.4F));
        tourBlock.add(new PlaceBlock("Lalbagh Lake",R.drawable.lalbagh_lake,4.5F));
        tourBlock.add(new PlaceBlock("Turahalli",R.drawable.turahalli,4.1F));
        tourBlock.add(new PlaceBlock("Dodda Aalada Mara",R.drawable.dodda,4.1F));
        tourBlock.add(new PlaceBlock("Mahatmagandhi Park",R.drawable.mahatmagandhi_park,4.1F));
        tourBlock.add(new PlaceBlock("Turahalli Forest",R.drawable.turahalli_forest,4.3F));
        tourBlock.add(new PlaceBlock("Butterfly Park",R.drawable.butterfly_park,3.9F));


        PlaceBlockAdapter tourAdapter = new PlaceBlockAdapter(requireContext(),tourBlock);
        ListView linearLayout = view.findViewById(R.id.tour_place_list);

        linearLayout.setAdapter(tourAdapter);

        return view;
    }
}