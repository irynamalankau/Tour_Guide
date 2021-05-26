package com.example.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import java.util.ArrayList;


public class HotelsFragment extends Fragment {

    private ArrayList<Information> placeInfo = new ArrayList<>();
    private MyRecyclerViewAdapter adapter;

    public HotelsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list_horizontal_scroll, container, false);
        //set the list of hotels
        placeInfo.add(new Information(getString(R.string.hotel_name_one),
                getString(R.string.hotel_address_one),
                getString(R.string.hotel_phone_one),
                getString(R.string.category_hotels),
                R.drawable.ic_image_placeholder));
        placeInfo.add(new Information(getString(R.string.hotel_name_two),
                getString(R.string.hotel_address_two),
                getString(R.string.hotel_phone_two),
                getString(R.string.category_hotels),
                R.drawable.ic_image_placeholder));
        placeInfo.add(new Information(getString(R.string.hotel_name_three),
                getString(R.string.hotel_address_three),
                getString(R.string.hotel_phone_three),
                getString(R.string.category_hotels),
                R.drawable.ic_image_placeholder));
        placeInfo.add(new Information(getString(R.string.hotel_name_four),
                getString(R.string.hotel_address_four),
                getString(R.string.hotel_phone_four),
                getString(R.string.category_hotels),
                R.drawable.ic_image_placeholder));

        //get recyclerView by id
        RecyclerView recyclerView = view.findViewById(R.id.list);
        //add LayoutManager
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        //adapter instance
        adapter = new MyRecyclerViewAdapter(placeInfo);
        //set adapter
        recyclerView.setAdapter(adapter);
        //add vertical divider
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(), LinearLayoutManager.VERTICAL));

        return view;
    }
}