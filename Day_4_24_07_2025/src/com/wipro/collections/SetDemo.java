package com.wipro.collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		 Set<Integer> set1 = new HashSet<>();
		 set1.add(10);
		 set1.add(39);
		 set1.add(5);
		 set1.add(299);
		 
	     Set<Integer> set2 = new HashSet<>();
	     set2.add(10);
	     set2.add(29);
	     set2.add(39);
	     set2.add(299);

	       
	        System.out.println("Set1: " + set1);
	        System.out.println("Set2: " + set2);

	 
	        Set<Integer> d = new HashSet<>(set1); 
	        d.removeAll(set2); 

	   
	        System.out.println("Diff : " + d);
	}

}
