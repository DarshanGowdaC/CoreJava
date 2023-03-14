package com.xworkz.collections.Basics;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetLinked {
	public static void main(String[] args) {
		
		Set set = new LinkedHashSet();
		
		set.add("James Bond");
		set.add(null);
		set.add("007");
		set.add("The Bond");
		set.add("Mercury");
		set.add(null);
		set.add("Boom");
		set.add("It contains in a ordered way");
		
		System.out.println(set);
	}

}
