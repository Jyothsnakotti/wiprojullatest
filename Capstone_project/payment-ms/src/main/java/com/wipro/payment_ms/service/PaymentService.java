package com.wipro.payment_ms.service;

import org.springframework.stereotype.Service;
import com.wipro.payment_ms.repository.PaymentRepository;
import com.wipro.payment_ms.model.Payment;

import java.util.List;

@Service
public class PaymentService {

    private final PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    public Payment getPaymentById(Long id) {
        return paymentRepository.findById(id).orElse(null);
    }

    public List<Payment> getPaymentsByBookingId(Long bookingId) {
        return paymentRepository.findByBookingId(bookingId);
    }

    public Payment makePayment(Payment payment) {
        payment.setStatus("SUCCESS"); // Simplified for demo
        return paymentRepository.save(payment);
    }
}
