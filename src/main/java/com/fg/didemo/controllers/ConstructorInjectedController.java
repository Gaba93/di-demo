package com.fg.didemo.controllers;

import com.fg.didemo.services.GreetingsService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private GreetingsService greetingsService;

    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    String sayHello(){
        return greetingsService.sayGreeting();
    }


}
