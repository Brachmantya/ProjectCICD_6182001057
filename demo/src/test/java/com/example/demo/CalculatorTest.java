package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    
    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        assertEquals(7, calculator.add(2, 5));
    }
}   
