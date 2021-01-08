package com.example.exploretracks;

public class MyListData {
    private String description, time;
    private int imgId, play, heart;
    public MyListData(String description, int imgId, int play, int heart, String time) {
        this.description = description;
        this.imgId = imgId;
        this.play = play;
        this.heart = heart;
        this.time = time;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public int getImgId() {
        return imgId;
    }
    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
    public int getPlay() {
        return play;
    }
    public void setPlay(int play) {
        this.play = play;
    }
    public int getHeart() {
        return heart;
    }
    public void setHeart(int heart) {
        this.heart = heart;
    }
}
