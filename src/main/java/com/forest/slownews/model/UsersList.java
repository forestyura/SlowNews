package com.forest.slownews.model;

import java.util.ArrayList;

public class UsersList {
    private static UsersList instance;
    private ArrayList<User> userList;

    public static synchronized UsersList getInstance() {
        if (instance == null) {
            instance = new UsersList();
        }
        return instance;
    }

    private UsersList() {
        userList = new ArrayList<>();
    }

    public synchronized void addUser(String username, String email, String password) {
        if (!ifUserInList(username)) {
            userList.add(new User(username, email, password));
        }
    }

    public ArrayList<User> getUserList() {
        return userList;
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
