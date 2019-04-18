package com.aliazaz.practicingmvp.View;

import com.aliazaz.practicingmvp.Contract.User;
import com.aliazaz.practicingmvp.RetrofitClient.API;

import java.util.List;

import retrofit2.Call;

public interface AppViews {

    interface onGetListener {
        void onSuccessListener(List<?> userList);

        void onFailListener(String error);
    }

    interface onRetrofit {
        API initiateRetrofitCall();

        void getUsersDataFromURL(Call<List<User>> call);

    }

    interface onPresenter {
        void setURLForSyncData(String urlCall);
    }

    interface onSetDataFromURL {
        void onSuccess(List<?> array);

        void onFail(String error);
    }
}
