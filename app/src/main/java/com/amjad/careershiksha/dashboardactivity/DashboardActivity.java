package com.amjad.careershiksha.dashboardactivity;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.amjad.careershiksha.R;
import com.amjad.careershiksha.ui.categoryfragment.CategoryFragment;
import com.amjad.careershiksha.ui.homefragment.HomeFragment;
import com.amjad.careershiksha.ui.settingfragment.SettingsFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DashboardActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        bottomNavigationView
                = findViewById(R.id.bottomNavigationView);

        bottomNavigationView
                .setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.home);

    }

    HomeFragment homeFragment = new HomeFragment();
    CategoryFragment categoryFragment = new CategoryFragment();
    SettingsFragment settingsFragment = new SettingsFragment();

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.home){
            loadFragment(homeFragment);
            return true;
        }else if (id == R.id.category){
            loadFragment(categoryFragment);
            return true;
        }else if (id == R.id.setting){
            loadFragment(settingsFragment);
            return true;
        }
        return false;
    }
    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.flFragment, fragment)
                .commit();
    }
}