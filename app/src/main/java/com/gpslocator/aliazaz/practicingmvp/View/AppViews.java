package com.gpslocator.aliazaz.practicingmvp.View;

import com.gpslocator.aliazaz.practicingmvp.Contract.User;

import org.json.JSONArray;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;

public interface AppViews {

    interface onGetListenerUsers {
        void getSuccessListener(List<User> userList);

        void getFailListener(String error);
    }

    interface onRetrofit {
        void initiateRetrofitCall();

        void getDataFromURL(Call<ResponseBody> call);
    }

    interface onGetUsers {
        void onSuccess(JSONArray array);

        void onFail(String error);
    }
}
