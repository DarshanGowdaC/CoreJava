package com.xworkz.collections.Basics;

import java.util.ArrayList;
import java.util.List;

public class ListTester {
	
	public static void main(String[] args) {
		
		List List = new ArrayList();
		
		
		List.add(0,"UserName");
		List.add(1,"Password");
		List.add(2,null);
		List.add(3,"E-mailId");
		List.add(4,null);
		List.add(5,9740019097L);
		List.add(6,null);
	    
		
		System.out.println(List.contains("Amazon"));
		for(Object obj :List) {
			//List.add(3,"null");
			System.out.println(obj + ",");
		}
		System.out.println("The size of Collection after using remove is" +List.size());
		System.out.println(List.get(0));
		System.out.println(List.lastIndexOf(null));
		System.out.println(List.subList(0, 3));
		
		
	}

}
