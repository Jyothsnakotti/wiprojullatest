package com.wipro.test;

import java.util.function.Predicate;

public class CaseCheckerTest {
	
	public static void main(String[] args) {
		
	
	String input1 = "CHAITANYA";
    
    
    Predicate<String> isUpperCase = str -> str.equals(str.toUpperCase());

   
    Predicate<String> isLowerCase = str -> str.equals(str.toLowerCase());
   
    System.out.println(input1 + " is uppercase? " + isUpperCase.test(input1));
    System.out.println(input1 + " is lowercase? " + isLowerCase.test(input1));

  
	}
}
