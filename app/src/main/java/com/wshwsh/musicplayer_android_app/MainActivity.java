package com.wshwsh.musicplayer_android_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<MusicCategory> musicCategories= new ArrayList<MusicCategory>();
        musicCategories.add(new MusicCategory("Calm Music","Suitable while studying",R.drawable.piano,R.layout.activity_song_list));
        musicCategories.add(new MusicCategory("Radio Music","Enjoy on road",R.drawable.radio,R.layout.activity_song_list));
        musicCategories.add(new MusicCategory("Rock Music","Party Hard",R.drawable.guitar,R.layout.activity_song_list));
        musicCategories.add(new MusicCategory("Classic Music","A journey to the past",R.drawable.classic,R.layout.activity_song_list));

        MusicCategoryAdapter musicCategoryAdapter = new MusicCategoryAdapter(this,musicCategories);
        GridView categoriesContainer = (GridView) findViewById(R.id.categoriesContainer);
        categoriesContainer.setAdapter(musicCategoryAdapter);

        categoriesContainer.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                MusicCategory category = musicCategories.get(i);
                Intent redirect = new Intent(getApplicationContext(), SongListActivity.class);
                redirect.putExtra("musicCategory",category.getName());
                startActivity(redirect);
            }
        });



    }
}
