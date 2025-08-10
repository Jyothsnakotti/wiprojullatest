package com.wipro.firstboot.repository;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class CityRepository {
    public List<String> getCities() {
        return Arrays.asList("Mumbai", "Delhi", "Bangalore", "Kolkata", "Chennai");
    }
}