package com.example.calc.service;

import org.openapitools.api.AddApi;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class AddController implements AddApi {

    @GetMapping(value="/sum")
    public float sumTwoNumbers(@RequestParam float x, @RequestParam float y) {
        return x+y;
    };

}
