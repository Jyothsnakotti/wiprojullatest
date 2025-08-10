package com.wipro.test;

import java.time.LocalDate;

import java.util.function.Supplier;

public class SupplierTest {
	
	public static void main(String[] args) {
		
		Supplier<String> getTomorrowDay = () -> LocalDate.now().plusDays(1).getDayOfWeek().toString();

      
        System.out.println("Tomorrow is: " + getTomorrowDay.get());
	}
}
