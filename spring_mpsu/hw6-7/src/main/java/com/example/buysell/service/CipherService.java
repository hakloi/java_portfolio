package com.example.buysell.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.example.buysell.models.Cipher;

import com.example.buysell.repositories.CipherRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@Service
@Slf4j
@RequiredArgsConstructor
public class CipherService {
    // {
    //     ciphers.add(new Cipher(++id, "Jefferson disk", 
    //     "The Jefferson Disk is a manual polyalphabetic substitution cipher system, invented in 1795 by Thomas Jefferson, the 3rd President of the United States", 
    //     "Thomas Jefferson", 1790, EncryptionType.CLASSIC ));

    //     ciphers.add(new Cipher(++id, "Caesar cipher", 
    //     "a simple encryption technique that was used by Julius Caesar to send secret messages to his allies.", 
    //     "Julius Caesar", 0, EncryptionType.CLASSIC ));
    // }

    private final CipherRepository cipherRepository;

    public List<Cipher> listCiphers(String title) {
        if(title != null) cipherRepository.findByTitle(title);
        return cipherRepository.findAll();
    }

    public void saveCipher(Cipher cipher){
        log.info("Saving new {}", cipher);
        cipherRepository.save(cipher);
    }

    public void deleteCipher(Long id){
        cipherRepository.deleteById(id);
    }

    public Cipher getCipherById(Long id) {
        return cipherRepository.findById(id).orElse(null);
    }
}
