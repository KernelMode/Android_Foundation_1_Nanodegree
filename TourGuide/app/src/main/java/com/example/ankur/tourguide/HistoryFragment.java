package com.example.ankur.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HistoryFragment extends Fragment {

    public HistoryFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_history, container, false);

        ArrayList<LocationInfo> infoList = new ArrayList<LocationInfo>();
        infoList.add(new LocationInfo(getString(R.string.capitolheading), R.drawable.thecapitol, getString(R.string.capitolinfo)));

        LocationInfoAdapter adapter = new LocationInfoAdapter(v.getContext(),infoList);
        ListView view = v.findViewById(R.id.historyView);
        view.setAdapter(adapter);

        return v;
    }
}
