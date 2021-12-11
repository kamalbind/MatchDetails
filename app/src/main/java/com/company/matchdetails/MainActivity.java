package com.company.matchdetails;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.annotation.ColorInt;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.company.matchdetails.ui.main.SectionsPagerAdapter;

public class MainActivity extends AppCompatActivity {

    private SectionsPagerAdapter sectionsPagerAdapter;
    private ViewPager viewPager;
    private TabLayout tabs;
    private FloatingActionButton fab;

    @ColorInt private int SELECTED_TAB_COLOR;
    @ColorInt private int NOT_SELECTED_TAB_COLOR;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SELECTED_TAB_COLOR = getColor(R.color.purple_200);
        NOT_SELECTED_TAB_COLOR = getColor(R.color.purple_500);

        sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        viewPager = findViewById(R.id.view_pager);
        tabs = findViewById(R.id.tabs);
        fab = findViewById(R.id.fab);
        viewPager.setAdapter(sectionsPagerAdapter);
        tabs.setupWithViewPager(viewPager);

        fab.setOnClickListener(view -> Snackbar.make(view, "Refresh", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show());

    }

    @Override
    protected void onResume() {
        super.onResume();
        tabs.getTabAt(tabs.getSelectedTabPosition()).view.setBackgroundColor(SELECTED_TAB_COLOR);
        tabs.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                tab.view.setBackgroundColor(SELECTED_TAB_COLOR);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                tab.view.setBackgroundColor(NOT_SELECTED_TAB_COLOR);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                tab.view.setBackgroundColor(SELECTED_TAB_COLOR);
            }
        });
    }
}