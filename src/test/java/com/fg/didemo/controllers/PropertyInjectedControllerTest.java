package com.fg.didemo.controllers;

import com.fg.didemo.services.GreetingsService;
import com.fg.didemo.services.GreetingsServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp(){
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingsServiceImpl = new GreetingsServiceImpl();
    }

    @Test
    public void testGreeting(){
        assertEquals(GreetingsServiceImpl.HELLO_GREET, propertyInjectedController.sayHello());
    }

}
