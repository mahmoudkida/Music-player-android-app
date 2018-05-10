package com.wshwsh.musicplayer_android_app;

public class MusicCategory {
    private String name;
    private String Subheader;
    private int image;
    private int redirectToLayout;

    public MusicCategory(String name, String subheader, int image, int redirectToLayout) {
        this.name = name;
        this.Subheader = subheader;
        this.image = image;
        this.redirectToLayout = redirectToLayout;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getRedirectToLayout() {
        return redirectToLayout;
    }

    public void setRedirectToLayout(int redirectToLayout) {
        this.redirectToLayout = redirectToLayout;
    }

    public String getSubheader() {
        return Subheader;
    }

    public void setSubheader(String subheader) {
        Subheader = subheader;
    }

}
