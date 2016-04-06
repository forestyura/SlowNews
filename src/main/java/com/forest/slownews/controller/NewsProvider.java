package com.forest.slownews.controller;

import com.forest.slownews.model.NewsList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.net.MalformedURLException;
import java.net.URL;

public class NewsProvider {

    public NewsList readNews() {
        try {
            return (NewsList) JAXBContext.newInstance(NewsList.class).createUnmarshaller().unmarshal(new URL("http://feeds.bbci.co.uk/news/rss.xml"));
        }
        catch (MalformedURLException ex) {
            System.out.println(ex);
            return new NewsList();
        }
        catch (JAXBException ex) {
            System.out.println(ex);
            return new NewsList();
        }
    }
}
