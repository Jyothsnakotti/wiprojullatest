package com.wipro.exception;

import java.util.Scanner;

public class Currency {
	public static int changeCurrency(int number) throws NumberFormatException {
		if(number == 0)
		
		{
			throw new NumberFormatException("Invalid Number");
		}
		return number * 80;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int input =  s.nextInt();
		try {
			 int result=changeCurrency(0);
			 System.out.println("Converted amount: " + result);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Exception caught : " + e.getMessage());
		}
			
			

	}

}
