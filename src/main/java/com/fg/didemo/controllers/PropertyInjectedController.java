package com.fg.didemo.controllers;

import com.fg.didemo.services.GreetingsService;
import com.fg.didemo.services.GreetingsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingsService greetingsServiceImpl;

    String sayHello(){
        return greetingsServiceImpl.sayGreeting();
    }

}
