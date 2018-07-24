package com.mine.milkyway.spacexnow.feature;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            int id = item.getItemId();
            if (id == R.id.navigation_missions) {
                mTextMessage.setText(R.string.title_Missions);
                return true;
            } else if (id == R.id.navigation_notifications) {
                mTextMessage.setText(R.string.title_Notifications);
                return true;
            } else if (id == R.id.navigation_stats) {
                mTextMessage.setText(R.string.title_Stats);
                return true;
            } else if (id == R.id.navigation_Settings) {
                mTextMessage.setText(R.string.title_Settings);
                return true;
            }

            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
