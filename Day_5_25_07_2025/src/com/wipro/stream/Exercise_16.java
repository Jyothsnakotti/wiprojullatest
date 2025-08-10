package com.wipro.stream;

import java.util.Optional;

public class Exercise_16 {
	
	public static void main(String[] args) {
       
        Optional<Integer> optionalValue = Optional.of(42);

        
        optionalValue.ifPresent(value -> System.out.println("Value is: " + value));

        
        Integer result = optionalValue.orElse(100);
        System.out.println("String Value: " + result);
    }
}
