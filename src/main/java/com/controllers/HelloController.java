package com.controllers;

import com.exception.ControllerException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping(value = "/hello")
    public String getMessage() throws ControllerException {
            return "hello";
        }
}
