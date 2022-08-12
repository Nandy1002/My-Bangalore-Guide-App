package com.example.mybangaloreguide;

public class PlaceBlock {
    private String placeName;
    private int pictureID;
    private float starRating;
    public PlaceBlock(String name, int PicId, float Rating){
        this.placeName = name;
        this.pictureID = PicId;
        this.starRating = Rating;
    }
    public String getPlaceName(){
        return placeName;
    }
    public int getPictureID(){
        return pictureID;
    }

    public float getStarRating() {
        return starRating;
    }
}
