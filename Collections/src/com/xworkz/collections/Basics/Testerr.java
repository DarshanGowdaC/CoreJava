package com.xworkz.collections.Basics;

import java.util.ArrayList;
import java.util.Collection;

public class Testerr {

	public static void main(String[] args) {
	
		Collection List = new ArrayList();
		
		List.add(46);
		List.add("Institutions");
		List.add(9885754454L);
		
		List.add(102);
		List.add("Laptop") ;
		List.add(974001907L);
		
		List.add(100);
		List.add("Chair");
		List.add(9855246511L);
		
		List.add(957);
		List.add("Bags");
		List.add(9461123352L);
		
		List.add(233);
		List.add("Students");
		List.add(9886788888L);
		
		List.add(566);
		List.add("Mercedez");
		List.add(9882788941L);
		
		List.add(289);
		List.add("Traffic");
		List.add(9885754454L);
		
		List.add(44);
		List.add("Clothes");
		List.add(9885754454L);
		
		List.add(93);
		List.add("Patre");
		List.add(9885754454L);
		
		List.add(66);
		List.add("Bikes");
		List.add(9564544546L);
		
		
		System.out.println(List.add("Patre"));
		System.out.println(List.addAll(List));
		System.out.println(List.size());
		List.clear();
		System.out.println(List.contains(List));
	    System.out.println(List.containsAll(List));
	    System.out.println(List.equals(List));
	    System.out.println(List.isEmpty());
	    System.out.println(List.remove("Patre"));
	}
}
