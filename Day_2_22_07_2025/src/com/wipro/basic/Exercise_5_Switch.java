package com.wipro.basic;

public class Exercise_5_Switch {
	public static void main(String args[])
	{
		char shape='R';
		switch(shape)
		{
		case 'R':
			System.out.println("Rectangle");
		case 'C':
			System.out.println("Circle");
		case 'S':
			System.out.println("Square");
		default:
			System.out.println("Other");
					
			
		}
	}
}
