package com.gpslocator.aliazaz.practicingmvp.RetrofitClient;

import com.gpslocator.aliazaz.practicingmvp.View.AppViews;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Core implements AppViews.onRetrofit {

    private AppViews.onGetUsers getUsers;

    public Core(AppViews.onGetUsers getUsers) {
        this.getUsers = getUsers;
    }

    @Override
    public void initiateRetrofitCall() {
        RetrofitClient.createRetrofitInstance();
    }

    @Override
    public void getDataFromURL(Call<ResponseBody> call) {
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if (response.isSuccessful()) {
                    try {
                        String data = response.body().string();
                        JSONArray array = new JSONArray(data);

                        getUsers.onSuccess(array);

                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                getUsers.onFail(t.toString());
            }
        });
    }


}
