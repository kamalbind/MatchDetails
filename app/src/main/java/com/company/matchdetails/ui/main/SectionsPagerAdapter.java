package com.company.matchdetails.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.company.matchdetails.R;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    private final String[] TAB_TITLES = new String[2];

    public SectionsPagerAdapter(FragmentManager fm, String team1, String team2) {
        super(fm);
        TAB_TITLES[0] = team1;
        TAB_TITLES[1] = team2;
    }

    @Override
    public Fragment getItem(int position) {
        return TeamPlayersFragment.newInstance(position + 1);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return TAB_TITLES[position];
    }

    @Override
    public int getCount() {
        return TAB_TITLES.length;
    }
}