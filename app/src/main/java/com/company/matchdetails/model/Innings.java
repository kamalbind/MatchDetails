package com.company.matchdetails.model;

import com.google.gson.annotations.SerializedName;

import java.util.List; 
public class Innings{
    @SerializedName("Number")
    public String number;
    @SerializedName("Battingteam")
    public String battingteam;
    @SerializedName("Total")
    public String total;
    @SerializedName("Wickets")
    public String wickets;
    @SerializedName("Overs")
    public String overs;
    @SerializedName("Runrate")
    public String runrate;
    @SerializedName("Byes")
    public String byes;
    @SerializedName("Legbyes")
    public String legbyes;
    @SerializedName("Wides")
    public String wides;
    @SerializedName("Noballs")
    public String noballs;
    @SerializedName("Penalty")
    public String penalty;
    @SerializedName("AllottedOvers")
    public String allottedOvers;
    @SerializedName("Batsmen")
    public List<Batsman> batsmen;
    @SerializedName("Partnership_Current")
    public PartnershipCurrent partnership_Current;
    @SerializedName("Bowlers")
    public List<Bowler> bowlers;
    @SerializedName("FallofWickets")
    public List<FallofWicket> fallofWickets;
    @SerializedName("PowerPlay")
    public PowerPlay powerPlay;
    @SerializedName("Target")
    public String target;
}
