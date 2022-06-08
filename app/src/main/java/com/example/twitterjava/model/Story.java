package com.example.twitterjava.model;

public class Story {
    int profile;
    String fullname;

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

    public Story(int profile, String fullname) {
        this.profile = profile;
        this.fullname = fullname;
    }
}
