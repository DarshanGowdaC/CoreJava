package com.xworkz.collections.Basics;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListTester1 {
	
	public static void main(String[] args) {
		
		List list = new LinkedList();
		
		list.add("49");
		list.add("Aadi");
		list.add("Dia");
		list.add("96");
		list.add("Suresh");
		list.add("mahesh");
		System.out.println("Lists are added");
		
		System.out.println(list.size());
		System.out.println(list.addAll(list));
		
		for(Object obj: list) {
			System.out.println(obj);
		}
		System.out.println("List are added using iterator");
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			String dataFromLinkedList = (String)itr.next();
			System.out.println(dataFromLinkedList);
			
		}
		System.out.println("The size collection"+ list.size());
		System.out.println(list.removeAll(list));
	}

}
