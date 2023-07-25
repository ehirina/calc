package com.example.calc.service;

import org.springframework.stereotype.Service;

@Service
public class AddService {

    public float sumValues(float x, float y) {
        return x+y;
    }
}
