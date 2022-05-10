package com.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {
    @Test
    public void getMessageTest() {
        HelloController helloTest = new HelloController();
        String result = helloTest.getMessage();
        assertEquals(result, "hello");
    }
}