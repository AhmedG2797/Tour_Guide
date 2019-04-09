package com.example.android.tourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.android.tourguideapp.activities.FoodAndDrink;
import com.example.android.tourguideapp.activities.HotelAndHospital;
import com.example.android.tourguideapp.activities.MetroStation;
import com.example.android.tourguideapp.activities.TourismPLaces;

public class MainActivity extends AppCompatActivity {

    LinearLayout IntroLogo;
    LinearLayout FoodandDrink;
    LinearLayout TourismLogo;
    LinearLayout HotelsandHospitals;
    LinearLayout Metro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IntroLogo = findViewById(R.id.logoID);
        FoodandDrink = findViewById(R.id.foodanddrinksID);
        TourismLogo = findViewById(R.id.tourismID);
        HotelsandHospitals = findViewById(R.id.hotelandhospitalID);
        Metro = findViewById(R.id.metroID);

        IntroLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getBaseContext(), "This app help you to know information " +
                                "about every famous places in Egypt ",
                        Toast.LENGTH_LONG).show();
            }
        });

        FoodandDrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, FoodAndDrink.class);
                startActivity(intent);
            }
        });

        TourismLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, TourismPLaces.class);
                startActivity(intent);
            }
        });

        HotelsandHospitals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, HotelAndHospital.class);
                startActivity(intent);
            }
        });

        Metro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, MetroStation.class);
                startActivity(intent);
            }
        });
    }
}
