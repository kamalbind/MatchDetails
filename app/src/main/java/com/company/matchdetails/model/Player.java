package com.company.matchdetails.model; 

import com.google.gson.annotations.SerializedName;

public class Player {
    @SerializedName("Position")
    public String position;
    @SerializedName("Name_Full")
    public String name_Full;
    @SerializedName("Iscaptain")
    public boolean iscaptain;
    @SerializedName("Iskeeper")
    public boolean iskeeper;
    @SerializedName("Batting")
    public Batting batting;
    @SerializedName("Bowling")
    public Bowling bowling;
}
