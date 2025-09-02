package com.wipro.flight_data_ms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.wipro.flight_data_ms.model.Flight;
import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Long> {
    List<Flight> findBySourceAndDestination(String source, String destination);
}
