package com.testspring.frameworkspringtest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UbahJadwal {
    @RequestMapping("/ubahJadwal.html")
    public String ubahjadwal() {
        return "ubahjadwal";
    }

}
