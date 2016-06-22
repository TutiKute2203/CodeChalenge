package com.example.chaun.codechalenge;

import retrofit.http.GET;
import retrofit.http.Path;
import rx.Observable;

/**
 * Created by chau.n on 22/06/2016.
 */
public interface GuideService {

    String SERVICE_ENDPOINT = "http://guidebook.com";

    @GET("/service/v2/upcomingGuides")
    Observable<GuideList> getGuideObject();

}
