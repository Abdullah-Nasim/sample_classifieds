package com.example.sampleclassifieds.models

import com.example.sampleclassifieds.network.RestClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * This class is responsible for fetching new classifieds from the server/database.
 * This class is also responsible to decide that from where to fetch the classified.
 * That can be a server or local database.
 */
class ClassifiedsModel{

    private val classifiedsList: List<Result> = listOf()

    fun getClassifieds(classifiedsResult: ClassifiedsResult){

        if(classifiedsList.isEmpty()){
            RestClient.adapter.getClassifieds().enqueue(object : Callback<Classified>{

                override fun onFailure(call: Call<Classified>, t: Throwable) {}

                override fun onResponse(call: Call<Classified>, response: Response<Classified>) {
                    classifiedsResult.onClassifiedsFetched(response.body()!!.results)
                }
            })
        }
    }

    data class Classified(
        val results: List<Result>
    )

    data class Result(
        val created_at: String,
        val image_ids: List<String>,
        val image_urls: List<String>,
        val image_urls_thumbnails: List<String>,
        val name: String,
        val price: String,
        val uid: String
    )

    /**
     * An interface for classifieds fetch callback.
     */
    interface ClassifiedsResult{
        fun onClassifiedsFetched(classifiedsList: List<Result>)
    }

}