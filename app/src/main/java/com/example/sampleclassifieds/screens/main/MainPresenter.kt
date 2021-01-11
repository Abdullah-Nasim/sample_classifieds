package com.example.sampleclassifieds.screens.main

import com.example.sampleclassifieds.models.ClassifiedsModel

/**
 * This is a presenter class for our MainActivity.
 * This class talks to the model, get the data in ready to use form and give it to our view i.e MainActivity
 */
class MainPresenter(val mainInterface: MainInterface){

    private val classifiedsModel = ClassifiedsModel()

    fun getClassifieds(){

        classifiedsModel.getClassifieds(object : ClassifiedsModel.ClassifiedsResult{
            override fun onClassifiedsFetched(classifiedsList: List<ClassifiedsModel.Result>) {
                mainInterface.fetchingClassifiedsComplete(classifiedsList)
            }

            override fun onClassifiedFetchFailed(msg: String) {
                mainInterface.fetchingClassifiedsFailed(msg)
            }
        })

    }

}