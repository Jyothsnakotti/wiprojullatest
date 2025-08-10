package com.wipro.datetimedemo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {
	public static void main(String[] args) {
	
		LocalDate dt = LocalDate.of(2023, 11, 1); 

        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        
        String fd = dt.format(formatter);
        System.out.println("Formatted Date is: " +fd);
    }

}

