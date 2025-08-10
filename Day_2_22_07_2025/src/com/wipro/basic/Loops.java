package com.wipro.basic;

public class Loops {
	public static void main(String[] args) {
		
//		for(int i=1;i<=100;i++)
//		{
//			System.out.println(i);
//		}
		
//		for(int i=10;i>0;i--)
//		{
//			System.out.println(i);
//		}
		
//		for(int i=0;i<=10;i=i+2)
//		{
//			
//				System.out.println(i);
//		}
		
//		int i=10;
//		while(i>=0)
//		{
//			System.out.println(i);
//			i=i-2;
//		}
		 int sum = 0;
	        
	        for (int i = 0; i <= 100; i += 2) {
	            sum = sum + i;
	        }
	        System.out.println("Even numbers from 1 to 100 is: " + sum);
	    
	}
}
