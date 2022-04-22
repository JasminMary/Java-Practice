package com.qa.rice;
//Provided that you have a given number of small rice bags (1 kilo each) and big rice bags (5 kilos each),
// write a method that returns the minimum number of small bags necessary to package goal kilos of rice.
// Return -1 if it is not possible to package the required rice amount with the bags provided.


public class RiceBagsTwo {

	public static int bags(int big, int small, int goal) {
		if (goal <= big * 5) {
			return 0;
		} else if (goal > ((big * 5) + small)) {
			return -1;
		} else if (goal % 5 > small) {
			return -1;
		} else if (goal - (big * 5) < small){
			return goal - (big * 5);
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		System.out.println(bags(4, 13, 31));
	}

}
