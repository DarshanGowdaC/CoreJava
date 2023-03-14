package com.xworkz.collections.Basics;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class Customer implements Comparable<Customer> {
	
	
	
	public Customer() {
		
	}	
	

	private String Name ;
	private int id ;
	private String Branch;
	private String City ;
	private long phoneNo;
	
	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return this.id - o.id;
	
		
	} 
	
	
	
	}
	
	
	
	
	
	

