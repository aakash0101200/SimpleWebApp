package com.webApp.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet() {
        return "Hi, Welcome !!!";
    }

    @RequestMapping("/about")
    public String about() {
        return "about me!!";
    }
}