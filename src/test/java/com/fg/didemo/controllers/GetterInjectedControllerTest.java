package com.fg.didemo.controllers;

import com.fg.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetterInjectedControllerTest {

    private GetterInjectedController getterInjectedController;

    @Before
    public void setUp(){
        this.getterInjectedController = new GetterInjectedController();
        this.getterInjectedController.setGreetingsService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting(){
        assertEquals(GreetingServiceImpl.HELLO_GREET, getterInjectedController.sayHello());
    }
}
