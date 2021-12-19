package com.company.matchdetails.viewmodel;

import android.content.Context;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.company.matchdetails.model.Player;
import com.company.matchdetails.model.Players;
import com.company.matchdetails.model.Root;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatchViewModel extends ViewModel {
    public final static String URL = "URL";
    public final static String URL_1 = "https://www.sportsadda.com/cricket/live/json/sapk01222019186652.json";
    public final static String URL_2 = "https://www.sportsadda.com/cricket/live/json/nzin01312019187360.json";

    private Gson gson = new Gson();
    private RequestQueue requestQueue;

    public String team1Name;
    public List<Player> team1PlayersNames;

    public String team2Name;
    public List<Player> team2PlayersNames;

    public MutableLiveData<String> errorMsg = new MutableLiveData<>();
    public MutableLiveData<Boolean> isDataFetched = new MutableLiveData<>(false);

    public void init(Context application) {
        if (requestQueue == null) {
            requestQueue = Volley.newRequestQueue(application);
        }
    }

    public void fetchData(String url) {
        if (requestQueue != null) {
            requestQueue.add(new JsonObjectRequest(Request.Method.GET, url,
                    response -> {
                        Root root = gson.fromJson(response.toString(), Root.class);
                        populateTeam(root);
                    }, error -> errorMsg.postValue(error.getMessage())));
        }
    }

    private void populateTeam(Root root) {
        Players players;

        team1Name = root.teams.team1.name_Short;
        team1PlayersNames = new ArrayList<>();
        players = root.teams.team1.players;
        team1PlayersNames.add(players.player1);
        team1PlayersNames.add(players.player2);
        team1PlayersNames.add(players.player3);
        team1PlayersNames.add(players.player4);
        team1PlayersNames.add(players.player5);
        team1PlayersNames.add(players.player6);
        team1PlayersNames.add(players.player7);
        team1PlayersNames.add(players.player8);
        team1PlayersNames.add(players.player9);
        team1PlayersNames.add(players.player10);
        team1PlayersNames.add(players.player11);

        team2Name = root.teams.team2.name_Short;
        players = root.teams.team2.players;
        team2PlayersNames = new ArrayList<>();
        team2PlayersNames.add(players.player12);
        team2PlayersNames.add(players.player13);
        team2PlayersNames.add(players.player14);
        team2PlayersNames.add(players.player15);
        team2PlayersNames.add(players.player16);
        team2PlayersNames.add(players.player17);
        team2PlayersNames.add(players.player18);
        team2PlayersNames.add(players.player19);
        team2PlayersNames.add(players.player20);
        team2PlayersNames.add(players.player21);
        team2PlayersNames.add(players.player22);

        isDataFetched.postValue(true);
    }

}