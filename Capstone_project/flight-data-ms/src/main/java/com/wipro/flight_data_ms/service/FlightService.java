package com.wipro.flight_data_ms.service;

import org.springframework.stereotype.Service;
import com.wipro.flight_data_ms.repository.FlightRepository;
import com.wipro.flight_data_ms.model.Flight;

import java.util.List;

@Service
public class FlightService {

    private final FlightRepository flightRepository;

    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    public Flight getFlightById(Long id) {
        return flightRepository.findById(id).orElse(null);
    }

    public List<Flight> searchFlights(String source, String destination) {
        return flightRepository.findBySourceAndDestination(source, destination);
    }

    public Flight addFlight(Flight flight) {
        return flightRepository.save(flight);
    }
}
