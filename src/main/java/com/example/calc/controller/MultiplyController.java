package com.example.calc.controller;

import com.example.calc.service.MultiplyService;
import org.openapitools.api.MultiplyApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MultiplyController implements MultiplyApi {
    private MultiplyService multiplyService;

    public MultiplyController(MultiplyService multiplyService) {
        this.multiplyService = multiplyService;
    }

    @GetMapping(value="/multiply")
    public float multiplyTwoNumbers(@RequestParam float x, @RequestParam float y) {
        return multiplyService.multiplyValues(x, y);
    };
}
