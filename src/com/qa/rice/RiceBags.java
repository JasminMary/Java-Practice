package com.qa.rice;
//Provided that you have a given number of small rice bags (1 kilo each) and big rice bags (5 kilos each), 
//write a method that returns true if it is possible to make a package with goal kilos of rice.

public class RiceBags {

	public static boolean bags(int big, int small, int goal) {
		if ((big * 5) + small == goal) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		System.out.println(bags(5, 4, 30));
	}
}
