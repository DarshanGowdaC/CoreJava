package com.xworkz.functionaloperatorsapp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Tester1 {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(12);
		list.add(15);
		list.add(18);
		list.add(19);
		list.add(22);
		list.add(30);
		list.add(32);
		list.add(35);
		list.add(38);
		list.add(41);
		list.add(47);
		list.add(50);
		list.add(53);
		list.add(57);
		list.add(59);
		list.add(60);
		list.add(63);
		list.add(93);
		list.add(96);
		list.add(98);
		list.add(100);
		list.add(103);
		list.add(105);
		
		System.out.println("List using Iterator");
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			Integer intValues = itr.next();
			if(intValues%2 == 0)
			System.out.println(intValues);}
		
		System.out.println("List using Stream");
		list.stream().forEach(intValues -> System.out.println(intValues));
		
		System.out.println("Using Stream and filter");
		List<Integer> listOfEvenNumbers = list.stream().filter(intValues -> (intValues%2 == 0)).collect(Collectors.toList());
				System.out.println(listOfEvenNumbers);
				
				System.out.println("Using Stream and filter");
				List<Integer> listOfOddNumbers = list.stream().filter(integerValues -> (integerValues%2 == 1)).collect(Collectors.toList());
						System.out.println(listOfOddNumbers);
	}

}
