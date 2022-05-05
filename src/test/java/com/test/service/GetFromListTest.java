package com.test.service;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GetFromListTest {

    @Test
    public void getResponseTest() {
        GetFromList getFromListTest = new GetFromList();
        ResponseEntity<String> result = getFromListTest.getResponse("keySecond");
        assertEquals(result, ResponseEntity.status(HttpStatus.OK).body("valueSecond"));
    }

    @Test
    public void getResponseNotFoundTest() {
        GetFromList getFromListTest = new GetFromList();
        ResponseEntity<String> result = getFromListTest.getResponse("keySecond5");
        assertEquals(result, ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null));
    }
}