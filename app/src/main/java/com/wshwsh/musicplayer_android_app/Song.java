package com.wshwsh.musicplayer_android_app;

public class Song {
    private String songName;
    private String ArtistName;
    private Integer Image;
    private int likes;
    private int songFile;
    private String musicCategory;

    public Song(String songName, String artistName, Integer image, int likes, int songFile, String musicCategory) {
        this.songName = songName;
        ArtistName = artistName;
        Image = image;
        this.likes = likes;
        this.songFile = songFile;
        this.musicCategory = musicCategory;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getArtistName() {
        return ArtistName;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getSongFile() {
        return songFile;
    }

    public String getMusicCategory() {
        return musicCategory;
    }

    public Integer getImage() {
        return Image;
    }

    public void setImage(Integer image) {
        Image = image;
    }
}
