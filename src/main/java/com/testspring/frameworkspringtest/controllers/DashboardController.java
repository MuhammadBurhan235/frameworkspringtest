package com.testspring.frameworkspringtest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DashboardController {

    @RequestMapping("/index.html")
    public String home() {
        return "index";
    }

}
