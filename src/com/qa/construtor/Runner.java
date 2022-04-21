package com.qa.construtor;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person bob = new Person("Bob", 55, 176, 9, "chef");
		Person sarah = new Person("Sarah", 25, 146, 4, "bus driver");
		Person charlotte = new Person("Charlotte", 26, 156, 5, "scientist");
		Person ed = new Person("Edward", 34, 196, 10, "doctor");
		
		bob.hello();
		System.out.println("--------");
		charlotte.nameAndHeightLength();
	}

}
