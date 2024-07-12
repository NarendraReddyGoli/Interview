package com.app.test;

import java.util.Arrays;

public class SumNumbersStartingWithFive {
    public static void main(String[] args) {
        int[] numbers = { 05, 4, -510, 12, 587, 33, 75 };
        

        // Sum of numbers starting with 5
        int sum = Arrays.stream(numbers)
                .filter(n -> startsWithFive(n))
                .sum();

        System.out.println("Sum of numbers starting with 5: " + sum);
    }

    // Method to check if a number starts with 5
    public static boolean startsWithFive(int number) {
        // Handle negative numbers correctly
        number = Math.abs(number);

        // Keep dividing the number by 10 until we get the first digit
        while (number >= 10) {
            number /= 10;
        }

        // Check if the first digit is 5
        return number == 5;
    }
}
