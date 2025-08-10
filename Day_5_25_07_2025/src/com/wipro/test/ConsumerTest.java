package com.wipro.test;

import java.util.function.Consumer;

public class ConsumerTest {
	public static void main(String[] args) {
		
		Consumer<Integer> nextEvenNumber = (num) ->{
		int nextEven = (num % 2 == 0) ? num + 2 : num + 1;
        System.out.println("Next even number : " + nextEven);
	};
	
	nextEvenNumber.accept(8);    
	}
}
