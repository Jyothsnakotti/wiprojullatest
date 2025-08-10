package com.wipro.solid;

public class GooglePay implements PaymentGateway {

	public void pay(double amount) {
		System.out.println("Paid " + amount + " using GooglePay");
	}

}
