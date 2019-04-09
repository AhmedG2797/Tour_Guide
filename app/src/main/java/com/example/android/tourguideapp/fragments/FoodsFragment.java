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

public class FoodsFragment extends Fragment {

    public FoodsFragment() {
    }

    ListView listView;
    ArrayList<Location> locations;
    CustomAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.list_view, container, false);
        
        locations = new ArrayList<>();

        locations.add(new Location("Sequoia", "Zamalek, Egypt", R.drawable.food));
        locations.add(new Location("Andrea", "New Giza, Egypt", R.drawable.food));
        locations.add(new Location("Il Piccolo Mondo", "Zamalek, Egypt", R.drawable.food));
        locations.add(new Location("Tabla LUNA", "Maadi Zayed , Egypt", R.drawable.food));
        locations.add(new Location("Abou El Sid", "Zamalek, Egypt", R.drawable.food));
        locations.add(new Location("Naguib Mahfouz Cafe", "Khan El Khalili, Egypt", R.drawable.food));
        locations.add(new Location("Maison Thomas", "Zamalek, Egypt", R.drawable.food));
        locations.add(new Location("OAK Grill", "Nile Corniche, Egypt", R.drawable.food));
        locations.add(new Location("L’Asiatique", "Nile Corniche, Egypt", R.drawable.food));
        locations.add(new Location("Imperial Boat", "Zamalek, Egypt", R.drawable.food));

        listView = view.findViewById(R.id.list_view);

        adapter = new CustomAdapter(getContext(), locations, android.R.color.white);

        listView.setAdapter(adapter);

        return view;
    }

}
