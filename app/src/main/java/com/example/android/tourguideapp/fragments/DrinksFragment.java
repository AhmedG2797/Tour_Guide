package com.example.android.tourguideapp.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.android.tourguideapp.R;
import com.example.android.tourguideapp.adapters.CustomAdapter;
import com.example.android.tourguideapp.models.Location;

import java.util.ArrayList;

public class DrinksFragment extends Fragment {

    public DrinksFragment() {
    }

    ListView listView;
    ArrayList<Location> locations;
    CustomAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_view, container, false);

        locations = new ArrayList<>();

        locations.add(new Location("Shakespeare Co Café", "6th October, Egypt", R.drawable.drinks));
        locations.add(new Location("Café Greco", "Maadi, Egypt", R.drawable.drinks));
        locations.add(new Location("Kafficho", "Zamalek, Egypt", R.drawable.drinks));
        locations.add(new Location("Qahwa", "Sheikh Zayed , Egypt", R.drawable.drinks));
        locations.add(new Location("Cake Café", "Zamalek, Egypt", R.drawable.drinks));
        locations.add(new Location("Simonds", "Dokki, Egypt", R.drawable.drinks));
        locations.add(new Location("Karakeeb", "6th October, Egypt", R.drawable.drinks));
        locations.add(new Location("Zack’s Café", "Al Rehab, Egypt", R.drawable.drinks));
        locations.add(new Location("Kafein", "Downtown, Egypt", R.drawable.drinks));
        locations.add(new Location("L’Aroma", "Marina North Coast", R.drawable.drinks));

        listView = view.findViewById(R.id.list_view);

        adapter = new CustomAdapter(getContext(), locations, android.R.color.white);

        listView.setAdapter(adapter);

        return view;
    }

}
