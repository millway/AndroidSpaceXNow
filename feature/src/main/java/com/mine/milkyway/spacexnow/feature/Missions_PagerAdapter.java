package com.mine.milkyway.spacexnow.feature;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

public class Missions_PagerAdapter extends FragmentPagerAdapter {
    int mNumOfTabs;

    public Missions_PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                Missions_UpcomingFragment tab1 = new Missions_UpcomingFragment();
                return tab1;
            case 1:
                Missions_PastFragment tab2 = new Missions_PastFragment();
                return tab2;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}