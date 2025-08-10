package com.wipro.test;

import com.wipro.exceptions.CheckMonth;
import com.wipro.exceptions.InvalidMonthException;

public class MonthTest {
	public static void main(String[] args) {
	CheckMonth checker = new CheckMonth();

    try {
        checker.CheckMonth(11);  // Invalid month
    } catch (InvalidMonthException e) {
        System.out.println("Caught exception: " + e.getMessage());
    }


}}
