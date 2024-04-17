package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.example.buysell.models.ExampleCipher;
import com.example.buysell.models.ExampleCipher.EncryptionType;


// просмотр всех шифров на странице
@Service
public class CipherService {
    private List<ExampleCipher> ciphers = new ArrayList<>();  
    private long id = 0;

    {
        ciphers.add(new ExampleCipher(++id, "Jefferson disk", null, 
        "Thomas Jefferson", 1790, EncryptionType.CLASSIC ));

        ciphers.add(new ExampleCipher(++id, "Caesar cipher", "a simple encryption technique that was used by Julius Caesar to send secret messages to his allies.", 
        "Julius Caesar", 0, EncryptionType.CLASSIC ));
    }

    public List<ExampleCipher> listCiphers() {
        return ciphers;
    }

    public void saveCipher(ExampleCipher cipher){
        cipher.setId(++id);
        ciphers.add(cipher);
    }

    public void deleteCipher(long id){
        ciphers.removeIf(cipher -> cipher.getId().equals(id));
    }
}
