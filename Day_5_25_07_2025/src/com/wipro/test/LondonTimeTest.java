package com.wipro.test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import java.util.function.Consumer;

public class LondonTimeTest {

	public static void main(String[] args) {
		
	
        Consumer<String> localTime = zone -> {
            ZonedDateTime ct = ZonedDateTime.now(ZoneId.of(zone));
            System.out.println("Current time in " + zone + " : " + ct);
        };

      
      localTime.accept("Europe/London");
	}
}
