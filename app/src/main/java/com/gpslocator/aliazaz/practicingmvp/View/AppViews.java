package com.gpslocator.aliazaz.practicingmvp.View;

import android.content.Context;

import com.gpslocator.aliazaz.practicingmvp.Contract.User;
import com.gpslocator.aliazaz.practicingmvp.Recycler_MVP.Presenter.RecyclerPresenter;

import org.json.JSONArray;

import java.util.List;

public interface AppViews {

    interface onGetListenerUsers {
        void getSuccessListener(List<User> userList);

        void getFailListener(String error);
    }

    interface onRetrofit {
        void initiateRetrofitCall(Context mContext, String link);
    }

    interface onGetUsers {
        void getSuccess(JSONArray array);

        void getFail(String error);
    }
}
