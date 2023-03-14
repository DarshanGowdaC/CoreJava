package com.xworkz.collections.Basics;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queuetester {
      public static void main(String[] args) {
	 
    	  Queue set = new PriorityQueue();
    	  
    	  set.add("Amar");
    	  set.add("Akbar");
    	  set.add("Anthony");
    	  System.out.println("Fetching........");
    	  
    	  
    	  for(Object obj: set) {
    		  System.out.println(set);
    		  
    	  }
    	  System.out.println("Fetched using Iterator");
    	  
    	  Iterator itr = set.iterator();
    	  while(itr.hasNext()) {
    		  String dataFromQueue = (String)itr.next();
    		  System.out.println(dataFromQueue);
    		  
    	  }
    	  System.out.println("The size of collection after using remove is" +set.size());
}
      
}
