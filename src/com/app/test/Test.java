package com.app.test;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		int[] numbers = { 005, 4, -510, 12, 587, 33, 75 };

		// Sum of numbers starting with 5
		int sum = Arrays.stream(numbers).filter(n -> String.valueOf(Math.abs(n)).startsWith("5")).peek(System.out::println).sum();

		System.out.println("Sum of numbers starting with 5: " + sum);
	}

}
