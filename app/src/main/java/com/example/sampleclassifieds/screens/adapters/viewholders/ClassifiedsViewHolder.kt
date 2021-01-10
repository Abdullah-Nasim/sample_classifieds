package com.example.sampleclassifieds.screens.adapters.viewholders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.main_recycler_item.view.*

class ClassifiedsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

    val thumbnail: ImageView = itemView.classified_thumbnail_image_view

    val classifiedName: TextView = itemView.classified_name_text_view

    val classifiedPrice: TextView = itemView.classified_price_text_view

    val classifiedCreationDate: TextView = itemView.classified_created_at_text_view

}