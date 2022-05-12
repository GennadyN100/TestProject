package com.controllers;

import com.exception.ControllerException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GetFromListControllerTest {

    @Test
    void getResponseTest() throws ControllerException {
        assertEquals(new GetFromListController().getResponse("keySecond"),
                ResponseEntity.status(HttpStatus.OK).body("valueSecond"));
    }

    @Test
    void getResponseExceptionTest() {

        GetFromListController getFromListController = new GetFromListController();

        ControllerException exception = Assertions.assertThrows(ControllerException.class, () ->
            getFromListController.getResponse("keySecond5")
        );

        Assertions.assertEquals("ControllerException: element not found", exception.getMessage());
    }
}
