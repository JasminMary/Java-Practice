package com.qa.extratasks;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		gcd(125, 25);

	}
	
	public static void gcd(int x, int y) {
		int gdc = 0;
		
		for (int i = 1; i <= x &&  i <= y; i++) {
			if (x % i == 0 && y % i == 0) {
				gdc = i;
				
			}
		} System.out.println(gdc);
		
	}

}
