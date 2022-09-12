package com.revature.springbootdemo.service;

import com.revature.springbootdemo.dao.CarRepository;
import com.revature.springbootdemo.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

}
