package com.wipro.oops;

public class PhonePay implements PaymentMethod {

	
	public void pay(double amount) {
		System.out.println("The " + amount + " paid using PhonePay");

	}

}
