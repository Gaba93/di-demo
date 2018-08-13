package com.fg.didemo.controllers;

import com.fg.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private GreetingService greetingsService;

    @Autowired
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String sayHello(){
        return greetingsService.sayGreeting();
    }


}
