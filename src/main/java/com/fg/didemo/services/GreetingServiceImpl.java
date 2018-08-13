package com.fg.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    public final static String HELLO_GREET = "Hello - Service Impl";


    @Override
    public String sayGreeting() {
        return HELLO_GREET;
    }
}
