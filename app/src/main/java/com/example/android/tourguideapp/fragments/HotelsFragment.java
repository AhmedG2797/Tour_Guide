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

public class HotelsFragment extends Fragment {

    public HotelsFragment() {
    }

    ListView listView;
    ArrayList<Location> locations;
    CustomAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_view, container, false);

        locations = new ArrayList<>();

        locations.add(new Location("Sofitel Cairo El Gezirah", "Cairo, Egypt", R.drawable.hotels));
        locations.add(new Location("Paris Hotel", "Central Cairo, Egypt", R.drawable.hotels));
        locations.add(new Location("Sofitel Legend Old", "Aswan, Egypt", R.drawable.hotels));
        locations.add(new Location("Sofitel Luxor Winter", "Luxor , Egypt", R.drawable.hotels));
        locations.add(new Location("Cairo Marriott", "Zamalak, Egypt", R.drawable.hotels));
        locations.add(new Location("Renaissance Cairo ", "Giza, Egypt", R.drawable.hotels));
        locations.add(new Location("Four Seasons Nile ", "Central Cairo, Egypt", R.drawable.hotels));
        locations.add(new Location("Mena House Oberoi", "Aswan, Egypt", R.drawable.hotels));
        locations.add(new Location("Talisman Hotel de ", "Central Cairo, Egypt", R.drawable.hotels));
        locations.add(new Location("Hotel Longchamps", "Zamalak, Egypt", R.drawable.hotels));

        listView = view.findViewById(R.id.list_view);

        adapter = new CustomAdapter(getContext(), locations, android.R.color.white);

        listView.setAdapter(adapter);

        return view;
    }

}
