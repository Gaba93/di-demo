package com.fg.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingsServiceImpl implements GreetingsService{
    public final static String HELLO_GREET = "Hello Yo";


    @Override
    public String sayGreeting() {
        return HELLO_GREET;
    }
}
