package com.example.testlol.init;

import com.example.testlol.dtos.CarDto;
import com.example.testlol.dtos.CustomerDto;
import com.example.testlol.services.CarService;
import com.example.testlol.services.CustomerService;
import com.example.testlol.services.OptionService;
import com.example.testlol.services.SaleService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Component
public class Main implements CommandLineRunner {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private CarService carService;
    @Autowired
    private SaleService saleService;
    @Autowired
    private OptionService optionService;
    @Autowired
    private CustomerService customerService;

    @Override
    public void run(String... args){
        seedData();
    }
    private void printAllCarsByModel(String model) {
        carService
                .findCarByModel(model)
                .forEach(System.out::println);
    }

    private void seedData() {
        CarDto car1 = new CarDto(null, "BMW", "M5", 2020, 15000000);
        CarDto car2 = new CarDto(null, "Mersedes", "S-Class", 2023, 23000000);
        CustomerDto customer= new CustomerDto(null, "Ivanov Ivan", "Russia, Moscow", "8349300484");
        car1 = carService.register(car1);
        car2 = carService.register(car2);

        printAllCarsByModel("M5");
        printAllCarsByModel("S-Class");

    }
}
