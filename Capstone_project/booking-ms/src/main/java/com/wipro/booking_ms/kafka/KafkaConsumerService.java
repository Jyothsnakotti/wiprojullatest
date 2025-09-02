package com.wipro.booking_ms.kafka;
 
import com.wipro.booking_ms.model.Booking;
import com.wipro.booking_ms.repository.BookingRepository;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
 
import java.util.Optional;
 
@Service
public class KafkaConsumerService {
 
    private final BookingRepository bookingRepository;
 
    public KafkaConsumerService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }
 
    @KafkaListener(topics = "T2", groupId = "booking-group")
    public void consumePaymentStatus(String message) {
        System.out.println("Received payment status: " + message);
 
        // Message format: "bookingId:STATUS"
        String[] parts = message.split(":");
        if (parts.length != 2) return;
 
        Long bookingId = Long.parseLong(parts[0]);
        String status = parts[1];
 
        Optional<Booking> optionalBooking = bookingRepository.findById(bookingId);
        if (optionalBooking.isPresent()) {
            Booking booking = optionalBooking.get();
            booking.setStatus(status);  // Update status
            bookingRepository.save(booking);
            System.out.println("Booking updated: " + bookingId + " -> " + status);
 
            // Optional: trigger e-ticket generation if status is SUCCESS
            if ("SUCCESS".equalsIgnoreCase(status)) {
                generateETicket(booking);
            }
        }
    }
 
    private void generateETicket(Booking booking) {
        // Simulate e-ticket generation
        System.out.println("E-ticket generated for booking: " + booking.getId());
    }
}