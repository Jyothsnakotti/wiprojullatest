package com.wipro.basic;

import java.time.Month;

public class Exercise_17 {

    public static void main(String[] args) {
        // Print all months using the built-in values() method
        for (Month m : Month.values()) {
            System.out.println(m);
        }

        // Create a variable and assign FEB
        Month month = Month.APRIL;

        // Check if the month is FEB
        if (month == Month.APRIL) {
            System.out.println("It is February.");
        }
    }

}