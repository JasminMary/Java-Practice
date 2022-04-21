package com.qa.construtor;

public class Person {

	private String name;
	private int age;
	private double height;
	private int shoesize;
	private String jobtitle;

	public Person(String name, int age, double height, int shoesize, String jobtitle) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.shoesize = shoesize;
		this.jobtitle = jobtitle;
	}

	public Person(String name, double height) {
		super();
		this.name = name;
		this.height = height;
	}

	public void hello() {
		System.out.println("Hi, I'm " + name + ". I'm " + age + " years old. I'm " + height + "cm tall, my foot size is "
				+ shoesize + ". My job title is " + jobtitle + ".");
	}

	public void nameAndHeightLength() {
		if (name.length() > 7 && height > 175) {
			System.out.println(name + "is a long name and " + height + "cm is a tall height");

		} else if (name.length() < 7 && height > 175) {
			System.out.println(name + " is a short name but " + height + "cm is a tall height");
		} else if (name.length() > 7 && height < 175) {
			System.out.println(name + " is a long name and " + height + "cm is an average height");
		} else {
			System.out.println(name + " is a short name and " + height + "cm is an average height");
		}

	}
}

