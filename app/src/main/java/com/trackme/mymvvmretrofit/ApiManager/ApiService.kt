package com.trackme.mymvvmretrofit.ApiManager

import com.trackme.mymvvmretrofit.Model.ApiData
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface ApiService{
    @GET("current")
   suspend fun getCity(@Query("access_key")access_key: String , @Query("query")query: String ): ApiData
}