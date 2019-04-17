package com.gpslocator.aliazaz.practicingmvp.UI;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.gpslocator.aliazaz.practicingmvp.Contract.User;
import com.gpslocator.aliazaz.practicingmvp.R;
import com.gpslocator.aliazaz.practicingmvp.Recycler_MVP.Presenter.RecyclerPresenter;
import com.gpslocator.aliazaz.practicingmvp.View.AppViews;

import java.util.List;

public class MainActivity extends AppCompatActivity implements AppViews.onGetListenerUsers {

    RecyclerView userRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializing();
        setComponents();
    }

    private void initializing() {
        userRecycler = findViewById(R.id.userRecycler);

    }

    private void setComponents() {
        userRecycler.setLayoutManager(new LinearLayoutManager(this));
        userRecycler.setItemAnimator(new DefaultItemAnimator());
    }

    @Override
    public void getSuccessListener(List<User> userList) {
        RecyclerPresenter recyclerAdapter = new RecyclerPresenter(userList);
        userRecycler.setAdapter(recyclerAdapter);
    }

    @Override
    public void getFailListener(String error) {

    }
}
