package com.wipro.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise_5 {

	public static void main(String[] args) {
		List<String> l=new  ArrayList();
		l.add("chaitanya");
		l.add("vanukuri");
		l.add("siri");
		l.add("chaitanya");
		
		
		Set<String> uniqueSet = new HashSet<>(l);

		System.out.println(uniqueSet);
	}

}
