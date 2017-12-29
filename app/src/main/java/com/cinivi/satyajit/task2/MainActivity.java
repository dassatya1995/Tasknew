package com.cinivi.satyajit.task2;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.cinivi.satyajit.task2.fragments.FragmentOne;
import com.cinivi.satyajit.task2.fragments.FragmentThree;
import com.cinivi.satyajit.task2.fragments.FragmentTwo;


public class MainActivity extends AppCompatActivity implements FragmentOne.SendMessage,FragmentTwo.SendMessage2 {

    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }


    @Override
    public void sendData(String message) {
        String tag1 = "android:switcher:" + R.id.viewPager + ":" + 2;
        FragmentThree f3 = (FragmentThree) getSupportFragmentManager().findFragmentByTag(tag1);
        f3.displayReceivedData(message);
    }
    @Override
    public void sendData2(String message2) {
        String tag2 = "android:switcher:" + R.id.viewPager + ":" + 2;
        FragmentThree f3 = (FragmentThree) getSupportFragmentManager().findFragmentByTag(tag2);
        f3.displayReceivedData2(message2);
    }

}