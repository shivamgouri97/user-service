package com.food.controller;

import com.food.model.Restaurant;
import com.food.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users/restaurant")
public class RestaurantController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public ResponseEntity<Restaurant> createRestaurant(@RequestBody Restaurant restaurant) {
        return ResponseEntity.ok(userService.saveRestaurant(restaurant));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Restaurant> getRestaurant(@PathVariable String id) {
        return ResponseEntity.ok(userService.getRestaurant(id));
    }

    @DeleteMapping("/{id}")
    public void deleteRestaurant(@PathVariable String id) {
        userService.deleteRestaurant(id);
    }

    @GetMapping("/")
    public ResponseEntity<List<Restaurant>> getAllRestaurant() {
        return ResponseEntity.ok(userService.getAllRestaurant());
    }

}
