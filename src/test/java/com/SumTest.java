package com;

import com.controllers.SumController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    @Test
    public void postBodyTest() {
        SumController sumTest = new SumController();
        String result = sumTest.postBody("2 3");
        assertEquals(result, "5");
    }
}