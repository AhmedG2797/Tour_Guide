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

public class HospitalFragment extends Fragment {

    public HospitalFragment() {
    }

    ListView listView;
    ArrayList<Location> locations;
    CustomAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_view, container, false);

        locations = new ArrayList<>();

        locations.add(new Location("As Salam International", "Cairo ,Egypt", R.drawable.hospitals));
        locations.add(new Location("Ganzouri Specialized", "Cairo ,Egypt", R.drawable.hospitals));
        locations.add(new Location("Dar Al Fouad Hospital", "Cairo ,Egypt", R.drawable.hospitals));
        locations.add(new Location("Arab Contractors", "Cairo ,Egypt", R.drawable.hospitals));
        locations.add(new Location("South Egypt Cancer", "Cairo ,Egypt", R.drawable.hospitals));
        locations.add(new Location("Kamal Shaeer Hospital", "Cairo ,Egypt", R.drawable.hospitals));
        locations.add(new Location("Cairo Scan Radiology", "Cairo ,Egypt", R.drawable.hospitals));
        locations.add(new Location("Dar El Oyoun Eye ", "Cairo ,Egypt", R.drawable.hospitals));
        locations.add(new Location("Sphinx Oncology ", "Cairo ,Egypt", R.drawable.hospitals));
        locations.add(new Location("Cleopatra Hospital", "Cairo ,Egypt", R.drawable.hospitals));

        listView = view.findViewById(R.id.list_view);

        adapter = new CustomAdapter(getContext(), locations, android.R.color.white);

        listView.setAdapter(adapter);

        return view;
    }

}
