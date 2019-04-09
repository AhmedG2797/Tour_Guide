package com.example.android.tourguideapp.models;

public class Location {

    private String place, address;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int image;

    public Location() {
    }

    public Location(String place, String address, int image) {
        this.place = place;
        this.address = address;
        this.image = image;
    }

    public String getPlace() {
        return place;
    }

    public String getAddress() {
        return address;
    }

    public int getImage() {
        return image;
    }

    public boolean hasImage(){
        return image != NO_IMAGE_PROVIDED;
    }
}
