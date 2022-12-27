package com.burakdemir.cryptoapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.burakdemir.cryptoapp.R
import com.burakdemir.cryptoapp.model.CryptoModel
import com.burakdemir.cryptoapp.service.KotlinApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    private val BASE_URL= "https://api.nomics.com/v1/"
    private var cryptoModels: ArrayList<CryptoModel>?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //b4a3957a1438132c200aeca35e07dd38263586a6
        //https://api.nomics.com/v1/
    // prices?key=b4a3957a1438132c200aeca35e07dd38263586a6
        loadData()
    }
    private fun loadData(){
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service =retrofit.create(KotlinApi::class.java) //retrofitle api bagliyoruz
        val call =service.getData()

        call.enqueue(object: Callback<List<CryptoModel>>{
            override fun onResponse(
                call: Call<List<CryptoModel>>,
                response: Response<List<CryptoModel>>
            ) {
               if(response.isSuccessful){
                   response.body()?.let{
                       cryptoModels=ArrayList(it)
                   }
               }
            }

            override fun onFailure(call: Call<List<CryptoModel>>, t: Throwable) {
                t.printStackTrace()
            }

        })
    }
}