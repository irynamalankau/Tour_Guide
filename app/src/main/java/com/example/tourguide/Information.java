package com.example.tourguide;

import android.text.PrecomputedText;

public class Information {

    private String mName;
    private String mAddress;
    private String mPhoneNumber;
    private String mDescription;
    private int mImageResource;
    private String mCategory;

    private String CATEGORY_CARD_VIEW = "attractions";
    private int VIEW_TYPE_CARD = 0;
    private int VIEW_TYPE_ICON = 1;

    public Information(String name, String address, String phoneNumber, String category, String description, int imageResource) {
        mName = name;
        mAddress = address;
        mPhoneNumber = phoneNumber;
        mCategory = category;
        mDescription = description;
        mImageResource = imageResource;
    }

    public Information(String name, String address, String phoneNumber, String category, int imageResource) {
        mName = name;
        mAddress = address;
        mPhoneNumber = phoneNumber;
        mCategory = category;
        mImageResource = imageResource;
    }

    public String getName() {
        return mName;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getPhoneNumber() {
        return mPhoneNumber;
    }

    public String getDescription() {
        return mDescription;
    }

    public int getImageResource() {
        return mImageResource;
    }

    public boolean hasDescription() {
        return mDescription != null;
    }

    //method to get the layout view type based on the category of the information list
    public int getViewType() {
        if (mCategory.equalsIgnoreCase(CATEGORY_CARD_VIEW)) {
            return VIEW_TYPE_CARD;
        }
        return VIEW_TYPE_ICON;
    }

}
