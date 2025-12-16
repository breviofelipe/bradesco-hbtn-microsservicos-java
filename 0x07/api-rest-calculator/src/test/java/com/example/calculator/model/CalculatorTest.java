package com.example.calculator.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
        private final Calculator calculator = new Calculator();

    @Test
    void sumTest() {
        assertEquals(7d, calculator.sum(3d, 4d));
    }

    @Test
    void numbersNullSumTest() {
        assertThrows(NullPointerException.class, () -> calculator.sum(null, 5d));
    }

    @Test
    void subTest() {
        assertEquals(1d, calculator.sub(5d, 4d));
    }

    @Test
    void divideTest() {
        assertEquals(2.5d, calculator.divide(5d, 2d));
    }

    @Test
    void divisionByZeroTest() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(5d, 0d));
    }

    @Test
    void factorialTest() {
        assertEquals(120, calculator.factorial(5));
    }

    @Test
    void integerToBinaryTest() {
        assertEquals(1010, calculator.integerToBinary(10));
    }

    @Test
    void integerToHexadecimalTest() {
        assertEquals("1A", calculator.integerToHexadecimal(26));
    }

    @Test
    void calculeDayBetweenDateTest() {
        LocalDate date1 = LocalDate.of(2024, 1, 1);
        LocalDate date2 = LocalDate.of(2024, 1, 10);
        assertEquals(9, calculator.calculeDayBetweenDate(date1, date2));
    }
}
