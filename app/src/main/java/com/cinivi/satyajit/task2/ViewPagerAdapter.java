package com.cinivi.satyajit.task2;

/**
 * Created by SmAckJack on 28-12-2017.
 */
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.cinivi.satyajit.task2.fragments.FragmentOne;
import com.cinivi.satyajit.task2.fragments.FragmentThree;
import com.cinivi.satyajit.task2.fragments.FragmentTwo;


public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if (position == 0) {
            fragment = new FragmentOne();
        } else if (position == 1) {
            fragment = new FragmentTwo();
        }
        else if (position == 2) {
            fragment = new FragmentThree();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if (position == 0) {
            title = "Tab-1";
        } else if (position == 1) {
            title = "Tab-2";
        }
        else if (position == 2) {
            title = "Tab-3";
        }
        return title;
    }
}