package com.company.matchdetails.ui.main;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.company.matchdetails.MainActivity;
import com.company.matchdetails.R;
import com.company.matchdetails.ui.recyclerview.PlayerRecyclerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class PlaceholderFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

    private MatchViewModel matchViewModel;

    public static PlaceholderFragment newInstance(int index) {
        PlaceholderFragment fragment = new PlaceholderFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_SECTION_NUMBER, index);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        matchViewModel = new ViewModelProvider(this).get(MatchViewModel.class);
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);


        PlayerRecyclerAdapter playerRecyclerAdapter = new PlayerRecyclerAdapter();
        RecyclerView recyclerView = root.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(playerRecyclerAdapter);

        //new Handler().postDelayed(() -> playerRecyclerAdapter.updatePlayer(list), 3000);

        matchViewModel.stringMutableLiveData.observe(this, strings -> {
            playerRecyclerAdapter.updatePlayer(strings);
        });
        matchViewModel.init(getContext());

        int index = 1;
        if (getArguments() != null) {
            index = getArguments().getInt(ARG_SECTION_NUMBER);
        }
        matchViewModel.fetchData(index == 1? MatchViewModel.URL_1 : MatchViewModel.URL_2);

        return root;
    }
}