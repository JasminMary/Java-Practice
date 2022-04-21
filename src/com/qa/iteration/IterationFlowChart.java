package com.qa.iteration;

public class IterationFlowChart {
	
	public static void main(String[] args) {
		oneToOne();
	}

	public static void flowChart1() {
		int a = 100;
		boolean flow = true;
//
//		while (flow) {
//			System.out.println("A");
//			a++;
//
//			if (a > 200) {
//				flow = false;
//			}
//		}
		for(int i = a; i > 200; i++) {
			System.out.println("A");
		}

	}
	
	public static void flowChart2() {
		int a = 100;
		for (int i = a; i <= 200; i++) {
			if (i % 2 ==0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
		}
	}
	public static void oneToTen() {
		for (int i = 0; i < 10; i++) {
			System.out.println("1 2 3 4 5 6 7 8 9 10");
		}
	}
	public static void oneToOne() {
		
		for (int i = 0; i < 10; i++) {
			for(int j = 0; j < i; j++) {
				System.out.println(i);
			}
		}
	}
}
