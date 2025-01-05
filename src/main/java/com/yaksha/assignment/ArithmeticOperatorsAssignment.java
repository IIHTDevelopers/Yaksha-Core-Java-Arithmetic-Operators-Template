package com.yaksha.assignment;

public class ArithmeticOperatorsAssignment {

	public static void main(String[] args) {
		// Declare variables
		int a = 10;
		double b = 20.5;

		// Perform arithmetic operations: +, -, *, /, %
		int sum = a + (int) b; // Addition
		double difference = b - a; // Subtraction
		int product = a * (int) b; // Multiplication
		double quotient = b / a; // Division
		int remainder = a % 3; // Modulus (remainder)

		// Print the results of arithmetic operations
		System.out.println("Sum: " + sum);
		System.out.println("Difference: " + difference);
		System.out.println("Product: " + product);
		System.out.println("Quotient: " + quotient);
		System.out.println("Remainder: " + remainder);
	}
}
