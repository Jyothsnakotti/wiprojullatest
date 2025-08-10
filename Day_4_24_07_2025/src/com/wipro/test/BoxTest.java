package com.wipro.test;

import com.wipro.collections.Box;

public class BoxTest {

	public static void main(String[] args) {
		
		Box<String> b = new Box<>();
        b.set("Chaitanya");
        System.out.println(b.get());
        
        Box<Integer> b1 = new Box<>();
        b1.set(5);
        System.out.println(b1.get());

	}

}
