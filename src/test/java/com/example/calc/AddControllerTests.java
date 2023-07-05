package com.example.calc;

import com.example.calc.service.AddController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class AddControllerTests {

    private AddController addControllerUnderTest;

    @BeforeEach
    void setUp() {
        addControllerUnderTest = new AddController();
    }
    @Test
    void itShouldAddTwoInteger() {
        float result = addControllerUnderTest.sumTwoNumbers(5,4);

        assertEquals(9, result);
    }

    @Test
    void itShouldAddTwoFloats() {
        float result = addControllerUnderTest.sumTwoNumbers(5.6f,2.11f);

        BigDecimal roundedResult =  new BigDecimal(result).setScale(2, RoundingMode.HALF_EVEN);
        BigDecimal expected = new BigDecimal(7.71).setScale(2, RoundingMode.HALF_EVEN);

        assertEquals(expected, roundedResult);
    }
}
