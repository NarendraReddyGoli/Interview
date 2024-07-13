package com.app.test;

public class PyramidPattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the pyramid

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            
            // Print spaces for the pyramid shape
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  "); // Adjusting spaces for proper alignment
            }
            
            // Print asterisks in each row
            for (int k = 1; k <= i; k++) {
                System.out.print("*   "); // Adjusting spaces for proper alignment
            }
            
            // Move to the next line after each row
            System.out.println();
        }
    }
}
