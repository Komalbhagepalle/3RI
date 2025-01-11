package com.example.helloworld;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {

    @Test
    public void testGetMessage() {
        String expected = "Hello World";
        String actual = HelloWorld.getMessage();
        assertEquals(expected, actual, "The message should be 'Hello World'");
    }
}
