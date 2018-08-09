package com.fg.didemo.controllers;

import com.fg.didemo.services.GreetingsService;

public class GetterInjectedController {

    private GreetingsService greetingsService;

    String sayHello(){
        return greetingsService.sayGreeting();
    }

    public void setGreetingsService(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }
}
