package com.testspring.frameworkspringtest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TerimakasihController {
    @RequestMapping("/terimakasih.html")
    public String makasih() {
        return "makasih";
    }
}