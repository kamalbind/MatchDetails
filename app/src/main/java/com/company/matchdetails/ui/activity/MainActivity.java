package com.company.matchdetails.ui.activity;

import android.os.Bundle;

import com.company.matchdetails.R;
import com.company.matchdetails.viewmodel.MatchViewModel;
import com.google.android.material.tabs.TabLayout;

import androidx.annotation.ColorInt;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.widget.Toast;

import com.company.matchdetails.ui.main.SectionsPagerAdapter;

public class MainActivity extends AppCompatActivity {

    private SectionsPagerAdapter sectionsPagerAdapter;
    private ViewPager viewPager;
    private TabLayout tabs;
    private MatchViewModel matchViewModel;

    @ColorInt private int SELECTED_TAB_COLOR;
    @ColorInt private int NOT_SELECTED_TAB_COLOR;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.view_pager);
        tabs = findViewById(R.id.tabs);
        SELECTED_TAB_COLOR = getColor(R.color.purple_200);
        NOT_SELECTED_TAB_COLOR = getColor(R.color.purple_500);

        matchViewModel = new ViewModelProvider(this).get(MatchViewModel.class);
        matchViewModel.init(this);
        matchViewModel.fetchData(MatchViewModel.URL_2);

        matchViewModel.isDataFetched.observe(this, isFetched -> {
            if (isFetched) {
                sectionsPagerAdapter = new SectionsPagerAdapter(
                        getSupportFragmentManager(),
                        matchViewModel.team1Name,
                        matchViewModel.team2Name);
                viewPager.setAdapter(sectionsPagerAdapter);
                tabs.setupWithViewPager(viewPager);
            }
        });

        matchViewModel.errorMsg.observe(this, msg -> {
            Toast.makeText(this, "Error : " + msg, Toast.LENGTH_SHORT).show();
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
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