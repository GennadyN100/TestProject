package com;

import com.controllers.GetFromListController;
import com.exception.ControllerException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GetFromListTest {

    @Test
    public void getResponseTest() throws ControllerException {
        GetFromListController getFromListTest = new GetFromListController();
        ResponseEntity<String> result = getFromListTest.getResponse("keySecond");
        assertEquals(result, ResponseEntity.status(HttpStatus.OK).body("valueSecond"));
    }

    @Test
    public void getResponseException() {

        ControllerException exception = Assertions.assertThrows(ControllerException.class, () -> {
            GetFromListController getFromListTest = new GetFromListController();
            ResponseEntity<String> result = getFromListTest.getResponse("keySecond5");
        });

        Assertions.assertEquals("ControllerException: element not found", exception.getMessage());
    }
}
