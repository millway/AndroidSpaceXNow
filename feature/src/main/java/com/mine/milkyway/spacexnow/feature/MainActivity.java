package com.mine.milkyway.spacexnow.feature;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragmet = null  ;

            int id = item.getItemId();
            if (id == R.id.navigation_missions) {
                fragmet = new MissionsFragment();
            } else if (id == R.id.navigation_notifications) {
                fragmet = new NotificationsFragment();
            } else if (id == R.id.navigation_stats) {
                fragmet = new StatsFragment();
            } else if (id == R.id.navigation_Settings) {
                fragmet = new SettingsFragment();
            }

            return loadFragment(fragmet);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadFragment(new MissionsFragment());


        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    private  boolean loadFragment(Fragment fragment){
        //switching fragment

        if (fragment != null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_Container,fragment).commit();
            return  true;
        }

        return  false;
    }
}
