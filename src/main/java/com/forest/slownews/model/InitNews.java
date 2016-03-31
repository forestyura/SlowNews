package com.forest.slownews.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Random;

public class InitNews {
    private ArrayList<News> news;
    private String fileName;

    public ArrayList<News> getNews() {
        news = new ArrayList<>();
        for(int i=0; i<5; i++) {
            news.add(new News(generateName(), generateText(), getRandomImage()));
        }
        return news;
    }

    public InitNews(String fileName) {
        this.fileName = fileName;
    }

    private String generateName() {
        String name = "";
        int nameLenght = new Random().nextInt(5) + 2;
        for(int i=0; i<nameLenght; i++) {
            name = name + " " + getWordFromFile();
        }
        return name;
    }

    private String generateText() {
        String text = "";
        int textLenght = new Random().nextInt(500) + 50;
        for(int i=0; i<textLenght; i++) {
            text = text + " " + getWordFromFile();
        }
        return text;
    }

    private String getWordFromFile() {
        String word ="";
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(new File(fileName), "r");
            randomAccessFile.seek(new Random().nextInt(1000));
            randomAccessFile.readLine();
            word = randomAccessFile.readLine();
        }
        catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
        catch (IOException ex) {
            System.out.println(ex);
        }

        return word;
    }

    private String getRandomImage() {
        return ("/image/news" + (new Random().nextInt(9) + 1) + ".jpg");
    }
}
