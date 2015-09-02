package com.example.sammy.ngpaytest;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by sammy on 5/8/15.
 */
public class myFragAdapter extends FragmentPagerAdapter {

    public myFragAdapter(FragmentManager fm) {
        super(fm);
    }

    public Fragment getItem(int i) {
        switch(i) {
            case 0: return Page.newInstance("One","1");
            case 1: return Page.newInstance("Two","2");
            default: return Page.newInstance("Three","3");
        }
    }

    public int getCount() {
        return 3;
    }
}
