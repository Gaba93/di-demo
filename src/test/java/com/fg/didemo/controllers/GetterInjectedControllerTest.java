package com.fg.didemo.controllers;

import com.fg.didemo.services.GreetingsServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetterInjectedControllerTest {

    private GetterInjectedController getterInjectedController;

    @Before
    public void setUp(){
        this.getterInjectedController = new GetterInjectedController();
        this.getterInjectedController.setGreetingsService(new GreetingsServiceImpl());
    }

    @Test
    public void testGreeting(){
        assertEquals(GreetingsServiceImpl.HELLO_GREET, getterInjectedController.sayHello());
    }
}
