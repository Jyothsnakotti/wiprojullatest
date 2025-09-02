package com.wipro.payment_ms.controller;

import org.springframework.web.bind.annotation.*;
import com.wipro.payment_ms.model.Payment;
import com.wipro.payment_ms.service.PaymentService;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
@CrossOrigin(origins = "*")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping
    public List<Payment> getAllPayments() {
        return paymentService.getAllPayments();
    }

    @GetMapping("/{id}")
    public Payment getPaymentById(@PathVariable Long id) {
        return paymentService.getPaymentById(id);
    }

    @GetMapping("/booking/{bookingId}")
    public List<Payment> getPaymentsByBookingId(@PathVariable Long bookingId) {
        return paymentService.getPaymentsByBookingId(bookingId);
    }

    @PostMapping
    public Payment makePayment(@RequestBody Payment payment) {
        return paymentService.makePayment(payment);
    }
}
