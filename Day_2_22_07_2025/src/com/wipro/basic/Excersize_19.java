package com.wipro.basic;

public class Excersize_19 {

	public static void main(String[] args) {
		
		String str = "Madam";
        str = str.toLowerCase();  

        StringBuilder sb = new StringBuilder(str);
        String reversed = sb.reverse().toString();  

        if (str.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

	}

}
