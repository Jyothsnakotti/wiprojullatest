package com.wipro.test;

import java.util.function.Predicate;

public class StringEx {
	public static void main(String[] args) {
        Predicate<String> isUpperCase = str -> str.equals(str.toUpperCase());

        Predicate<String> isLowerCase = str -> str.equals(str.toLowerCase());

        String text1 = "HELLO";
        String text2 = "hello";

        System.out.println(isUpperCase.test(text1)); 
        System.out.println(isLowerCase.test(text2)); 
	}
}
