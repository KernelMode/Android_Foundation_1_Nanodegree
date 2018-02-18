package com.example.ankur.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class InstitutesFragment extends Fragment {

    public InstitutesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_institutes, container, false);

        ArrayList<LocationInfo> infoList = new ArrayList<LocationInfo>();
        infoList.add(new LocationInfo(getString(R.string.chitkaraheading), R.drawable.chitkara, getString(R.string.chitkarainfo)));
        infoList.add(new LocationInfo(getString(R.string.cuheading), R.drawable.cu, getString(R.string.cuinfo)));
        infoList.add(new LocationInfo(getString(R.string.puheading), R.drawable.pu, getString(R.string.puinfo)));

        LocationInfoAdapter adapter = new LocationInfoAdapter(v.getContext(),infoList);
        ListView list = v.findViewById(R.id.instView);
        list.setAdapter(adapter);

        return v;
    }
}
