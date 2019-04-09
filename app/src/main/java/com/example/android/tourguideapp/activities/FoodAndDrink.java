package com.example.android.tourguideapp.activities;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.tourguideapp.R;
import com.example.android.tourguideapp.adapters.FoodDrindPagerAdapter;

public class FoodAndDrink extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    FoodDrindPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment);

        viewPager = findViewById(R.id.view_pagerID);
        adapter = new FoodDrindPagerAdapter(this, getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        tabLayout = findViewById(R.id.tabID);
        tabLayout.setupWithViewPager(viewPager);

    }
}
