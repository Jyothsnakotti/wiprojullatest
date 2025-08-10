package com.example.carmicroservice.service;

import java.util.List;
import java.util.Optional;

import com.example.carmicroservice.entity.Car;

public interface CarService {

    Car saveCar(Car car);

    List<Car> getAllCars();

    Optional<Car> getCarById(Long id);

    Car updateCar(Long id, Car car);

    void deleteCar(Long id);
}
