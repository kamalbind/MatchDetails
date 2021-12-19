package com.company.matchdetails.model; 

import com.google.gson.annotations.SerializedName;

public class Team {
    @SerializedName("Name_Full")
    public String name_Full;
    @SerializedName("Name_Short")
    public String name_Short;
    @SerializedName("Players")
    public Players players;
}
