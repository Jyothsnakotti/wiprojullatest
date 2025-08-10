package com.wipro.datetimedemo;

import java.time.LocalDate;

public class Exercise_13 {

	public static void main(String[] args) {
  
        LocalDate date = LocalDate.of(2028, 3, 1);
        
        int year = date.getYear();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
