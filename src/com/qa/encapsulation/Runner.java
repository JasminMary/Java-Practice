package com.qa.encapsulation;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object thing = new Object();
		Object thing2 = new Object();
		
		thing.setName("Ball");
		thing.setPrice(1.99d);
		thing.setSize(30.5f);
		thing.setStock(99);
		thing.setAmountinworld(1000000000000000000L);
		
		thing2.setName("pc");
		thing2.setPrice(1500.99);
		
		System.out.println(thing);
		System.out.println(thing.getName());
		System.out.println(thing2);
		System.out.println(thing2.getStock());

	}

}
