package com.forest.slownews.model;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "rss")
@XmlAccessorType(XmlAccessType.FIELD)
public class NewsList {

    @XmlElementWrapper(name = "channel")
    @XmlElement(name = "item")
    private ArrayList<News> newsList;

    public NewsList() {
        newsList = new ArrayList<>();
    }

    public NewsList(List<News> listNews) {
        newsList = new ArrayList<>();
        for (News news: listNews) {
            addNews(news);
        }
    }

    public ArrayList<News> getNewsList() {
        return newsList;
    }

    public News getNewsByTile (String title) {
        News targetNews = new News();
        for (News news: newsList) {
            if (news.getTitle().contains(title)) {
                targetNews = news;
                return targetNews;
            }
        }
        return targetNews;
    }

    public void addNews(News news) {
        newsList.add(news);
    }
}
