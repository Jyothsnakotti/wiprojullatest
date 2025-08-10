package com.wipro.junitdemo;

public class StringUtils {

	// Returns true if the input string is all uppercase letters (ignores non-alphabetic chars)
    public static boolean isUpperCase(String str) {
        if (str == null || str.isEmpty()) {
            return false; // or true, depending on requirements
        }
        // Check if all alphabetic characters are uppercase
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c) && !Character.isUpperCase(c)) {
                return false;
            }
        }
        return true;
    }
	
}
