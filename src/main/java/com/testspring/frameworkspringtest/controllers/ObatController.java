package com.testspring.frameworkspringtest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ObatController {
    @RequestMapping("/obat.html")
    public String obat() {
        return "obat";
    }
}
