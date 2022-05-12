package com.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestController
public class SumController {
    @PostMapping(value = "/sum")
    public String postBody(@RequestBody String body) {

        Pattern p = Pattern.compile("(\\d+)");
        Matcher m = p.matcher(body);
        int sum = 0;
        while (m.find()) {
            sum += Integer.parseInt(m.group(1));
        }
        return Integer.toString(sum);
    }
}
