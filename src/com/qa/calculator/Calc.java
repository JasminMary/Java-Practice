package com.qa.calculator;

public class Calc {

	public static void main(String[] args) {
		System.out.println(add(2, 3));
		System.out.println(subtract(4, 2));
		System.out.println(multiply(3, 3));
		Divide(6d, 2d);
	}

	private static void Divide(double a, double b) {
		if (a < b) {
			System.out.println("Cannot do");
		} else {
			System.out.println(a / b);
		}

	}

	private static int multiply(int a, int b) {
		return a * b;

	}

	private static int subtract(int a, int b) {
		return a - b;

	}

	private static int add(int a, int b) {
		return a + b;

	}

}
