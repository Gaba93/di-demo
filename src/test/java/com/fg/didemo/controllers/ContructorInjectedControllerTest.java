package com.fg.didemo.controllers;

import com.fg.didemo.services.GreetingsServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContructorInjectedControllerTest {

    private ContructorInjectedController constructorInjectedController;

    @Before
    public void setUp(){
        this.constructorInjectedController = new ContructorInjectedController(new GreetingsServiceImpl());
    }

    @Test
    public void testGreeting(){
        assertEquals(GreetingsServiceImpl.HELLO_GREET, constructorInjectedController.sayHello());
    }

}
