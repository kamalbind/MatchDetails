package com.company.matchdetails.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.company.matchdetails.R;
import com.company.matchdetails.viewmodel.MatchViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_1).setOnClickListener(v -> {
           navigateToPlayerList(MatchViewModel.URL_1);
        });

        findViewById(R.id.button_2).setOnClickListener(v -> {
            navigateToPlayerList(MatchViewModel.URL_2);
        });

    }


    private void navigateToPlayerList(String URL) {
        startActivity(new Intent(MainActivity.this, PlayerListActivity.class)
                .putExtra(MatchViewModel.URL, URL));
    }
}