package com.wipro.booking_ms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.wipro.booking_ms.model.Booking;
import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByPassengerEmail(String passengerEmail);
}
