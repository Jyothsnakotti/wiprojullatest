package com.wipro.test;

import java.util.function.Function;

public class Exercise_9 {

	public static void main(String[] args) {

        Function<Double, Double> getFraction = n -> n - Math.floor(n);

        double result = getFraction.apply(99.785);

        System.out.printf("Fractional part: %.3f", result);
	}

}
