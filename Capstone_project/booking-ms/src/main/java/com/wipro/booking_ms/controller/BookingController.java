package com.wipro.booking_ms.controller;

import org.springframework.web.bind.annotation.*;
import com.wipro.booking_ms.model.Booking;
import com.wipro.booking_ms.service.BookingService;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
@CrossOrigin(origins = "*")
public class BookingController {

    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping
    public List<Booking> getAllBookings() {
        return bookingService.getAllBookings();
    }

    @GetMapping("/{id}")
    public Booking getBookingById(@PathVariable Long id) {
        return bookingService.getBookingById(id);
    }

    @GetMapping("/user")
    public List<Booking> getBookingsByEmail(@RequestParam String email) {
        return bookingService.getBookingsByEmail(email);
    }

    @PostMapping
    public Booking addBooking(@RequestBody Booking booking) {
        return bookingService.addBooking(booking);
    }
}
