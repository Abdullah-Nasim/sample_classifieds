package com.example.sampleclassifieds.network

import com.example.sampleclassifieds.models.ClassifiedsModel
import com.example.sampleclassifieds.network.apis.Endpoints
import retrofit2.Call
import retrofit2.http.GET

/**
 * An interface for network API calls.
 */
interface ServicesInterface {

    @GET(Endpoints.DYNA_MOB_WRITER)
    fun getClassifieds(): Call<ClassifiedsModel.Classified>

}