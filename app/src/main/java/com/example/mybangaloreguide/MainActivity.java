package com.example.mybangaloreguide;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    HomeFragment homeFragment = new HomeFragment();
    TravelFragment travelFragment = new TravelFragment();
    EducationFragment educationFragment = new EducationFragment();
    RestaurantsFragment restaurantsFragment = new RestaurantsFragment();
    HotelFragment hotelFragment = new HotelFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navbar);

        getSupportFragmentManager().beginTransaction().replace(R.id.main_container,homeFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
               switch (item.getItemId()){
                   case R.id.home:
                       getSupportFragmentManager().beginTransaction().replace(R.id.main_container,homeFragment).commit();
                       return true;
                   case R.id.Education:
                       getSupportFragmentManager().beginTransaction().replace(R.id.main_container,educationFragment).commit();
                       return true;
                   case R.id.tour:
                       getSupportFragmentManager().beginTransaction().replace(R.id.main_container,travelFragment).commit();
                       return true;
                   case R.id.Food:
                       getSupportFragmentManager().beginTransaction().replace(R.id.main_container,restaurantsFragment).commit();
                       return true;
                   case R.id.hotel:
                       getSupportFragmentManager().beginTransaction().replace(R.id.main_container,hotelFragment).commit();
                       return true;
               }

                return false;

            }
        });
    }
}