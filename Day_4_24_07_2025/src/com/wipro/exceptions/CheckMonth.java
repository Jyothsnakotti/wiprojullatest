package com.wipro.exceptions;

public class CheckMonth {
	public void CheckMonth(int month) throws InvalidMonthException {
        if (month < 1 || month > 12) {
            throw new InvalidMonthException("Invalid month: " + month);
        } else {
            System.out.println("Valid month: " + month);
        }
	}
}
