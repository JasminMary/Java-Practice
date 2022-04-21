package com.qa.results;

public class Resultsexercise {

	public static void main(String[] args) {
		examResults(110, 115, 120);
		totalPercentage(100, 115, 120); 
	}
	public static void examResults(int biology, int chemistry, int physics) {
		System.out.println("Student achived " + biology + " in Biology");
		System.out.println("Student achived " + chemistry + " in Chemistry");
		System.out.println("Student achived " + physics + " in Physics");
		System.out.println("Student overall total =  " + (biology + chemistry + physics) + " out of 450");
		
	}
	public static void totalPercentage(int biology, int chemistry, int physics) {
		double total = ((biology + chemistry + physics) * 100) / 450;
		System.out.println("Student overall precentage =  " + total + "%");
		if (total < 60 || bio < 60 || chem < 60 || phys < 60 ) {
			System.out.println("Student has failed");
		}
		
	}
		

	}


