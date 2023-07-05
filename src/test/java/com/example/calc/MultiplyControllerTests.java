package com.example.calc;

import com.example.calc.service.AddController;
import com.example.calc.service.MultiplyController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MultiplyControllerTests {

    private MultiplyController multiplyControllerUnderTest;

    @BeforeEach
    void setUp() {
        multiplyControllerUnderTest = new MultiplyController();
    }
    @Test
    void itShouldAddTwoInteger() {
        float result = multiplyControllerUnderTest.multiplyTwoNumbers(5,4);

        assertEquals(20, result);
    }

    @Test
    void itShouldAddTwoFloats() {
        float result = multiplyControllerUnderTest.multiplyTwoNumbers(5.6f,2.11f);

        BigDecimal roundedResult =  new BigDecimal(result).setScale(2, RoundingMode.HALF_EVEN);
        BigDecimal expected = new BigDecimal(11.82).setScale(2, RoundingMode.HALF_EVEN);

        assertEquals(expected, roundedResult);
    }
}
