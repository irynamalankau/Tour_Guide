package com.example.tourguide;

import android.text.PrecomputedText;

public class Information {

    private String mName;
    private String mAddress;
    private String mPhoneNumber;
    private String mDescription;
    private int mImageResource;

    public Information(String name, String address, String phoneNumber, String description, int imageResource){
        mName = name;
        mAddress= address;
        mPhoneNumber = phoneNumber;
        mDescription = description;
        mImageResource = imageResource;
    }

    public Information(String name, String address, String phoneNumber, int imageResource){
        mName = name;
        mAddress= address;
        mPhoneNumber = phoneNumber;
        mImageResource = imageResource;
    }

    public String getName(){
        return mName;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getPhoneNumber() {
        return mPhoneNumber;
    }

    public String getDescription(){
        return mDescription;
    }

    public int getImageResource(){
        return mImageResource;
    }

}
