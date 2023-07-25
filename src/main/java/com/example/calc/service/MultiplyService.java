package com.example.calc.service;

import org.springframework.stereotype.Service;

@Service
public class MultiplyService {

    public float multiplyValues(float x, float y) {
        return x*y;
    }
}
