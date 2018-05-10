package com.wshwsh.musicplayer_android_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Iterator;

public class SongListActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);
        //get music category from previous activity intent
        Bundle extras = getIntent().getExtras();
        String musicCategory = extras.getString("musicCategory");

        //create and filter songs by music category
        final ArrayList<Song> songs = createAndFilterSongsList(musicCategory);

        SongAdapter songAdapter = new SongAdapter(this,songs);
        ListView songList = (ListView) findViewById(R.id.songList);

        songList.setAdapter(songAdapter);

        songList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Song currentSong = songs.get(i);
                Intent redirect = new Intent(getApplicationContext(), SongPlayerActivity.class);
                redirect.putExtra("songName",currentSong.getSongName());
                redirect.putExtra("artistName",currentSong.getArtistName());
                redirect.putExtra("songImage",String.valueOf(currentSong.getImage()));
                redirect.putExtra("likes",String.valueOf(currentSong.getLikes()));
                redirect.putExtra("songFile",String.valueOf(currentSong.getSongFile()));
                redirect.putExtra("songCategory",currentSong.getMusicCategory());
                startActivity(redirect);
            }
        });



    }




    private ArrayList<Song> createAndFilterSongsList(String musicCategory){

        //music types
        //"Calm Music", "Radio Music" "Rock Music", "Classic Music"
        ArrayList<Song> Songs = new ArrayList<Song>();
        //TODO : Add real song files
        if(musicCategory.equals("Calm Music")){
            Songs.add(new Song("Calm Song 1","Artist 2", R.drawable.piano,12,0, "Calm Music"));
            Songs.add(new Song("Calm Song 2","Artist 3", R.drawable.piano,14,0, "Calm Music"));
            Songs.add(new Song("Calm Song 3","Artist 4", R.drawable.piano,56,0, "Calm Music"));
            Songs.add(new Song("Calm Song 4","Artist 5", R.drawable.piano,12,0, "Calm Music"));
            Songs.add(new Song("Calm Song 5","Artist 6", R.drawable.piano,3,0, "Calm Music"));

        }

        else if(musicCategory.equals("Classic Music")) {
            Songs.add(new Song("Classic Song 1", "Artist 2", R.drawable.classic, 40, 0, "Classic Music"));
            Songs.add(new Song("Classic Song 2", "Artist 3", R.drawable.classic, 32, 0, "Classic Music"));
            Songs.add(new Song("Classic Song 3", "Artist 4", R.drawable.classic, 5, 0, "Classic Music"));
            Songs.add(new Song("Classic Song 4", "Artist 5", R.drawable.classic, 8, 0, "Classic Music"));
            Songs.add(new Song("Classic Song 5", "Artist 6", R.drawable.classic, 3, 0, "Classic Music"));
        }

        else if(musicCategory.equals("Rock Music")) {
            Songs.add(new Song("Radio Song 1", "Artist 2", R.drawable.guitar, 5, 0, "Radio Music"));
            Songs.add(new Song("Radio Song 2", "Artist 3", R.drawable.guitar, 17, 0, "Radio Music"));
            Songs.add(new Song("Radio Song 3", "Artist 4", R.drawable.guitar, 9, 0, "Radio Music"));
            Songs.add(new Song("Radio Song 4", "Artist 5", R.drawable.guitar, 81, 0, "Radio Music"));
            Songs.add(new Song("Radio Song 5", "Artist 6", R.drawable.guitar, 3, 0, "Radio Music"));
        }
        else if(musicCategory.equals("Radio Music")) {
            Songs.add(new Song("Rock Song 1", "Artist 2", R.drawable.radio, 5, 0, "Rock Music"));
            Songs.add(new Song("Rock Song 2", "Artist 3", R.drawable.radio, 17, 0, "Rock Music"));
            Songs.add(new Song("Rock Song 3", "Artist 4", R.drawable.radio, 9, 0, "Rock Music"));
            Songs.add(new Song("Rock Song 4", "Artist 5", R.drawable.radio, 81, 0, "Rock Music"));
            Songs.add(new Song("Rock Song 5", "Artist 6", R.drawable.radio, 3, 0, "Rock Music"));
        }
        return  Songs;
    }
}
