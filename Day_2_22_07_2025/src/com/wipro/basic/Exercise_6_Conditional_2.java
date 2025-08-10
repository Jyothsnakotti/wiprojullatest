package com.wipro.basic;

public class Exercise_6_Conditional_2 {
	public static void main(String[] args)
	{
//		int num=0;
		
		// >  greater then , < less than
		// >= greater than equal to
		// <= less than or equal to
		// || or
		// && and
//		boolean flag=true;
//		
//		if((num==0) || (num==1) || (num==2) && (flag==true))
//		{
//			System.out.println("Number is between 0 and 2");
//			
//		}
//		else if((num==3) || (num==4) || (num==5) && (flag==true))
//		{
//			System.out.println("Number is between 3 and 5");
//		}
//		else
//		{
//			System.out.println("else block");
//		}
		
		float number = -5;  // You can change this value to test different cases

        System.out.println("Input value: " + number);

        if (number == 0) {
            System.out.println("Zero");
        } else if (number > 0) {
            System.out.print("Positive");
        } else {
            System.out.println("Negative");
        }

        float abs = Math.abs(number);
        if (abs < 1) {
            System.out.println(" Small number");
        } else if (abs > 1000000) {
            System.out.println(" large number");
        } else if (number != 0) {
            System.out.println("Small");
        }
		
		
		
	}
}
