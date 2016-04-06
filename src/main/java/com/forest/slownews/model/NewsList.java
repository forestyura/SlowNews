package com.forest.slownews.model;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;

@XmlRootElement(name = "rss")
@XmlAccessorType(XmlAccessType.FIELD)
public class NewsList {

    @XmlElementWrapper(name = "channel")
    @XmlElement(name = "item")
    private ArrayList<News> newsList;

    public NewsList() {
        newsList = new ArrayList<>();
    }

    public ArrayList<News> getNewsList() {
        return newsList;
    }

    public void addNews(News news) {
        newsList.add(news);
    }
}
