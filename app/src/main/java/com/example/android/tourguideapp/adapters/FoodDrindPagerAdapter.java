package com.example.android.tourguideapp.adapters;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.tourguideapp.fragments.DrinksFragment;
import com.example.android.tourguideapp.fragments.FoodsFragment;

public class FoodDrindPagerAdapter extends FragmentPagerAdapter {

    private Context context;

    public FoodDrindPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0)
            return new FoodsFragment();
        else
            return new DrinksFragment();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0)
            return "Foods";
        else
            return "Drinks";
    }

    @Override
    public int getCount() {
        return 2;
    }
}
