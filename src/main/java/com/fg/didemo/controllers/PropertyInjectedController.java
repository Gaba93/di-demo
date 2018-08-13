package com.fg.didemo.controllers;

import com.fg.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingsServiceImpl;

    public String sayHello(){
        return greetingsServiceImpl.sayGreeting();
    }

}
