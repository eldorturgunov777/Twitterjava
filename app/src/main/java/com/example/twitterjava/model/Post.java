package com.example.twitterjava.model;

public class Post {
    int profile;
    String fullname;
    int photo;
    int video;

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public int getVideo() {
        return video;
    }

    public void setVideo(int video) {
        this.video = video;
    }

    public Post(int profile, String fullname, int video) {
        this.profile = profile;
        this.fullname = fullname;
        this.video = video;
    }

}
