package com.company.matchdetails.model;

import com.google.gson.annotations.SerializedName;

import java.util.List; 
public class Root{
    @SerializedName("Matchdetail")
    public Matchdetail matchdetail;
    @SerializedName("Nuggets")
    public List<String> nuggets;
    @SerializedName("Innings")
    public List<Innings> innings;
    @SerializedName("Teams")
    public Teams teams;
    @SerializedName("Notes")
    public Notes notes;

    @Override
    public String toString() {
        return "Root{" +
                "matchdetail=" + matchdetail +
                ", nuggets=" + nuggets +
                ", innings=" + innings +
                ", teams=" + teams +
                ", notes=" + notes +
                '}';
    }
}
