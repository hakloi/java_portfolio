package com.example.demo;

public class IndieGamesPage extends BaseInfoPage implements WebPage{
    public IndieGamesPage(){
        header = "There are our game! Free to download and enjoy!";
    }

    @Override
    public void displayContent() {
        System.out.println("1." );
    }

}
