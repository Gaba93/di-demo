package com.fg.didemo.controllers;

import com.fg.didemo.services.GreetingsServiceImpl;

public class PropertyInjectedController {

    public GreetingsServiceImpl greetingsService;

    String sayHello(){
        return greetingsService.sayGreeting();
    }

}
