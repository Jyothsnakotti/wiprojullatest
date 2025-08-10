package com.example.carmicroservice.service;

import java.util.List;
import java.util.Optional;

import com.example.carmicroservice.entity.Car;
import com.example.carmicroservice.repository.CarRepository;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public Car saveCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @Override
    public Optional<Car> getCarById(Long id) {
        return carRepository.findById(id);
    }

    @Override
    public Car updateCar(Long id, Car car) {
        return carRepository.findById(id)
                .map(existingCar -> {
                    existingCar.setMake(car.getMake());
                    existingCar.setRegistrationDetail(car.getRegistrationDetail());
                    return carRepository.save(existingCar);
                })
                .orElseThrow(() -> new RuntimeException("Car not found with id " + id));
    }

    @Override
    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }
}
