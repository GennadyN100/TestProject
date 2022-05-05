package com.test.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    @Test
    public void postBodyTest() {
        Sum sumTest = new Sum();
        String result = sumTest.postBody("2 3");
        assertEquals(result, "5");
    }
}