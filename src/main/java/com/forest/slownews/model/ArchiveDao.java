package com.forest.slownews.model;

import com.forest.slownews.service.DBProvider;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ArchiveDao {

    public ArrayList<News> getArchiveList (String username) {
        ArrayList<News> archiveList = new ArrayList<>();
        try {
            ResultSet rs = new DBProvider().getQuery("SELECT * FROM \"Archive\" WHERE \"Username\" = '" + username + "';");
            while (rs.next()) {
                archiveList.add(new News(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
            }
        }
        catch (SQLException ex) {
            System.out.println(ex);
        }
        return archiveList;
    }

    public void addArchiveNews (String username, News news) {
        new DBProvider().setQuery("INSERT INTO \"Archive\" VALUES('" +
                username + "', '" +
                news.getTitle() + "', '" +
                news.getDescription() + "', '" +
                news.getImage() + "', '" +
                news.getPubDate() + "');" );
    }
}
