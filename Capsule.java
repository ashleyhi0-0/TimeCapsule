package com.example.timecapsule;

public class Capsule {

    public Capsule(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Capsule() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String title;
    private String description;

}
