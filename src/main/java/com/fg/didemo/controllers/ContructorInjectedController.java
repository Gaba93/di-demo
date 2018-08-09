package com.fg.didemo.controllers;

import com.fg.didemo.services.GreetingsService;

public class ContructorInjectedController {

    private GreetingsService greetingsService;

    public ContructorInjectedController(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    String sayHello(){
        return greetingsService.sayGreeting();
    }


}
