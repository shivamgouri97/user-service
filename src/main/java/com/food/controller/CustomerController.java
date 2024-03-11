
package com.food.controller;

import com.food.model.Customer;
import com.food.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users/customer")
public class CustomerController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        return ResponseEntity.ok(userService.saveCustomer(customer));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable String id) {
        return ResponseEntity.ok(userService.getCustomer(id));
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable String id) {
        userService.deleteCustomer(id);
    }

    @GetMapping("/")
    public List<Customer> getAllCustomer() {
        return userService.getAllCustomer();
    }
}
