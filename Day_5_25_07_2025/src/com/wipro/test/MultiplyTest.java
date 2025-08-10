package com.wipro.test;

import com.wipro.annonymous.Multiply;

public class MultiplyTest {

	public static void main(String[] args) {
	
		Multiply mul = (a, b) -> a * b;
		
		int result =  mul.multiply(5, 4);
		System.out.println("Result: " + result);
    
	}

}
