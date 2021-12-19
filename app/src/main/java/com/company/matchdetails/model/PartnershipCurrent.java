package com.company.matchdetails.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class PartnershipCurrent{
    @SerializedName("Runs")
    public String runs;
    @SerializedName("Balls")
    public String balls;
    @SerializedName("Batsmen")
    public List<Batsman> batsmen;
}
