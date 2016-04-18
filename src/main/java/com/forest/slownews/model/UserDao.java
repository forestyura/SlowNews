package com.forest.slownews.model;

import com.forest.slownews.service.DBProvider;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDao {

    public ArrayList<User> getUserList () {
        ArrayList<User> userList = new ArrayList<>();
        try {
            ResultSet rs = new DBProvider().getQuery("Select * from \"User\"");
            while (rs.next()) {
               userList.add(new User(rs.getString(2), rs.getString(3), rs.getString(4)));
            }
        }
        catch (SQLException ex) {
            System.out.println(ex);
        }
        return userList;
    }

    public User getUserByName (String name) {
        User user = new User();
        try {
            ResultSet rs = new DBProvider().getQuery("SELECT * FROM \"User\" WHERE \"Username\" = '" + name + "';");
            rs.next();
            user = new User(rs.getString(2), rs.getString(3), rs.getString(4));
        }
        catch (SQLException ex) {
            System.out.println(ex);
        }
        return user;
    }

    public void addUser (User user) {
            new DBProvider().setQuery("INSERT INTO \"User\" (\"Username\", \"Email\", \"Password\") VALUES ('" +
                    user.getUsername() + "', '" +
                    user.getEmail() + "', '" +
                    user.getPassword() + "');");
    }
}
