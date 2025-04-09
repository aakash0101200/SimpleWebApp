package com.webApp.simpleWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

    @RequestMapping("/")  //when the method called spring look at return ______ and go for in search of "_____ " named file(if not using @RestController)
    public String index() { //But now // When this method is called, Spring directly returns "welcome to page" as the HTTP response body

        return "welcome to page";
    }


    //for different request you define different method

    @RequestMapping("/home")
    public String home() {
        return "welcome to home page";
    }
}
