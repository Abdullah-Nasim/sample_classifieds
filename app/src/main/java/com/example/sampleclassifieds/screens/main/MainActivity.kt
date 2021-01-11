package com.example.sampleclassifieds.screens.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sampleclassifieds.R
import com.example.sampleclassifieds.models.ClassifiedsModel
import com.example.sampleclassifieds.screens.main.adapters.ClassifiedsRecyclerAdapter
import kotlinx.android.synthetic.main.activity_main.*

/**
 * The Main Activity features the list of classifieds from the API.
 * This class contains the implementation of recycler view which follows linear layout structure to display classifieds.
 */
class MainActivity : AppCompatActivity(), MainInterface {

    private val mainPresenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_recycler_view.layoutManager = LinearLayoutManager(this)

        mainPresenter.getClassifieds()

    }

    override fun fetchingClassifiedsComplete(classifieds: List<ClassifiedsModel.Result>) {

        main_error_text_view.visibility = View.GONE

        main_progress_bar.visibility = View.GONE

        main_recycler_view.adapter = ClassifiedsRecyclerAdapter(classifieds, this)

    }

    override fun fetchingClassifiedsFailed(msg: String) {

        main_error_text_view.visibility = View.VISIBLE

        main_error_text_view.text = msg

    }
}