package com.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class ControllerException extends RuntimeException {
    public ControllerException(String message) {
        super(message);
    }
}
