package com.example.android.tourguideapp.adapters;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.tourguideapp.fragments.HospitalFragment;
import com.example.android.tourguideapp.fragments.HotelsFragment;

public class HotelHospitalPagerAdapter extends FragmentPagerAdapter {

    private Context context;
    public HotelHospitalPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0)
            return new HotelsFragment();
        else
            return new HospitalFragment();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0)
            return "Hotels";
        else
            return "Hospitals";
    }

    @Override
    public int getCount() {
        return 2;
    }
}
