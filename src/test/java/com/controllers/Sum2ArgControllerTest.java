package com.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Sum2ArgControllerTest {
    @Test
    public void sum2ArgTest() {
        assertEquals(new Sum2ArgController().sum(2, 3), 5);
    }
}