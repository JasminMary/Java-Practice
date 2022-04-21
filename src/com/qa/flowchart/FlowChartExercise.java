package com.qa.flowchart;

public class FlowChartExercise {

	public static int sum(int a, int b, boolean c) {
		if (c) {
			return a + b;
		} else {
			return a * b;
		}

	}

	public static void main(String[] args) {
		//System.out.println(sum(1, 2, true));
		project(400);
	}

	public static void project(int a) {
		if (a > 2000) {
			System.out.println("A");
			if (a > 6000) {
				System.out.println("C");
			} else {
				System.out.println("B");
				if (a > 4000) {
					System.out.println("D");
				} else {
					System.out.println("E");
				}
			}
		} else {
			System.out.println(1);
			if (a > 100) {
				System.out.println(3);
				if (a > 600) {
					System.out.println(5);
				} else {
					System.out.println(4);
					if (a > 500) {
						System.out.println(6);
					} else {
						System.out.println(7);
					}
				}
			} else {
				System.out.println(2);
			}
		}
	}
}
