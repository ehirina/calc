package com.example.calc.controller;

import com.example.calc.service.AddService;
import org.openapitools.api.AddApi;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class AddController implements AddApi {
    private AddService addService;

    public AddController(AddService addService) {
        this.addService = addService;
    }


    @GetMapping(value="/sum")
    public float sumTwoNumbers(@RequestParam float x, @RequestParam float y) {
        return addService.sumValues(x, y);
    };

}
