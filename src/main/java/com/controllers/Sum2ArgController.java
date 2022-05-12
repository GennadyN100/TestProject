package com.controllers;

import com.model.SumRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sum2ArgController {
    @PostMapping(value = "/sum2Arg", consumes = {"application/json"})
    public int sum2Arg(@RequestBody SumRequest sumRequest) {
        return sumRequest.getFirstValue() + sumRequest.getSecondValue();
    }
}
