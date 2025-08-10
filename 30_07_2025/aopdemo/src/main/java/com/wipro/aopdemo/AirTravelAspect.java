package com.wipro.aopdemo;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AirTravelAspect {

    @Before("execution(* com.wipro.aopdemo.AirTravelProcess.checkIn(..))")
    public void showPhotoId() {
        System.out.println("AOP Advice: Please show your Photo ID before check-in.");
    }

    @Before("execution(* com.wipro.aopdemo.AirTravelProcess.doSecurityCheck(..)) || execution(* com.wipro.aopdemo.AirTravelProcess.doBoarding(..))")
    public void showBoardingPass() {
        System.out.println("AOP Advice: Please show your Boarding Pass.");
    }

    @AfterThrowing(
        pointcut = "execution(* com.wipro.aopdemo.AirTravelProcess.checkIn(..))",
        throwing = "ex"
    )
    public void handleNoSeatException(NoSeatAvailableException ex) {
        System.out.println("AOP AfterThrowing: " + ex.getMessage());
    }
}