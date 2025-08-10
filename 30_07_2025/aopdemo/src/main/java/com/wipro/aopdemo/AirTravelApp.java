package com.wipro.aopdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AirTravelApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        AirTravelProcess process = context.getBean(AirTravelProcess.class);

        System.out.println("Scenario 1: Seat Available");
        try {
            process.checkIn(true); // Will print check-in successful
            process.collectBoardingPass();
            process.doSecurityCheck();
            process.doBoarding();
        } catch (Exception ex) {
            // Already handled by AfterThrowing advice
        }

        System.out.println("\nScenario 2: No Seat Available");
        try {
            process.checkIn(false); // Will throw exception, advice handles it
            process.collectBoardingPass();
            process.doSecurityCheck();
            process.doBoarding();
        } catch (Exception ex) {
            // Already handled by AfterThrowing advice
        }
    }
}