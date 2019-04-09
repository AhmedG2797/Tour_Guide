package com.example.android.tourguideapp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.android.tourguideapp.R;
import com.example.android.tourguideapp.adapters.CustomAdapter;
import com.example.android.tourguideapp.models.Location;

import java.util.ArrayList;

public class MetroStation extends AppCompatActivity {

    ListView stationList;
    ArrayList<Location> locations;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        stationList = findViewById(R.id.list_view);

        locations = new ArrayList<>();

        locations.add(new Location("Shubra El-Kheima ", "Cairo, Egypt", R.drawable.metrostation));
        locations.add(new Location("Kolleyyet El-Zeraa", "Cairo, Egypt", R.drawable.metrostation));
        locations.add(new Location("Mezallat", "Cairo, Egypt", R.drawable.metrostation));
        locations.add(new Location("Khalafawy", "Cairo, Egypt", R.drawable.metrostation));
        locations.add(new Location("St. Teresa", "Cairo, Egypt", R.drawable.metrostation));
        locations.add(new Location("Rod El-Farag", "Cairo, Egypt", R.drawable.metrostation));
        locations.add(new Location("Masarra", "Cairo, Egypt", R.drawable.metrostation));
        locations.add(new Location("Al Shohadaa", "Cairo, Egypt", R.drawable.metrostation));
        locations.add(new Location("Attaba", "Cairo, Egypt", R.drawable.metrostation));
        locations.add(new Location("Mohamed Naguib", "Cairo, Egypt", R.drawable.metrostation));
        locations.add(new Location("Sadat", "Cairo, Egypt", R.drawable.metrostation));
        locations.add(new Location("Opera", "Cairo, Egypt", R.drawable.metrostation));
        locations.add(new Location("Dokki", "Cairo, Egypt", R.drawable.metrostation));
        locations.add(new Location("Bohooth", "Cairo, Egypt", R.drawable.metrostation));
        locations.add(new Location("Cairo University", "Cairo, Egypt", R.drawable.metrostation));
        locations.add(new Location("Faisal", "Cairo, Egypt", R.drawable.metrostation));
        locations.add(new Location("El-Giza", "Cairo, Egypt", R.drawable.metrostation));
        locations.add(new Location("Omm El-Misryeen", "Cairo, Egypt", R.drawable.metrostation));
        locations.add(new Location("Sakiat Mekki", "Cairo, Egypt", R.drawable.metrostation));
        locations.add(new Location("El-Mounib", "Cairo, Egypt", R.drawable.metrostation));


        adapter = new CustomAdapter(this, locations, android.R.color.white);

        stationList.setAdapter(adapter);
    }
}
