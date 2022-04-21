package com.qa.blackjack;

public class Taxes {
	
	public static double incomeTax(int salary) {
		return salary * 0.8;
	}
	
	public double taxAmount(int salary) {
		double tax = salary * 0.2;
		System.out.println(tax);
		return tax;
	}
	public static double diffSalaries(int x) {
		if(x <= 14999) {
			return x;
		}
		else if(x >= 15000 && x <= 19999) {
			return x * 0.9;
		}
		else if(x >= 20000 && x <= 29999) {
			return x * 0.85;
		}
		else if(x >= 30000 && x <= 39999) {
			return x * 0.8;
		}
		else if(x >= 40000 && x <= 49999) {
			return x * 0.75;
		}
		else if (x >= 50000) {
			return x * 0.7;
		}
		else {
			return 0;
		}
	}
	public static void main(String [] args) {
	    System.out.println(diffSalaries(777777));
	}
}
