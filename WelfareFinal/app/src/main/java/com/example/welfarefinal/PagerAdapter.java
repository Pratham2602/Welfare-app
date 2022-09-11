package com.example.welfarefinal;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {
    private int tabsNumber;

    public PagerAdapter(@NonNull FragmentManager fm,int tabs) {
        super(fm);
        this.tabsNumber=tabs;
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new First();
            case 1:
                return new Second();
            case 2 :
                return new Third();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return tabsNumber;
    }
}
