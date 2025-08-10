package com.wipro.solid;

public class PaymentService {
	
	private PaymentGateway paymentGateway;
    public PaymentService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void makePayment(double amount) {
        paymentGateway.pay(amount);
    }
}
