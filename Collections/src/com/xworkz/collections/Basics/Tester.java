package com.xworkz.collections.Basics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class Tester {
	
	public static void main(String[] args) {
		
		Collection list = new ArrayList();
		Collection list1 = new HashSet();
		Collection list2 = new ArrayList();
		Collection list3 = new TreeSet();
		
		list.add("Zebra") ;
		list.add("Aane");
		list.add("Cobra");
		list.add("Zebra") ;
		
	    System.out.println(list3);
	    list.add("Amp") ;
	    System.out.println(list);
	    }
	

}
