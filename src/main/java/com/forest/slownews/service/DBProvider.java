package com.forest.slownews.service;

import com.forest.slownews.model.User;

import java.sql.*;

public class DBProvider {


    private Statement getStatement () throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
        }
        catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
        Connection connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/slownews", "postgres", "avtostop");
        Statement statement = connection.createStatement();
        return statement;
    }


    public ResultSet getQuery(String query) throws SQLException {
            return getStatement().executeQuery(query);
    }

    public void setQuery (String query) {
        try {
            getStatement().executeUpdate(query);
        }
        catch (SQLException ex) {
            System.out.println(ex);
        }
    }

}
