package com.example.sampleclassifieds.screens

import com.example.sampleclassifieds.models.ClassifiedsModel

class MainPresenter(val mainInterface: MainInterface){

    private val classifiedsModel = ClassifiedsModel()

    fun getClassifieds(){

        classifiedsModel.getClassifieds(object : ClassifiedsModel.ClassifiedsResult{
            override fun onClassifiedsFetched(classifiedsList: List<ClassifiedsModel.Result>) {

                mainInterface.fetchingClassifiedsComplete(classifiedsList)

            }
        })

    }

}