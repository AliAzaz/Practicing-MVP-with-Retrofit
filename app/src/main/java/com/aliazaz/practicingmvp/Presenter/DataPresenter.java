package com.aliazaz.practicingmvp.Presenter;

import android.util.Log;

import com.aliazaz.practicingmvp.RetrofitClient.Core;
import com.aliazaz.practicingmvp.View.AppViews;

import java.util.List;

public class DataPresenter implements AppViews.onPresenter, AppViews.onSetDataFromURL {

    private static final String TAG = DataPresenter.class.getName();

    private Core coreRetrofit;
    private AppViews.onGetListener getListener;
    private String urlCall;

    public DataPresenter(AppViews.onGetListener getListener) {
        this.getListener = getListener;
        coreRetrofit = new Core(this);
    }

    @Override
    public void setURLForSyncData(String urlCall) {
        this.urlCall = urlCall;
        if (this.urlCall.equals("users"))
            coreRetrofit.getUsersDataFromURL(coreRetrofit.initiateRetrofitCall().getUsers());

    }

    @Override
    public void onSuccess(List<?> array) {
        Log.d(TAG, "onSuccess: " + array);
        getListener.onSuccessListener(array);
    }

    @Override
    public void onFail(String error) {
        getListener.onFailListener(error);
    }
}
