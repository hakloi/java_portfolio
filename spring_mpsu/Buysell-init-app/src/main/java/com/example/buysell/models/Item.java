package com.example.buysell.models;

import lombok.Data;

@Data
public class Item {
    private String title;
    private String description;
    private String creator;
    private int yearCreated;
    private EncryptionType type;
    
    public enum EncryptionType {
        ASYNCHRONOUS,
        SYNCHRONOUS,
        HYBRID,
        CLASSIC, 
        WITHOUT_KEY
    }
}