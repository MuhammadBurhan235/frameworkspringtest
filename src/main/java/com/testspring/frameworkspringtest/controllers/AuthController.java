package com.testspring.frameworkspringtest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.testspring.frameworkspringtest.models.entities.Pasien;
import com.testspring.frameworkspringtest.models.repos.PasienRepository;

@RestController
public class AuthController {
    
    @Autowired
    private PasienRepository pasienRepository;

    @PostMapping("/signup")
    public String signUp(@RequestBody Pasien pasien) {
        // Check if user already exists
        if (pasienRepository.existsByEmailPasien(pasien.getEmailPasien())) {
            return "User already exists";
        }
        
        pasien.setNamaPasien(pasien.getNamaPasien());
        pasien.setEmailPasien(pasien.getEmailPasien());
        pasien.setPasswordPasien(pasien.getPasswordPasien());

        // Save the new user
        pasienRepository.save(pasien);
        
        return "Sign up successful";
    }
    
    @PostMapping("/login")
    public String logIn(@RequestBody Pasien pasien) {
        // Check if user exists and credentials are correct
        if (pasienRepository.existsByEmailPasienAndPasswordPasien(pasien.getEmailPasien(), pasien.getPasswordPasien())) {
            return "Log in successful";
        }
        
        return "Invalid credentials";
    }
}