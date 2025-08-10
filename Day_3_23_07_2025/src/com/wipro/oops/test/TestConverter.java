package com.wipro.oops.test;

import com.wipro.oops.Converter;

public class TestConverter {

	public static void main(String[] args) {
	
		Converter c = new Converter();

     
        int r1 = c.convert(2);              
        int r2 = c.convert(3,3);           
        double r3 = c.convert(5.0);        

        System.out.println("Square : " + r1);
        System.out.println("sum : " + r2);
        System.out.println("Result : " + r3);
	}

}
