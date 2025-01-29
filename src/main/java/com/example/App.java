package com.example;

import com.example.Calculator;



/**
 * Main application entry point.
 */
public class App {
    public static void main(String[] args) {
        // Create an instance of the Calculator
        Calculator calculator = new Calculator();

        // Perform some calculations
        int sum = calculator.add(5, 3);

        // Print the result
        System.out.println("The sum of 5 and 3 is: " + sum);
    }
}
