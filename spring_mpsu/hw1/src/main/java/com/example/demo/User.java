package com.example.demo;

import java.util.List;

public class User {
    private List<WebPage> webPages;

    public User(List<WebPage> webPages) {
        this.webPages = webPages;
    }

    public void readAllPages() {
        for (WebPage webPage : webPages) {
            System.out.println("Read:" + webPage.toString());
        }
    }
}