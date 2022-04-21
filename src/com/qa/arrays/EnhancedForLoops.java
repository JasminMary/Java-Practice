package com.qa.arrays;

public class EnhancedForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] stringarray = { "a", "b", "c", "d", "e" };
		for (String i : stringarray) {
			System.out.println(i); //
		}
		System.out.println("------------");

		int[] numarray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		for (int i : numarray) {
			System.out.println(i);
		}
		System.out.println("------------");
		System.out.println(arrayMethod(3));
		System.out.println("------------");

		for (int i : numarray) {
			if (arrayMethod(i)) {
				System.out.println(i * i * i);
			} else {
				System.out.println(i * i);
			}
		}
	}

	static boolean boo = true;

	public static boolean arrayMethod(int num) {
		if (num % 2 == 0) {
			boo = true;
		} else {
			boo = false;
		}
		return boo;
	}

}
