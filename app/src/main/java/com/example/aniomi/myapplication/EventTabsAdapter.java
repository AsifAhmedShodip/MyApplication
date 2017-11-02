package com.example.aniomi.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import static com.example.aniomi.myapplication.EventTabs.int_items;

/**
 * Created by aniomi on 11/3/17.
 */

public class EventTabsAdapter  extends FragmentPagerAdapter {
    public EventTabsAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Attending_Fragment();
            case 1:
                return new Interested_Fragment();
            case 2:
                return  new Not_Intersted_Fragment();
            case 3:
                return new Invitation_Fragment();


        }
        return null;
    }

    @Override
    public int getCount() {


        return int_items;
    }

    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Attending";
            case 1:
                return "Iterested";
            case 2:
                return "Not Interested";
            case 3:
                return "Invitation";

        }

        return null;
    }
}
