package com.amjad.careershiksha.model;

public class VideoModel {
    private String title;
    private String videoId;

    public VideoModel(String title, String videoId) {
        this.title = title;
        this.videoId = videoId;
    }

    public String getTitle() {
        return title;
    }

    public String getVideoId() {
        return videoId;
    }
}

