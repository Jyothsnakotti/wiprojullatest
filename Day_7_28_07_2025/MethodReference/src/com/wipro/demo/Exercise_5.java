package com.wipro.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise_5 {
	 public static void main(String[] args) {
		 
		 List<String> names = Arrays.asList("Chaitanya","John","Sara","Ajay","Vanu");
		 List<String> sortedNames = names.stream()
	                                  .sorted(String::compareTo)
	                                  .collect(Collectors.toList());
		 
//	        System.out.println(sortedNames);
	        sortedNames.forEach(System.out::println);
	    }
}
