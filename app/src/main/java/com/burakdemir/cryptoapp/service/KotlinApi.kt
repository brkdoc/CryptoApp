package com.burakdemir.cryptoapp.service

import com.burakdemir.cryptoapp.model.CryptoModel
import retrofit2.Call
import retrofit2.http.GET

interface KotlinApi {
    @GET("prices?key=b4a3957a1438132c200aeca35e07dd38263586a6")
    fun getData(): Call<List<CryptoModel>>

}