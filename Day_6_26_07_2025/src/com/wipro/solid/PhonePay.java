package com.wipro.solid;

public class PhonePay implements PaymentGateway {


	public void pay(double amount) {
		System.out.println("Paid " + amount + " using GooglePay");

	}
}
