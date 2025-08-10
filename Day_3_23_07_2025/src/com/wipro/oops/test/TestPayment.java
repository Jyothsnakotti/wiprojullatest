package com.wipro.oops.test;

import com.wipro.oops.GPay;
import com.wipro.oops.PaymentMethod;
import com.wipro.oops.PhonePay;

public class TestPayment {

	public static void main(String[] args) {
		
		PaymentMethod p=new GPay();
		p.pay(1000);
		
		PaymentMethod p1=new PhonePay();
		p1.pay(22000);
	
	}

}
