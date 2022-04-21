package com.qa.arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> name = new ArrayList <>(); 
		
		name.add("John");
		name.add("Jill");
		name.add("Joe");
		name.add("Joh");
		name.add("Jay");
		name.add("Bob");
		name.add("Bill");
		
		System.out.println(name);
		System.out.println("--------------");
		
		for (int i = 0; i < name.size(); i++) {
			System.out.println(name.get(i));
		}
		
		System.out.println("--------------");

		for (String nam : name) {
			System.out.println(nam);
		}
		
		System.out.println("--------------");
		
		System.out.println(name.get(3) + " " + name.get(4));
		
		System.out.println("--------------");
		
		name.set(3, "Luke");
		
		System.out.println(name.get(3));
		
		System.out.println("--------------");
		
		name.remove(5);
		
		System.out.println(name.get(5));
		
		System.out.println("--------------");
		
		Collections.sort(name);
		
		System.out.println(name);
		
		System.out.println("--------------");
		
		name.add("3");
		
		Collections.sort(name);
		
		System.out.println(name);
		
		System.out.println("--------------");
		
		Collections.reverse(name);
		
		System.out.println(name);
		
		System.out.println("--------------");
		
		Collections.swap(name, 2, 5);
		
		System.out.println(name);
		
		System.out.println("--------------");
		
		name.clear();
		
		System.out.println(name);
		
	}
	    
	    
}
