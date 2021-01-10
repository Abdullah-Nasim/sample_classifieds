package com.example.sampleclassifieds.screens

import com.example.sampleclassifieds.models.ClassifiedsModel

interface MainInterface{

    fun fetchingClassifiedsComplete(classifieds: List<ClassifiedsModel.Result>)

}