package com.fg.didemo.controllers;

import com.fg.didemo.services.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class GetterInjectedController {

    private GreetingsService greetingsService;

    String sayHello(){
        return greetingsService.sayGreeting();
    }

    @Autowired
   // @Qualifier("getterGreetingService")  //can be used on both places
    public void setGreetingsService(@Qualifier("getterGreetingService") GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }
}
