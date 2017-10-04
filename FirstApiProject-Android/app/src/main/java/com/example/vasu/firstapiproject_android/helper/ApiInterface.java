package com.example.vasu.firstapiproject_android.helper;

import com.example.vasu.firstapiproject_android.Model.GenreResponse;
import com.google.gson.JsonElement;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;

/**
 * Created by Vasu on 04-10-2017.
 */

public interface ApiInterface {

    @GET("api/genres/")
    Call<GenreResponse> getAllGenreData() ;

    @FormUrlEncoded
    @POST("api/genres/add/")
    Call<GenreResponse> addGenreData(
            @Field("name") String name
    ) ;

    @PUT("api/genres/put/{id}")
    Call<GenreResponse> updateGenreData(
            @Field("name") String name
    ) ;

}