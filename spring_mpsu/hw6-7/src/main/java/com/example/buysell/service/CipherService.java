package com.example.buysell.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.example.buysell.models.Cipher;
import com.example.buysell.models.Cipher.EncryptionType;

@Component
@Service
public class CipherService {
    private List<Cipher> ciphers = new ArrayList<>();  
    private long id = 0;

    {
        ciphers.add(new Cipher(++id, "Jefferson disk", 
        "The Jefferson Disk is a manual polyalphabetic substitution cipher system, invented in 1795 by Thomas Jefferson, the 3rd President of the United States", 
        "Thomas Jefferson", 1790, EncryptionType.CLASSIC ));

        ciphers.add(new Cipher(++id, "Caesar cipher", 
        "a simple encryption technique that was used by Julius Caesar to send secret messages to his allies.", 
        "Julius Caesar", 0, EncryptionType.CLASSIC ));
    }

    public List<Cipher> listCiphers() {
        return ciphers;
    }

    public void saveCipher(Cipher cipher){
        cipher.setId(++id);
        ciphers.add(cipher);
    }

    public void deleteCipher(Long id){
        ciphers.removeIf(cipher -> cipher.getId().equals(id));
    }

    public Cipher getCipherById(Long id) {
        for (Cipher cipher : ciphers) {
            if (cipher.getId().equals(id)) return cipher;
        }
        return null;
    }
}
