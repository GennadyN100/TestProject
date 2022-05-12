package com.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloControllerTest {
    @Test
    void getMessageTest() {
        HelloController helloTest = new HelloController();
        String result = helloTest.getMessage();
        assertEquals("hello", result);
    }
}