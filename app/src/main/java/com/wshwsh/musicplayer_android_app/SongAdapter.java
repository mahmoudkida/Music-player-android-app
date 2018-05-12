package com.wshwsh.musicplayer_android_app;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {
    /**
     * Create a new {@link SongAdapter} object.
     *
     * @param context         is the current context (i.e. Activity) that the adapter is being created in.
     * @param songs           is the list of {@link songs}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of songs
     */
    public SongAdapter(Context context, ArrayList<Song> Songs) {
        super(context, 0, Songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_item_contrain, parent, false);
        }
        // Get the {@link Word} object located at this position in the list
        Song currentSong = getItem(position);
        TextView songTextView = (TextView) listItemView.findViewById(R.id.songName);
        songTextView.setText(currentSong.getSongName());
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.songArtist);
        artistTextView.setText(currentSong.getArtistName());
        TextView likesTextView = (TextView) listItemView.findViewById(R.id.likes);
        likesTextView.setText(String.valueOf(currentSong.getLikes()));
        ImageView songImage = (ImageView) listItemView.findViewById(R.id.circleImageView);
        songImage.setImageResource(currentSong.getImage());
        return listItemView;
    }
}
