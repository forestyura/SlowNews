package com.forest.slownews.model;

import java.util.ArrayList;
import java.util.HashMap;

public class UsersList {
    private static UsersList instance;
    private ArrayList<User> userList;
    private HashMap<String, ArrayList<News>> userArchive;

    public static synchronized UsersList getInstance() {
        if (instance == null) {
            instance = new UsersList();
        }
        return instance;
    }

    private UsersList() {
        userList = new ArrayList<>();
        userArchive = new HashMap<>();
    }

    public synchronized void addUser(String username, String email, String password) {
        if (!ifUserInList(username)) {
            userList.add(new User(username, email, password));
        }
    }

    public ArrayList<User> getUserList() {
        return userList;
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

    private boolean ifUserInList(String username) {
        for(User user:userList){
            if (user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }
}
