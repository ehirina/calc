package com.example.calc.service;

import com.example.calc.service.AddService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class AddServiceTests {

    @Autowired
    private AddService addServiceUnderTest;

  
    @Test
    void itShouldAddTwoInteger() {
        float result = addServiceUnderTest.sumValues(5,4);

        assertEquals(9, result);
    }

    @Test
    void itShouldAddTwoFloats() {
        float result = addServiceUnderTest.sumValues(5.6f,2.11f);

        BigDecimal roundedResult =  new BigDecimal(result).setScale(2, RoundingMode.HALF_EVEN);
        BigDecimal expected = new BigDecimal(7.71).setScale(2, RoundingMode.HALF_EVEN);

        assertEquals(expected, roundedResult);
    }
}
