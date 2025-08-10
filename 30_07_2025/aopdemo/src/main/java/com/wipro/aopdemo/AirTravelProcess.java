package com.wipro.aopdemo;

import org.springframework.stereotype.Component;

@Component
public class AirTravelProcess {

    public void checkIn(Boolean seatAvailable) throws NoSeatAvailableException {
        if (seatAvailable) {
            System.out.println("Check-in successful.");
        } else {
            throw new NoSeatAvailableException("No seat available for check-in!");
        }
    }

    public void collectBoardingPass() {
        System.out.println("Boarding pass collected.");
    }

    public void doSecurityCheck() {
        System.out.println("Security check completed.");
    }

    public void doBoarding() {
        System.out.println("Boarded the flight.");
    }
}