package com.example.buysell.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ExampleCipher {
    private Long id;
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