package com.qa.inheritance;

public class Runner {
	
	public static void main(String[] args) {
		
	Dog woofer = new Dog();
	Cat meower = new Cat();
	
	woofer.makeNoise();
	woofer.doThing();
	meower.makeNoise();
	meower.doThing();
	
	
	}
}
