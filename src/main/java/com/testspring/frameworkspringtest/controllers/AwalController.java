package com.testspring.frameworkspringtest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AwalController {

    @RequestMapping("/")
    public String awal() {
        return "login";
    }

}
