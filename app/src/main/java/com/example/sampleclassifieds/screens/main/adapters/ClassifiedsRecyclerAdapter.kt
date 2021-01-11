package com.example.sampleclassifieds.screens.main.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleclassifieds.R
import com.example.sampleclassifieds.image_loader.ImageLoader
import com.example.sampleclassifieds.models.ClassifiedsModel
import com.example.sampleclassifieds.screens.details.DetailsActivity
import com.example.sampleclassifieds.screens.main.adapters.viewholders.ClassifiedsViewHolder
import com.google.gson.Gson

class ClassifiedsRecyclerAdapter(private val mDataSet: List<ClassifiedsModel.Result>, private val context: Context): RecyclerView.Adapter<ClassifiedsViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClassifiedsViewHolder {
        return ClassifiedsViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.main_recycler_item, parent, false))
    }

    override fun getItemCount(): Int {
        return mDataSet.size
    }

    override fun onBindViewHolder(holder: ClassifiedsViewHolder, position: Int) {
        ImageLoader.with(context).load(holder.thumbnail, mDataSet[position].image_urls_thumbnails[0])
        holder.classifiedName.text = mDataSet[position].name
        holder.classifiedPrice.text = mDataSet[position].price
        holder.classifiedCreationDate.text = mDataSet[position].created_at

        holder.itemView.setOnClickListener {
            val intent = Intent(context, DetailsActivity::class.java)
            intent.putExtra("CLASSIFIED_EXTRA", Gson().toJson(mDataSet[position]))
            context.startActivity(intent)
        }
    }
}