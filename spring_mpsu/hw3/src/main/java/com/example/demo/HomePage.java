package com.example.demo;
import org.springframework.stereotype.Component;

@Component
public class HomePage extends BaseInfoPage implements WebPage{

    private String description;
    public HomePage(){
        header = "Home Page";
    }

    public void setDescription(String description){
        this.description = description;
    }
    @Override
    public void displayContent() {
    }

    @Override
    public String toString() {
        return "HomePage{" +
                "description='" + description + '\'' +
                '}';
    }
}