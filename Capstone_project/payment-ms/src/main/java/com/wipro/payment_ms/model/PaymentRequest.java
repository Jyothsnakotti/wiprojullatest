package com.wipro.payment_ms.model;
 
public class PaymentRequest {
 
    private Long bookingId;
    private double amount;
    private String paymentMode;
 
    public PaymentRequest() {}
 
    public PaymentRequest(Long bookingId, double amount, String paymentMode) {
        this.bookingId = bookingId;
        this.amount = amount;
        this.paymentMode = paymentMode;
    }
 
    public Long getBookingId() { return bookingId; }
    public void setBookingId(Long bookingId) { this.bookingId = bookingId; }
 
    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }
 
    public String getPaymentMode() { return paymentMode; }
    public void setPaymentMode(String paymentMode) { this.paymentMode = paymentMode; }
}