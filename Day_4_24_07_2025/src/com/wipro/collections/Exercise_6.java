package com.wipro.collections;

import java.util.HashMap;
import java.util.Map;

public class Exercise_6 {

	public static void main(String[] args) {
	
		Map<String, String> currencyMap = new HashMap<>();
        currencyMap.put("USD", "United States Dollar");
        currencyMap.put("EUR", "Euro");
        currencyMap.put("INR", "Indian Rupee");
        currencyMap.put("JPY", "Japanese Yen");
      
        
        
        for (Map.Entry<String, String> d : currencyMap.entrySet()) {
            System.out.println(d.getKey() + " - " + d.getValue());
	}
        }

}
