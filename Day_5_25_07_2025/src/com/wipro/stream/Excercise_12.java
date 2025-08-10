package com.wipro.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Excercise_12 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Jayanta", "Jnanedra", "Raja", "Anja", "John", "Jackson", "Vijay");

        List<String> filteredNames = names.stream()
                .filter(name -> name.contains("ja"))
                .collect(Collectors.toList());

        System.out.println("Names with 'j' and 'a' are : " + filteredNames);
		

	}

}
