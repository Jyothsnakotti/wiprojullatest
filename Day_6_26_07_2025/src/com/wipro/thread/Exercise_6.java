package com.wipro.thread;

import com.wipro.solid.GooglePay;
import com.wipro.solid.PaymentService;
import com.wipro.solid.Paytm;
import com.wipro.solid.PhonePay;

public class Exercise_6 {
	public static void main(String[] args) {

        
        PaymentService gpayService = new PaymentService(new GooglePay());
        gpayService.makePayment(1500.00);

        PaymentService phonePayService = new PaymentService(new PhonePay());
        phonePayService.makePayment(500.00);

        PaymentService paytmService = new PaymentService(new Paytm());
        paytmService.makePayment(450.00);
    }
}
