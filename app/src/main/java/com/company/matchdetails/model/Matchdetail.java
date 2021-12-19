package com.company.matchdetails.model;

import com.google.gson.annotations.SerializedName;

public class Matchdetail{
    @SerializedName("Team_Home")
    public String team_Home;
    @SerializedName("Team_Away")
    public String team_Away;
    @SerializedName("Match")
    public Match match;
    @SerializedName("Series")
    public Series series;
    @SerializedName("Venue")
    public Venue venue;
    @SerializedName("Officials")
    public Officials officials;
    @SerializedName("Weather")
    public String weather;
    @SerializedName("Tosswonby")
    public String tosswonby;
    @SerializedName("Status")
    public String status;
    @SerializedName("Status_Id")
    public String status_Id;
    @SerializedName("Player_Match")
    public String player_Match;
    @SerializedName("Result")
    public String result;
    @SerializedName("Winningteam")
    public String winningteam;
    @SerializedName("Winmargin")
    public String winmargin;
    @SerializedName("Equation")
    public String equation;

    @Override
    public String toString() {
        return "Matchdetail{" +
                "team_Home='" + team_Home + '\'' +
                ", team_Away='" + team_Away + '\'' +
                ", match=" + match +
                ", series=" + series +
                ", venue=" + venue +
                ", officials=" + officials +
                ", weather='" + weather + '\'' +
                ", tosswonby='" + tosswonby + '\'' +
                ", status='" + status + '\'' +
                ", status_Id='" + status_Id + '\'' +
                ", player_Match='" + player_Match + '\'' +
                ", result='" + result + '\'' +
                ", winningteam='" + winningteam + '\'' +
                ", winmargin='" + winmargin + '\'' +
                ", equation='" + equation + '\'' +
                '}';
    }
}
