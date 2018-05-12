package com.wshwsh.musicplayer_android_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MusicCategoryAdapter extends ArrayAdapter<MusicCategory> {
    /**
     * Create a new {@link MusicCategoryAdapter} object.
     *
     * @param context         is the current context (i.e. Activity) that the adapter is being created in.
     * @param musicCategories is the list of {@link musicCategories}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of musicCategories
     */
    public MusicCategoryAdapter(Context context, ArrayList<MusicCategory> MusicCategories) {
        super(context, 0, MusicCategories);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.categories_item, parent, false);
        }
        // Get the {@link Word} object located at this position in the list
        MusicCategory currentCategory = getItem(position);
        TextView headerTextView = (TextView) listItemView.findViewById(R.id.categoryHeader);
        headerTextView.setText(currentCategory.getName());
        TextView subHeaderTextView = (TextView) listItemView.findViewById(R.id.categorySubHeader);
        subHeaderTextView.setText(currentCategory.getSubheader());
        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.categoryImage);
        // Check if an image is provided for this word or not
//        if (currentCategory.getImage()) {
        // If an image is available, display the provided image based on the resource ID
        imageView.setImageResource(currentCategory.getImage());
        // Make sure the view is visible
//            imageView.setVisibility(View.VISIBLE);
//        } else {
//            // Otherwise hide the ImageView (set visibility to GONE)
//            imageView.setVisibility(View.INVISIBLE);
//        }
        return listItemView;
    }
}
