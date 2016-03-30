package com.forest.slownews.model;

public class News {
    private String name;
    private String data;
    private String image;

    public News() { }

    public News (String name, String data, String image) {
        this.name = name;
        this.data = data;
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getData() {
        return data;
    }

    public String getImage() {
        return image;
    }
}
