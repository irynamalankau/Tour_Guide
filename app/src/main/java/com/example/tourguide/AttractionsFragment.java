package com.example.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class AttractionsFragment extends Fragment {

    private ArrayList<Information> placeInfo = new ArrayList<>();
    private MyRecyclerViewAdapter adapter;

    public AttractionsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);

        //set the list of attractions
        placeInfo.add(new Information(getString(R.string.attr_name_one),
                getString(R.string.attr_address_one),
                getString(R.string.attr_phone_one),
                getString(R.string.category_attractions),
                getString(R.string.attr_description_one),
                R.drawable.kohl_museum));
        placeInfo.add(new Information(getString(R.string.attr_name_two),
                getString(R.string.attr_address_two),
                getString(R.string.attr_phone_two),
                getString(R.string.category_attractions),
                getString(R.string.attr_description_two),
                R.drawable.wagner_farm));
        placeInfo.add(new Information(getString(R.string.attr_name_three),
                getString(R.string.attr_address_three),
                getString(R.string.attr_phone_three),
                getString(R.string.category_attractions),
                getString(R.string.attr_description_three),
                R.drawable.the_grove));
        placeInfo.add(new Information(getString(R.string.attr_name_four),
                getString(R.string.attr_address_four),
                getString(R.string.attr_phone_four),
                getString(R.string.category_attractions),
                getString(R.string.attr_description_four),
                R.drawable.theater_oil_lamp));

        //get recyclerView by id
        RecyclerView recyclerView = view.findViewById(R.id.list);
        //add LayoutManager
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        //adapter instance
        adapter = new MyRecyclerViewAdapter(placeInfo);
        //set adapter
        recyclerView.setAdapter(adapter);

        return view;
    }
}