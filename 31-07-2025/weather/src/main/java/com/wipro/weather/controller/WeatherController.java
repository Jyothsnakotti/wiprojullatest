package com.wipro.weather.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

	@GetMapping("/weather")
    public String getWeather(@RequestParam String city, @RequestParam String day) {
        return "Weather in " + city + " for " + day + " is cloudy.";
    }
    @GetMapping("/tocentigrade/{temp}")
    public String convertToCentigrade(@PathVariable double temp) {
        double celsius = (temp - 32) * 5 / 9;
        return String.format("Centigrade equivalent of %.1f°F is %.1f°C", temp, celsius);
    }
}
