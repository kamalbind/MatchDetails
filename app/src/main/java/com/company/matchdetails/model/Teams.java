package com.company.matchdetails.model;

import com.google.gson.annotations.SerializedName;

public class Teams{
    @SerializedName(value = "6", alternate = "4")
    public Team team1;
    @SerializedName(value = "7", alternate = "5")
    public Team team2;
}
