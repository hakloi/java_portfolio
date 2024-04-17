package com.example.buysell.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.service.CipherService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class HomeController {
    // private final CipherService cipherService;

    @GetMapping("/")
    public String home() { //Model model
        // model.addAttribute("ciphers", cipherService.listCiphers());
        return "home";
    }
}
