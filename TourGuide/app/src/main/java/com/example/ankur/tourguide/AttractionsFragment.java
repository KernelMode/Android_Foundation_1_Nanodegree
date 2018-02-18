package com.example.ankur.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class AttractionsFragment extends Fragment {

    public AttractionsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_attractions, container, false);

        ArrayList<LocationInfo> infoList = new ArrayList<LocationInfo>();
        infoList.add(new LocationInfo(getString(R.string.sukhnaheading), R.drawable.sukhna, getString(R.string.sukhnainfo)));
        infoList.add(new LocationInfo(getString(R.string.rockheading), R.drawable.rockgarden, getString(R.string.rockinfo)));
        infoList.add(new LocationInfo(getString(R.string.chhatbirheading), R.drawable.chhatbir, getString(R.string.chhatbirinfo)));
        infoList.add(new LocationInfo(getString(R.string.roseheading), R.drawable.rosegarden, getString(R.string.roseinfo)));

        ListView list = v.findViewById(R.id.attractionView);
        LocationInfoAdapter adapter = new LocationInfoAdapter(v.getContext(),infoList);
        list.setAdapter(adapter);

        return v;
    }
}
