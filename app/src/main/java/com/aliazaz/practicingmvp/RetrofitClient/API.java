package com.aliazaz.practicingmvp.RetrofitClient;

import com.aliazaz.practicingmvp.Contract.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface API {

    @GET("users")
    Call<List<User>> getUsers();

}
