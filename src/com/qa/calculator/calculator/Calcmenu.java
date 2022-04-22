package com.qa.calculator;

import java.util.Scanner;

public class Calcmenu {

	public void menu() {

		boolean boo = true;

		while (boo) {

			Scanner input = new Scanner(System.in);

			System.out.println("~*~UwU~*~CALCULATOR~*~UwU~*~");
			System.out.println("-".repeat(40));
			System.out.println("Please select the number from the following options: ");
			System.out.println("\t 1. Addition");
			System.out.println("\t 2. Subtraction");
			System.out.println("\t 3. Multiplication");
			System.out.println("\t 4. Division");
			System.out.println("\t 5. Exit");
			System.out.println("Enter option: ");
			int selection = input.nextInt();
			input.nextLine();
			System.out.println("-".repeat(40));

			switch (selection) {

			case 1:
				System.out.println("Please enter first number: ");
				double num1 = input.nextInt();
				System.out.println("Please enter second number: ");
				double num2 = input.nextInt();
				input.nextLine();
				System.out.println("Answer: " + Calc.add(num1, num2));
				break;

			case 2:
				System.out.println("Please enter first number: ");
				double num3 = input.nextInt();
				System.out.println("Please enter second number: ");
				double num4 = input.nextInt();
				input.nextLine();
				System.out.println("Answer: " + Calc.subtract(num3, num4));
				break;

			case 3:
				System.out.println("Please enter first number: ");
				double num5 = input.nextInt();
				System.out.println("Please enter second number: ");
				double num6 = input.nextInt();
				input.nextLine();
				System.out.println("Answer: " + Calc.multiply(num5, num6));
				break;

			case 4:
				System.out.println("Please enter first number: ");
				double num7 = input.nextInt();
				System.out.println("Please enter second number: ");
				double num8 = input.nextInt();
				input.nextLine();
				System.out.println("Answer: " + Calc.divide(num7, num8));
				break;

			default:
				System.out.println("Try another input :) ");
				break;

			case 5:
				System.out.println("Bye");
				boo = false;
				System.out.println("-".repeat(40));

			}

		}
	}
}
