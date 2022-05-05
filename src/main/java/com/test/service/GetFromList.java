package com.test.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class GetFromList {
    Map<String, String> map = Map.of("keyFirst", "valueFirst", "keySecond", "valueSecond");

    @GetMapping(value = "/getFromList")
    public ResponseEntity<String> getResponse(@RequestParam("key") String key) {
        if (map.containsKey(key)) {
            return ResponseEntity.status(HttpStatus.OK).body(map.get(key));
        }
        else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }
}