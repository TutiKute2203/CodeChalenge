package com.example.chaun.codechalenge;

import android.widget.ArrayAdapter;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by chau.n on 22/06/2016.
 */
public class GuideList {
    @SerializedName("total")
    private int total;
    @SerializedName("data")
    private ArrayList<GuideObject> data;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public ArrayList<GuideObject> getData() {
        return data;
    }

    public void setData(ArrayList<GuideObject> data) {
        this.data = data;
    }
}
