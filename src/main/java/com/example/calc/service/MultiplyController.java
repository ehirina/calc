package com.example.calc.service;

import org.openapitools.api.MultiplyApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MultiplyController implements MultiplyApi {

    @GetMapping(value="/multiply")
    public float multiplyTwoNumbers(@RequestParam float x, @RequestParam float y) {
        return x*y;
    };
}
