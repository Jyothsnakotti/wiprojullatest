package com.wipro.flight_data_ms.controller;

import org.springframework.web.bind.annotation.*;
import com.wipro.flight_data_ms.model.Flight;
import com.wipro.flight_data_ms.service.FlightService;

import java.util.List;

@RestController
@RequestMapping("/api/flights")
@CrossOrigin(origins = "*")
public class FlightController {

    private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping
    public List<Flight> getAllFlights() {
        return flightService.getAllFlights();
    }

    @GetMapping("/{id}")
    public Flight getFlightById(@PathVariable Long id) {
        return flightService.getFlightById(id);
    }

    @GetMapping("/search")
    public List<Flight> searchFlights(@RequestParam String source, @RequestParam String destination) {
        return flightService.searchFlights(source, destination);
    }

    @PostMapping
    public Flight addFlight(@RequestBody Flight flight) {
        return flightService.addFlight(flight);
    }
}
