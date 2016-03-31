package com.forest.slownews.model;

import java.util.ArrayList;
import java.util.HashMap;

public class ArchiveNewsList {
    private static ArchiveNewsList instance;
    private HashMap<String, ArrayList<News>> userArchive;

    public static synchronized ArchiveNewsList getInstance() {
        if (instance == null) {
            instance = new ArchiveNewsList();
        }
        return instance;
    }

    private ArchiveNewsList() {
        userArchive = new HashMap<>();
    }

    public synchronized void addArchiveNews(String userName, News news) {
        ArrayList<News> archiveNews;
        if(!userArchive.containsKey(userName)) {
            archiveNews = new ArrayList<>();
            archiveNews.add(news);
            userArchive.put(userName, archiveNews);
        }
        else {
            archiveNews = userArchive.get(userName);
            archiveNews.add(news);
            userArchive.put(userName, archiveNews);
        }
    }

    public ArrayList<News> getArchiveNews(String userName) {
        return userArchive.get(userName);
    }
}
