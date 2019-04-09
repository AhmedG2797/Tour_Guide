package com.example.android.tourguideapp.adapters;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.tourguideapp.R;
import com.example.android.tourguideapp.models.Location;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<Location> {

    Context context;
    int mColorResourceId;

    public CustomAdapter(Context context, List<Location> objects, int colorResourceId) {
        super(context, 0, objects);

        this.context = context;
        this.mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null){
            convertView = LayoutInflater.from(context)
                    .inflate(R.layout.list_item_view, parent, false);
        }

        TextView place = convertView.findViewById(R.id.place_ID);
        TextView address = convertView.findViewById(R.id.address_ID);
        ImageView imageItem = convertView.findViewById(R.id.image_item_ID);

        Location currentLocation = getItem(position);

        place.setText(currentLocation.getPlace());
        address.setText(currentLocation.getAddress());
        if (currentLocation.hasImage()){

            imageItem.setImageResource(currentLocation.getImage());
            imageItem.setVisibility(View.VISIBLE);
        } else {

            imageItem.setVisibility(View.GONE);
        }

        View textContainer = convertView.findViewById(R.id.textContainer);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return convertView;
    }
}
