package com.test.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {
    @Test
    public void getMessageTest() {
        Hello helloTest = new Hello();
        String result = helloTest.getMessage();
        assertEquals(result, "hello");
    }
}