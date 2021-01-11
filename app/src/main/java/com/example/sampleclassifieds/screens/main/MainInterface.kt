package com.example.sampleclassifieds.screens.main

import com.example.sampleclassifieds.models.ClassifiedsModel

/**
 * An interface for fetch classifieds Callback.
 * Implemented in MainActivity.
 */
interface MainInterface{

    fun fetchingClassifiedsComplete(classifieds: List<ClassifiedsModel.Result>)
    fun fetchingClassifiedsFailed(msg: String)

}