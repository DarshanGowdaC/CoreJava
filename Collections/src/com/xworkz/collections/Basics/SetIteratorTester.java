package com.xworkz.collections.Basics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIteratorTester {
	
	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<Integer>();
		
		
		set.add(44);
		set.add(88);
		set.add(96);
		set.add(66);
		
		System.out.println(set);
		
		for(Integer inte: set) {
			System.out.println(inte);
		}
		System.out.println("Using Iterator");
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()) {
			Integer dataFromSetInteger = (Integer)itr.next();
			System.out.println(dataFromSetInteger);
			
		}
	}

}
