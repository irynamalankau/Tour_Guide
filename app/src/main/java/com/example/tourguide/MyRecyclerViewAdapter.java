package com.example.tourguide;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;


public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder> {

    private final ArrayList<Information> mPlaces;

    //constant to identify layout of the list
    private final int VIEW_TYPE_CARD = 0;

    //constructor
    public MyRecyclerViewAdapter(ArrayList<Information> places) {
        mPlaces = places;
    }

    @Override
    public int getItemViewType(int position) {
        return mPlaces.get(position).getViewType();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == VIEW_TYPE_CARD) {
            return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_list_item_card, parent, false));
        }
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.bindPlace(mPlaces.get(position));
    }

    @Override
    public int getItemCount() {
        return mPlaces.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mName;
        public final TextView mAddress;
        public final TextView mPhoneNumber;
        public final ImageView mImage;
        public final TextView mDescription;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mName = (TextView) view.findViewById(R.id.list_item_name);
            mAddress = (TextView) view.findViewById(R.id.list_item_address);
            mPhoneNumber = (TextView) view.findViewById(R.id.list_item_phone);
            mImage = (ImageView) view.findViewById(R.id.list_item_image);
            mDescription = (TextView) view.findViewById((R.id.list_item_description));
        }

        public void bindPlace(Information place) {
            mName.setText(place.getName());
            mAddress.setText(place.getAddress());
            mPhoneNumber.setText(place.getPhoneNumber());
            mImage.setImageResource(place.getImageResource());
            if (place.hasDescription()){
                mDescription.setText(place.getDescription());
            } else{
                mDescription.setVisibility(View.GONE);
            }
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }
}