package com.company.matchdetails.model;

import com.google.gson.annotations.SerializedName;

public class Batsman{
    @SerializedName("Batsman")
    public String batsman;
    @SerializedName("Runs")
    public String runs;
    @SerializedName("Balls")
    public String balls;
    @SerializedName("Fours")
    public String fours;
    @SerializedName("Sixes")
    public String sixes;
    @SerializedName("Dots")
    public String dots;
    @SerializedName("Strikerate")
    public String strikerate;
    @SerializedName("Dismissal")
    public String dismissal;
    @SerializedName("Howout")
    public String howout;
    @SerializedName("Bowler")
    public String bowler;
    @SerializedName("Fielder")
    public String fielder;
    @SerializedName("Isonstrike")
    public boolean isonstrike;
}
