package com.controllers;

import com.exception.ControllerException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sum2ArgController {
    @PostMapping(value = "/sum2Arg")
    public int sum(@RequestParam(value = "a") int a,
                   @RequestParam(value = "b") int b)
            throws ControllerException {

        return a + b;
    }
}
