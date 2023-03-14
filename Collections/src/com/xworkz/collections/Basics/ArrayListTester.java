package com.xworkz.collections.Basics;

import java.util.List;


import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListTester {

	public static void main(String[] args) {
		
		List Customers = new ArrayList<Customer>();
		
		Customers.add(new Customer("Ramesh",26,"Bannerghatta","Bangalore",9740019097L));
		Customers.add(new Customer("Suresh",36,"Basaveshwaranagar","Bangalore",8895454755L));
		
		
		//default sorting Technique
		Collections.sort(Customers);
		//Collections.sort(Customers, new nameComparator());
		System.out.println("List Of Customers");
		
		
		for(Object obj: Customers) {
			System.out.println(obj);
			
		}
		
		
		
		//Iterator<Customer> itr = Customers.iterator() ;
		
		//while(itr.hasNext()) {
			//Customer.Customer = itr.next();
			//System.out.println(Customers);
		//}
		
		
	}
}
