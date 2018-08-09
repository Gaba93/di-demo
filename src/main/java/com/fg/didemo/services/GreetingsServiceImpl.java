package com.fg.didemo.services;

public class GreetingsServiceImpl implements GreetingsService{
    public final static String HELLO_GREET = "Hello Yo";


    @Override
    public String sayGreeting() {
        return HELLO_GREET;
    }
}
