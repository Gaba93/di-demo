package com.fg.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GetterGreetingService implements GreetingsService{

    @Override
    public String sayGreeting() {
        return "Hello - Constructor";
    }
}
