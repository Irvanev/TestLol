package com.example.testlol.services;

import com.example.testlol.dtos.CarDto;

import java.util.List;
import java.util.Optional;

public interface CarService {

    CarDto register(CarDto car);

    List<CarDto> getAll();

    Optional<CarDto> get(Long id);

    void delete(Long id);

    CarDto update(CarDto car);

    List<CarDto>findCarByModel(String model);
}

