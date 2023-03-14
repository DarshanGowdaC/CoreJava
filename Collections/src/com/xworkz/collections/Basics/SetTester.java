package com.xworkz.collections.Basics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTester {
	public static void main(String[] args) {
		
		Set set = new HashSet();
		
		set.add("Sets");
		set.add(null);
		set.add("AAne");
		set.add("Iruve");
		set.add("Manga");
		set.add(null);
		set.add("Manga");
		set.add("Does not contain duplicate object");
		
		System.out.println(set);
		
		
		//retrieve the data/element/object // forEach , iterator , streams(java 8 features) 
        System.out.println("Fetching the data using forEach");
		for(Object object: set) {
			System.out.println(object);
			
		}
			System.out.println("Fetching the data using iterator");
	
			//predicate -- java.util.function
			Iterator itr = set.iterator();
			while(itr.hasNext()) {
				String dataFromSet = (String)itr.next();
				System.out.println(dataFromSet);
			}
		
		System.out.println("The size of collection after using remove is "+set.size());
	
}
	
}
