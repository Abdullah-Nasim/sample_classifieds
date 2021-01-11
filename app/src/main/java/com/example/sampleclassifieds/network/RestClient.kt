package com.example.sampleclassifieds.network

import com.example.sampleclassifieds.network.apis.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * This object features adapter for our Retrofit Rest client.
 */
object RestClient {

    val adapter: ServicesInterface = Retrofit.Builder()
        .baseUrl(Constants.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build().create(ServicesInterface::class.java)

}