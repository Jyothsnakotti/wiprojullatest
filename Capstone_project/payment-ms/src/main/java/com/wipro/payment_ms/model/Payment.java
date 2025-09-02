package com.wipro.payment_ms.model;

import jakarta.persistence.*;

@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long bookingId;
    private String paymentMethod; // e.g., CREDIT_CARD, PAYTM, UPI
    private double amount;
    private String status; // INITIATED, SUCCESS, FAILED

    public Payment() {}

    public Payment(Long bookingId, String paymentMethod, double amount, String status) {
        this.bookingId = bookingId;
        this.paymentMethod = paymentMethod;
        this.amount = amount;
        this.status = status;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getBookingId() { return bookingId; }
    public void setBookingId(Long bookingId) { this.bookingId = bookingId; }

    public String getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod(String paymentMethod) { this.paymentMethod = paymentMethod; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
