package com.company.matchdetails.model;

import com.google.gson.annotations.SerializedName;

import java.util.List; 
public class Bowler{
    @SerializedName("Bowler")
    public String bowler;
    @SerializedName("Overs")
    public String overs;
    @SerializedName("Maidens")
    public String maidens;
    @SerializedName("Runs")
    public String runs;
    @SerializedName("Wickets")
    public String wickets;
    @SerializedName("Economyrate")
    public String economyrate;
    @SerializedName("Noballs")
    public String noballs;
    @SerializedName("Wides")
    public String wides;
    @SerializedName("Dots")
    public String dots;
    @SerializedName("Isbowlingtandem")
    public boolean isbowlingtandem;
    @SerializedName("Isbowlingnow")
    public boolean isbowlingnow;
    @SerializedName("ThisOver")
    public List<ThisOver> thisOver;
}
