package com.example.sampleclassifieds.screens.details;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.sampleclassifieds.R;
import com.example.sampleclassifieds.image_loader.ImageLoader;
import com.example.sampleclassifieds.models.ClassifiedsModel;
import com.google.gson.Gson;

/**
 * This class is written in java which features the details of classified.
 * This Activity is invoked by a click on an item view in ClassifiedsRecyclerAdapter.
 * Intent extra named "CLASSIFIED_EXTRA" is required for this class to load.
 */
public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        ImageView classifiedImage = findViewById(R.id.classified_details_image_view);
        TextView classifiedName = findViewById(R.id.classified_details_name_text_view);
        TextView classifiedPrice = findViewById(R.id.classified_details_price_text_view);
        TextView classifiedCreated = findViewById(R.id.classified_details_created_at_text_view);
        TextView classifiedNOP = findViewById(R.id.classified_details_n_o_p_text_view);
        TextView classifiedNOT = findViewById(R.id.classified_details_n_o_t_text_view);

        Gson gson = new Gson();

        ClassifiedsModel.Result classified = gson.fromJson(getIntent().getStringExtra("CLASSIFIED_EXTRA"), ClassifiedsModel.Result.class);

        ImageLoader imageLoader = ImageLoader.Companion.with(this);

        imageLoader.load(classifiedImage, classified.getImage_urls().get(0));

        classifiedName.setText(classified.getName());

        classifiedPrice.setText(classified.getPrice());

        classifiedCreated.setText(classified.getCreated_at());

        classifiedNOP.setText(String.valueOf(classified.getImage_urls().size()));

        classifiedNOT.setText(String.valueOf(classified.getImage_urls_thumbnails().size()));

    }
}
