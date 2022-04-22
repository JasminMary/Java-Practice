package com.qa.bottlechallenge;

public class BottlesOfBeer {
	public static void main(String[] args) {
		
		int beer = 98;
		int bottles = 99;
		
		for(int i = 0; i < beer + 1; i++) {
			System.out.println(bottles + " bottles of beer on the wall " + bottles + " bottles of beer on the wall" );
			bottles--;
			System.out.println(" Take one down and pass it around," + bottles + " bottles of beer on the wall");
			if (bottles == 1) {
				System.out.println("1 bottle of beer on the wall, 1 bottle of beer on the wall, \n Take one down and pass it around, No more bottles of beer on the wall");
			}
			if (bottles == 0) {
				System.out.println("No more bottles of beer on the wall, no more bottles of beer.\r\n"
						+ "Go to the store and buy some more, 99 bottles of beer on the wall.");
			}
		}
	}

}
