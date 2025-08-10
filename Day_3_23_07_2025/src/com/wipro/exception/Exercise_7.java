package com.wipro.exception;

public class Exercise_7 {
	public static void main(String[] args) {
		String fName=null;
		try {
			String s=fName.toUpperCase();
			System.out.println("Uppercase Name: " + s);
			}
		catch(NullPointerException ex)
		{
			System.out.println(fName);
		}
		System.out.println("Program Running");
		
		
	}
}
