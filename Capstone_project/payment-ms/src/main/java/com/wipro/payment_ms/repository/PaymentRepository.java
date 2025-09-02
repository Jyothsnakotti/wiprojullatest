package com.wipro.payment_ms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.wipro.payment_ms.model.Payment;
import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    List<Payment> findByBookingId(Long bookingId);
}
