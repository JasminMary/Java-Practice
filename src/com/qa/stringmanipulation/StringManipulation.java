package com.qa.stringmanipulation;

public class StringManipulation {
	public static void main(String[] args) {
		
		String rain = "Yesterday it was raining";
		String sun = "today it is sunny";
		System.out.println(rain.toUpperCase()+", "+sun.toUpperCase());
		
		System.out.println("----------------");
		
		String today = sun.substring(0, 11);
		String yesterday = rain.substring(16, 24);
		System.out.println(today.toUpperCase() + yesterday.toUpperCase());
		
	}

}
