package com.webApp.simpleWebApp;

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