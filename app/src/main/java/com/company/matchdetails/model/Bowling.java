package com.company.matchdetails.model;

import com.google.gson.annotations.SerializedName;

public class Bowling{
    @SerializedName("Style")
    public String style;
    @SerializedName("Average")
    public String average;
    @SerializedName("Economyrate")
    public String economyrate;
    @SerializedName("Wickets")
    public String wickets;
}
