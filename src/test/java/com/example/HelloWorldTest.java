package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloWorldTest {
    @Test
    void returnsGreeting() {
        assertEquals("Hello, World!", new HelloWorld().getGreeting());
    }
}
