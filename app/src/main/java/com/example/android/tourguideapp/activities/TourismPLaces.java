package com.example.android.tourguideapp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.android.tourguideapp.R;
import com.example.android.tourguideapp.adapters.CustomAdapter;
import com.example.android.tourguideapp.models.Location;

import java.util.ArrayList;

public class TourismPLaces extends AppCompatActivity {

    ListView tourismList;
    ArrayList<Location> locations;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        tourismList = findViewById(R.id.list_view);

        locations = new ArrayList<>();

        locations.add(new Location("Pyramid of Giza ", "Al Haram Str. Giza", R.drawable.pyramidsofgiza));
        locations.add(new Location("Abu Simbel", "Aswan, Egypt", R.drawable.abusimbel));
        locations.add(new Location("The White Desert", "Farafra, Egypt", R.drawable.thewhitedesertegypt));
        locations.add(new Location("Karnak Temple", "Luxor , Egypt", R.drawable.karnaktempleegypt));
        locations.add(new Location("Mohamed Ali Islamic", "Citadel of Saladin", R.drawable.mohamedmlimosqueinislamiccairo));
        locations.add(new Location("Nile Valley", "Cairo, Egypt", R.drawable.nilevalley));
        locations.add(new Location("Sinai Peninsula", "peninsula, Egypt", R.drawable.sinaipeninsula));
        locations.add(new Location("Valley of the Kings", "Luxor, Egypt", R.drawable.valleyofthekings));
        locations.add(new Location("Dendera Temple", "Qena, Egypt", R.drawable.denderatemple));
        locations.add(new Location("Abydos", "Abydos, Egypt", R.drawable.templeofsetiabydosegypt));

        adapter = new CustomAdapter(this, locations, android.R.color.white);

        tourismList.setAdapter(adapter);

    }
}
