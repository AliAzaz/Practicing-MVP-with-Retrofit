package com.gpslocator.aliazaz.practicingmvp.RetrofitClient;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

public interface API {

    @GET("users")
    Call<ResponseBody> getUsers();

}
