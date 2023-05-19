package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DemoController {

    @GetMapping("/random")
    ResponseEntity<Map> random() {
        var map = new HashMap<>();
        map.put("Hello", "World");

        return ResponseEntity.ok(map);
    }
}
