package com.example.sampleclassifieds

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.sampleclassifieds.network.RestClient

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

@RunWith(AndroidJUnit4::class)

/**
 * This test is to validate the API response.
 */
class APITest {

    @Test
    fun testAPI(){

        val response = RestClient.adapter.getClassifieds().execute()

        //Checking if the response if successful
        assertTrue(response.isSuccessful && response.body() != null)

        //Checking that all the classifieds has a proper thumbnail and full image
        for(classified in response.body()!!.results){
            assertTrue(classified.image_urls_thumbnails.isNotEmpty())
            assertTrue(classified.image_urls.isNotEmpty())
        }

    }
}