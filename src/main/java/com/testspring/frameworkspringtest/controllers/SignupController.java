package com.testspring.frameworkspringtest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SignupController {

    @RequestMapping("/signup.html")
    public String signup() {
        return "signup";
    }

}
