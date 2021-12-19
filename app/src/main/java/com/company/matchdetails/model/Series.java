package com.company.matchdetails.model;

import com.google.gson.annotations.SerializedName;

public class Series{
    @SerializedName("Id")
    public String id;
    @SerializedName("Name")
    public String name;
    @SerializedName("Status")
    public String status;
    @SerializedName("Tour")
    public String tour;
    @SerializedName("Tour_Name")
    public String tour_Name;
}
