package com.wipro.basic;

public class Excersize_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a = 25.586;
        double b = 25.589;

        // Round both numbers to 3 decimal places
        a = Math.round(a * 1000);
        b = Math.round(b * 1000);

        if (a == b) {
            System.out.println("They are the same up to three decimal places");
        } else {
            System.out.println("They are different");
        }
	}

}
