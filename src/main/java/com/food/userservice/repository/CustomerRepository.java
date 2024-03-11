package com.food.userservice.repository;

import com.food.userservice.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository  extends JpaRepository<Customer, String> {
}
