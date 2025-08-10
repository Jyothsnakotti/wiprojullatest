package com.wipro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Exercise_10 {

	public static void main(String[] args) {
	        
		 Function<List<String>, List<Integer>> f = li -> {
	            List<Integer> n= new ArrayList<>();
	            for (String s : li) {
	                n.add(s.length());
	            }
	            return n;
	        };

	        List<String> result = Arrays.asList("Jayanth" , "Amit" , "Vasu");
	        System.out.println(f.apply(result));
	}

}
