package com.example.chaun.codechalenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private GuideAdapter mAdapter;
    private List<GuideObject> guideObjectList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        setDataForRecyclerView(guideObjectList);
        getGuideObject();
    }

    private void getGuideObject() {
        final GuideService  service = ServiceFactory.createRetrofitService(GuideService.class, GuideService.SERVICE_ENDPOINT);
        service.getGuideObject()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<GuideList>() {
                    @Override
                    public final void onCompleted() {
                        // do nothing
                    }

                    @Override
                    public final void onError(Throwable e) {
                        Log.e("Get Guide object demo", e.getMessage());
                    }

                    @Override
                    public void onNext(GuideList guideList) {
                        setDataForRecyclerView(guideList.getData());
                    }
                });
    }

    private void setDataForRecyclerView(List<GuideObject> guideObjectList) {
        mAdapter = new GuideAdapter(guideObjectList, this);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(mAdapter);
    }
}
