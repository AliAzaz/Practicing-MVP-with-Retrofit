package com.aliazaz.practicingmvp.RetrofitClient;

import com.aliazaz.practicingmvp.Contract.User;
import com.aliazaz.practicingmvp.View.AppViews;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Core implements AppViews.onRetrofit {

    private AppViews.onSetDataFromURL setDataFromURL;
    private RetrofitClient retrofitClient;

    public Core(AppViews.onSetDataFromURL setDataFromURL) {
        this.setDataFromURL = setDataFromURL;

        if (retrofitClient == null)
            retrofitClient = new RetrofitClient();

    }

    @Override
    public API initiateRetrofitCall() {
        return retrofitClient.createRetrofitInstance();
    }

    @Override
    public void getUsersDataFromURL(Call<List<User>> call) {

        call.enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                if (response.isSuccessful()) {
                    /*String data = response.body().string();
                    JSONArray array = new JSONArray(data);*/

                    setDataFromURL.onSuccess(response.body());

                }
            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {
                setDataFromURL.onFail(t.toString());
            }
        });

    }


}
