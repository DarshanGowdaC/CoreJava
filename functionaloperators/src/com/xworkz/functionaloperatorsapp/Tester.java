package com.xworkz.functionaloperatorsapp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Tester {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(45);
		list.add(34);
		list.add(67);
		list.add(78);
		list.add(688);
		list.add(789);
		
		
		
		System.out.println("List using Iterator");
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext())
		{
			
			Integer IntegerValues  = itr.next();
			if(IntegerValues%2 == 0)
			System.out.println(IntegerValues);}
		
		
		System.out.println("Using Stream and filter");
			List<Integer> listOfEvenNumbers = list.stream().filter(integerValues -> (integerValues%2 == 0)).collect(Collectors.toList());
					System.out.println(listOfEvenNumbers);
		System.out.println("List using Stream");
		list.stream().forEach(integerValues -> System.out.println(integerValues));
		
		}
	}

