package com.fg.didemo.controllers;

import com.fg.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    GreetingService greetingsService;

    public MyController(GreetingService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String hello(){
        System.out.println("Hello World");

        return greetingsService.sayGreeting();
    }

}
