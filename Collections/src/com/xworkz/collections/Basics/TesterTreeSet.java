package com.xworkz.collections.Basics;

import java.util.Set;
import java.util.TreeSet;

public class TesterTreeSet {
	
	public static void main(String[] args) {
		
		Set Students = new TreeSet();
		
		Students.add("Zebra");
		Students.add(100);
		Students.add("zzzzzzz");
		Students.add(800);
		Students.add(625);
		Students.add(50);
		
		System.out.println(Students);
	}

}
