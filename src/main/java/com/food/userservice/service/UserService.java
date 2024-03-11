package com.food.userservice.service;

import com.food.userservice.model.Customer;
import com.food.userservice.model.AppUser;
import com.food.userservice.model.Restaurant;
import com.food.userservice.repository.AppUserRepository;
import com.food.userservice.repository.CustomerRepository;
import com.food.userservice.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private  CustomerRepository customerRepository;

    @Autowired
    private  RestaurantRepository restaurantRepository;


    @Autowired
    private AppUserRepository appUserRepository;


    public Customer saveCustomer(Customer user) {
        return customerRepository.save(user);
    }

    public Restaurant saveRestaurant(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    public Customer getCustomer(String  id) {
        return customerRepository.findById(id).orElse(null);
    }

    public Restaurant getRestaurant(String  id) {
        return restaurantRepository.findById(id).orElse(null);
    }

    public void deleteCustomer(String id) {
        customerRepository.deleteById(id);
    }


    public void deleteRestaurant(String id) {
        restaurantRepository.deleteById(id);
    }

    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    public List<Restaurant> getAllRestaurant() {
        return restaurantRepository.findAll();
    }

}
