package com.example.sampleclassifieds

import android.graphics.BitmapFactory
import com.example.sampleclassifieds.image_loader.Utils
import org.junit.Assert.assertEquals
import org.junit.Test

class UnitTest {

    //Checking if the Sample size is correct given the width and height of image
    @Test
    fun calculateRequiredImageSize() {

        val actual = Utils.calculateInSampleSize(BitmapFactory.Options(), 1080, 2340)

        val expected = 1

        assertEquals(expected, actual)
    }

}