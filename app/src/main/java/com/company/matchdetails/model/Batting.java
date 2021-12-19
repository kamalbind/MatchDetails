package com.company.matchdetails.model;

import com.google.gson.annotations.SerializedName;

public class Batting{
    @SerializedName("Style")
    public String style;
    @SerializedName("Average")
    public String average;
    @SerializedName("Strikerate")
    public String strikerate;
    @SerializedName("Runs")
    public String runs;
}
