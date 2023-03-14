package com.xworkz.collections.Basics;

import java.util.ArrayList;
import java.util.List;

public class Tasktester {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add(0, "Darshan");
		list.add(1, "Kabza");
		list.add(2, "Sudeep");
		list.add(3,"martin");
		list.add(4, "Nissan Sunny Car");
		list.add(5, "Burj khalifa");
		list.add(6, "Martin");
		list.add(null);
		
		System.out.println(list);
		List list1 = new ArrayList();
		
		list1.add(0, 1);
		list1.add(1, "Rangerover");
		list1.add(null);
		list1.add(3,null);
		
		
		System.out.println(list1.addAll(list));
		System.out.println(list1);
		System.out.println(list1.containsAll(list));
		System.out.println(list1);
		System.out.println("--------------+-----------");
		System.out.println(list1);
		System.out.println(list1.lastIndexOf(list));
		System.out.println("--------------");
		System.out.println(list.isEmpty());
		System.out.println(list);
		System.out.println(list.removeAll(list1));
		System.out.println(list);
		System.out.println(list1.get(0));
		System.out.println(list.indexOf(list));
		System.out.println(list1);
		System.out.println("**************");
		System.out.println(list.equals(list1));
		System.out.println(list1);
		
	}
	
	

}
