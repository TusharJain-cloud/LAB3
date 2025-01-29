package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for App class.
 */
public class AppTest {

    /**
     * Test the main functionality of App.
     */
    @Test
    public void testMain() {
        // Create an instance of Calculator (used by App)
        Calculator calculator = new Calculator();
        int result = calculator.add(10, 20);
        assertEquals(30, result, "10 + 20 should equal 30");
    }
}
