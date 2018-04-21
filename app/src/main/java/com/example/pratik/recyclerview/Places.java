package com.example.pratik.recyclerview;

public class Places {
    public String placeName, placeInfo;
    public int location;

    public Places(String placeName, String placeInfo,int location) {
        this.placeName = placeName;
        this.placeInfo = placeInfo;
        this.location = location;
    }

    public String getPlaceName() {
        return placeName;
    }

    public String getPlaceInfo() {
        return placeInfo;
    }

    public int getLocation() {
        return location;
    }
}
