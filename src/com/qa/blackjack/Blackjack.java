package com.qa.blackjack;
//Given 2 Integer values greater than 0, return whichever value is closest to 21 

//without going over 21. If they both go over 21 then return 0.

public class Blackjack {



	public static int Game(int x, int y) {
		if (x > 21 && y > 21) {
			return 0;
		}
		else if(x > 21) {
			return y;
		}
		else if (y > 21) {
			return x;
		}
		else if ((21 - x) > (21 - y)) {
			return y;
		}
		else {
			return x;
		}
	}
	public static void main(String[] args) {
	  System.out.println(Game(22,23));
		
	}
}
