package com.xworkz.collections.Basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTesterr {
	public static void main(String[] args) {
		
		// <> - Generics helps me to store homegenous data in collection is a type safety
		List<String> list = new ArrayList<String>();
		
		list.add("1");
		list.add("46");
		list.add("93");
		
		
		for(Object obj: list) {
			System.out.println(obj);
		}
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			String dataFromList = (String)itr.next();
			System.out.println(dataFromList);
		}
		
	} 
	

}
