package com.example.ankur.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_restaurants, container, false);

        ArrayList<LocationInfo> infoList = new ArrayList<LocationInfo>();
        infoList.add(new LocationInfo(getString(R.string.sheronzheading),R.drawable.sheronz,getString(R.string.sheronzinfo)));
        infoList.add(new LocationInfo(getString(R.string.orangeheading), R.drawable.orange, getString(R.string.orangeinfo)));
        infoList.add(new LocationInfo(getString(R.string.barbequeheading), R.drawable.barbeque, getString(R.string.barbequeinfo)));

        ListView list = v.findViewById(R.id.restaurantView);
        LocationInfoAdapter adapter = new LocationInfoAdapter(v.getContext(),infoList);
        list.setAdapter(adapter);

        return v;
    }
}
