package com.wipro.test;

import java.util.function.Predicate;

public class PalindromeCheck {

	public static void main(String[] args) {
		
		String input="racecar";
		Predicate<String> isPalindrome = str -> {
            return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());

	};
	if (isPalindrome.test(input)) {
        System.out.println("Palindrome");
    } else {
        System.out.println("Not a palindrome.");
	}
	}

}
