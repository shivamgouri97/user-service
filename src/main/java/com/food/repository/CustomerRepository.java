package com.food.repository;

import com.food.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository  extends JpaRepository<Customer, String> {
}
