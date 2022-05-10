package com.controllers;

import com.exception.ControllerException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GetFromListControllerTest {

    @Test
    public void getResponseTest() throws ControllerException {
        assertEquals(new GetFromListController().getResponse("keySecond"),
                ResponseEntity.status(HttpStatus.OK).body("valueSecond"));
    }

    @Test
    public void getResponseExceptionTest() {

        ControllerException exception = Assertions.assertThrows(ControllerException.class, () ->
            new GetFromListController().getResponse("keySecond5")
        );

        Assertions.assertEquals("ControllerException: element not found", exception.getMessage());
    }
}
