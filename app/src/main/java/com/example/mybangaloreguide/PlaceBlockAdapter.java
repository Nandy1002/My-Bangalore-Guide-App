package com.example.mybangaloreguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class PlaceBlockAdapter extends ArrayAdapter<PlaceBlock> {
    public PlaceBlockAdapter(@NonNull Context context, ArrayList<PlaceBlock> placeBlockArrayList) {
        super(context, 0, placeBlockArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.place_block, parent, false);
        }
        PlaceBlock placeBlock = getItem(position);
        TextView blockText = listItemView.findViewById(R.id.place_name);
        blockText.setText(placeBlock.getPlaceName());
        ImageView blockImage = listItemView.findViewById(R.id.place_image);
        blockImage.setImageResource(placeBlock.getPictureID());
        RatingBar blockRating = listItemView.findViewById(R.id.ratingBar);
        blockRating.setRating(placeBlock.getStarRating());

        return listItemView;
    }
}