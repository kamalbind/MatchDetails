package com.company.matchdetails.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.company.matchdetails.R;
import com.company.matchdetails.ui.adapter.PlayerRecyclerAdapter;
import com.company.matchdetails.viewmodel.MatchViewModel;

/**
 * A placeholder fragment containing a simple view.
 */
public class TeamPlayersFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

    private MatchViewModel matchViewModel;
    private final int TEAM_ID;

    public static TeamPlayersFragment newInstance(int teamID) {
        return new TeamPlayersFragment(teamID);
    }

    private TeamPlayersFragment(int teamID) {
        TEAM_ID = teamID;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        matchViewModel = new ViewModelProvider(getActivity()).get(MatchViewModel.class);
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

        playerRecyclerAdapter.updatePlayer(TEAM_ID == 1? matchViewModel.team1PlayersNames : matchViewModel.team2PlayersNames);

        return root;
    }
}