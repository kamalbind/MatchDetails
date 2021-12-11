package com.company.matchdetails.ui.main;

import android.app.Application;
import android.content.Context;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.arch.core.util.Function;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.Arrays;
import java.util.List;

public class MatchViewModel extends ViewModel {

    public final static String URL_1 = "https://www.sportsadda.com/cricket/live/json/sapk01222019186652.json";
    public final static String URL_2 = "https://www.sportsadda.com/cricket/live/json/nzin01312019187360.json";

    private RequestQueue requestQueue;
    public MutableLiveData<List<String>> stringMutableLiveData = new MutableLiveData<>();

    public void init(Context application) {
        if (requestQueue == null) {
            requestQueue = Volley.newRequestQueue(application);
        }
    }

    public void fetchData(String url) {
        if (requestQueue != null) {
            requestQueue.add(new StringRequest(Request.Method.GET, url, response ->
                stringMutableLiveData.postValue(Arrays.asList(response.split(","))), error -> {}));
        }
    }



}