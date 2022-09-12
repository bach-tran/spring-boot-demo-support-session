package com.revature.springbootdemo.dao;

import com.revature.springbootdemo.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {

    // Spring Data JPA: an abstraction sitting on top of Hibernate

}
