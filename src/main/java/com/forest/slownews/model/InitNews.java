package com.forest.slownews.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Random;

public class InitNews {
    private ArrayList<News> news;
    private static String FILE_NAME = "src/main/resources/words.txt";

    public ArrayList<News> getNews() {
        news = new ArrayList<>();
        for(int i=0; i<5; i++) {
            news.add(new News(generateName(), generateText(), ""));
        }
        return news;
    }

    private String generateName() {
        String name = "";
        int nameLenght = new Random().nextInt(5) + 2;
        for(int i=0; i<nameLenght; i++) {
            name = getWordFromFile() + " ";
        }
        return name;
    }

    private String generateText() {
        String text = "";
        int textLenght = new Random().nextInt(500) + 50;
        for(int i=0; i<textLenght; i++) {
            text = getWordFromFile() + " ";
        }
        return text;
    }

    private String getWordFromFile() {
        String word ="";
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(new File(FILE_NAME), "r");
            randomAccessFile.seek(new Random().nextInt(9995));
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
}
