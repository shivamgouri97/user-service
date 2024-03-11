package com.food.userservice.repository;

import com.food.userservice.model.AppUser;
import com.food.userservice.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, String> {
}

