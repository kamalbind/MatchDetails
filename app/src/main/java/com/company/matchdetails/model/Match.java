package com.company.matchdetails.model;

import com.google.gson.annotations.SerializedName;

public class Match{
    @SerializedName("Livecoverage")
    public String livecoverage;
    @SerializedName("Id")
    public String id;
    @SerializedName("Code")
    public String code;
    @SerializedName("League")
    public String league;
    @SerializedName("Number")
    public String number;
    @SerializedName("Type")
    public String type;
    @SerializedName("Date")
    public String date;
    @SerializedName("Time")
    public String time;
    @SerializedName("Offset")
    public String offset;
    @SerializedName("Daynight")
    public String daynight;
}
