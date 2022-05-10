package com.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumControllerTest {
    @Test
    void sum() {
        SumController sumTest = new SumController();
        String result = sumTest.postBody("2 3");
        assertEquals(result, "5");
    }
}