package com.example.chaun.codechalenge;

import com.google.gson.annotations.SerializedName;

/**
 * Created by chau.n on 22/06/2016.
 */
public class Venue {

    @SerializedName("city")
    private String city;
    @SerializedName("state")
    private String state;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
