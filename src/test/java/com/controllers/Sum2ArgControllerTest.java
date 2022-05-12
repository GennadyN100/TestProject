package com.controllers;

import com.model.SumRequest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Sum2ArgControllerTest {
    @Test
    void sum2ArgTest() {
        SumRequest sumRequest = new SumRequest();
        sumRequest.setFirstValue(2);
        sumRequest.setSecondValue(3);
        assertEquals(5, new Sum2ArgController().sum2Arg(sumRequest));
    }
}