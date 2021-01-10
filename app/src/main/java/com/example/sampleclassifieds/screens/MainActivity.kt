package com.example.sampleclassifieds.screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sampleclassifieds.R
import com.example.sampleclassifieds.models.ClassifiedsModel
import com.example.sampleclassifieds.screens.adapters.ClassifiedsRecyclerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainInterface {

    private val mainPresenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_recycler_view.layoutManager = LinearLayoutManager(this)

        mainPresenter.getClassifieds()

    }

    override fun fetchingClassifiedsComplete(classifieds: List<ClassifiedsModel.Result>) {

        main_progress_bar.visibility = View.GONE

        main_recycler_view.adapter = ClassifiedsRecyclerAdapter(classifieds, this)

    }
}