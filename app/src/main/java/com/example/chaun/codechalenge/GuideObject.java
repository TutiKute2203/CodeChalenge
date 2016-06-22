package com.example.chaun.codechalenge;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by chau.n on 22/06/2016.
 */
public class GuideObject {

    @SerializedName("startDate")
    private String startDate;
    @SerializedName("endDate")
    private String endDate;
    @SerializedName("name")
    private String name;
    @SerializedName("url")
    private String url;
    @SerializedName("login_required")
    private int loginRequired;
    @SerializedName("venue")
    private Venue venue;
    @SerializedName("objType")
    private String  objType;
    @SerializedName("icon")
    private String urlIcon;


    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getLoginRequired() {
        return loginRequired;
    }

    public void setLoginRequired(int loginRequired) {
        this.loginRequired = loginRequired;
    }

    public Venue getVanue() {
        return venue;
    }

    public void setVanue(Venue venue) {
        this.venue = venue;
    }

    public String getObjType() {
        return objType;
    }

    public void setObjType(String objType) {
        this.objType = objType;
    }

    public String getUrlIcon() {
        return urlIcon;
    }

    public void setUrlIcon(String urlIcon) {
        this.urlIcon = urlIcon;
    }
}
