package com.aliazaz.practicingmvp.UI;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.aliazaz.practicingmvp.Contract.User;
import com.aliazaz.practicingmvp.Presenter.DataPresenter;
import com.aliazaz.practicingmvp.R;
import com.aliazaz.practicingmvp.Recycler_MVP.Presenter.RecyclerPresenter;
import com.aliazaz.practicingmvp.View.AppViews;

import java.util.List;

public class MainActivity extends AppCompatActivity implements AppViews.onGetListener {

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

        DataPresenter presenter = new DataPresenter(this);
        presenter.setURLForSyncData("users");

    }

    private void setComponents() {
        userRecycler.setLayoutManager(new LinearLayoutManager(this));
        userRecycler.setItemAnimator(new DefaultItemAnimator());
    }

    @Override
    public void onSuccessListener(List<?> userList) {
        RecyclerPresenter recyclerAdapter = new RecyclerPresenter((List<User>) userList);
        userRecycler.setAdapter(recyclerAdapter);
    }

    @Override
    public void onFailListener(String error) {

    }
}
