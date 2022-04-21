package com.qa.arrays;

import java.util.Random;

public class Arrays {

	public static void main(String[] args) {

		int[] testarray = { 10, 885, 3570, 359 };
		int[] newarray = new int[10];
		newarray[0] = 10;
		newarray[1] = 11;
		newarray[2] = 14;
		newarray[3] = 16;
		newarray[4] = 17;
		newarray[5] = 18;
		newarray[6] = 11;
		newarray[7] = 144;
		newarray[8] = 1445;
		newarray[9] = 2222;

		for (int i = 0; i < newarray.length; i++) {
			System.out.println(newarray[i]);
		}

		System.out.println("---------------");

//		int[] forarray = new int[10];
//
//		for (int i = 0; i < forarray.length; i++) {
//			int value = 0;
//			forarray[i] = value;
//			value++;
//			for (int j = 0; j < forarray.length; j++) {
//				System.out.println(forarray[j]);
//			}
//		}
		
		

		Random r = new Random();
		int[] forarray = new int[10];

		for (int i = 0; i < forarray.length; i++) {
			int value = r.nextInt(10);
			forarray[i] = value;
			for (int j = 0; j <= i; j++) {
				System.out.print(forarray[j] + " ");
			}
			System.out.println("");
		}
		
		System.out.println("---------------");
		
		for(int i= 0; i < forarray.length; i++) {
			forarray[i] = forarray[i] * 10;
			for (int j = 0; j <= i; j++) {
				System.out.print(forarray[j] + " ");
			}
			System.out.println("");
		}
		
		int[] ints = new int[5]; // better version 

		for (int i = 0; i < ints.length; i++) {
			System.out.println(ints[i] = i);
		}
	}

}

