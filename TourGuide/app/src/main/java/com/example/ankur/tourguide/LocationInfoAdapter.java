package com.example.ankur.tourguide;

/**
 * Created by Ankur on 11-02-2018.
 */

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class LocationInfoAdapter extends ArrayAdapter<LocationInfo> {

    public LocationInfoAdapter(Context context,List<LocationInfo> locationInfo) {
        super(context, 0, locationInfo);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LocationInfo posItem = getItem(position);
        View view = convertView;

        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.list_layout, parent, false);
        }

        ImageView image = view.findViewById(R.id.imageId);
        TextView heading = view.findViewById(R.id.heading);
        TextView info = view.findViewById(R.id.info);

        image.setImageResource(posItem.getImageResId());
        heading.setText(posItem.getHeading());
        info.setText(posItem.getInfo());

        return view;
    }
}
