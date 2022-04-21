package com.qa.uniquesum;
//Given 3 integer values, return their sum If one value is the same as another value, they do not count towards the sum. In other words, only return the 
//sum of unique numbers given.
public class UniqueSum {

	public static int sums(int x, int y, int z) {
		if (x == y && y == z) {
			return x;
		}
		else if (x == y) {
			return y + z;
		}
		else if (x == z) {
			return x + y;
		}
		else if (y == z) {
			return x + z;
			
		}
		else { 
			return x + y + z;
		}
	}
	public static void main(String[] args) {
		System.out.println(sums(1, 2 ,1));
	}
}