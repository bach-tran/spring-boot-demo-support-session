package com.revature.springbootdemo.controller;

import com.revature.springbootdemo.dao.CarRepository;
import com.revature.springbootdemo.model.Car;
import com.revature.springbootdemo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class CarController {

    /*
        Dependency injection: Spring is injecting a dependency (an object) into the CarController Object

        Injecting CarRepository object into CarController object
     */

    // 3 different types of dependency injection: Field injection, constructor injection, setter injection

    @Autowired // Field injection
    private CarService carService;

    public CarController() {
    }

    // @Autowired // Constructor injection
//    public CarController(CarRepository cr) {
//        this.carRepository = cr;
//    }

    // @Autowired // setter injection
//    public void setCarRepository(CarRepository carRepository) {
//        this.carRepository = carRepository;
//    }

    @GetMapping("/cars")
    public List<Car> getAllCars() {
        List<Car> listOfCars = carService.getAllCars(); // Grab all Cars from the car table in the Postgres database

        return listOfCars;
    }

//    @PostMapping("/car")
//    public Car addCar(@RequestBody Car carToAdd) {
//        Car carThatWasJustAdded = carRepository.save(carToAdd);
//
//        return carThatWasJustAdded;
//    }
//
//    @DeleteMapping("/car/{car_id}")
//    public ResponseEntity<String> deleteCar(@PathVariable("car_id") int id) {
//        try {
//            carRepository.findById(id).get(); // Check if Car exists, if not it will throw NoSuchElementException
//
//            carRepository.deleteById(id);
//
//            return ResponseEntity.ok("Car with id " + id + " was deleted successfully");
//        } catch (NoSuchElementException e) {
//            return ResponseEntity.status(404).body("Car with id " + id + " was not found!");
//        }
//
//    }
//
//    @GetMapping("/car/{car_id}")
//    public ResponseEntity<Object> getCarById(@PathVariable("car_id") int id) {
//        try {
//            Car car = carRepository.findById(id).get();
//
//            return ResponseEntity.ok(car);
//        } catch (NoSuchElementException e) {
//            return ResponseEntity.status(404).body("Car with id " + id + " was not found!");
//        }
//
//    }

}
