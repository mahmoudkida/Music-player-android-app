package com.wshwsh.musicplayer_android_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import mehdi.sakout.fancybuttons.FancyButton;

public class SongPlayerActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_play);
        Bundle extras = getIntent().getExtras();
        //get all extras from previous activity
        String songName = extras.getString("songName");
        String artistName = extras.getString("artistName");
        String songImage = extras.getString("songImage");
        String likes = extras.getString("likes");
        String songFile = extras.getString("songFile");
        String songCategory = extras.getString("songCategory");
        //set texts on the activity
        TextView songNameTextView= findViewById(R.id.songName);
        songNameTextView.setText(songName);
        TextView songArtistTextView= findViewById(R.id.songArtist);
        songArtistTextView.setText(artistName);
        ImageView songImageView = findViewById(R.id.song_image);
        songImageView.setImageResource(Integer.parseInt(songImage));


        //set like text
        FancyButton likebutton = findViewById(R.id.btn_Like);
        likebutton.setText(likes + "  Like this song!");

    }
}
