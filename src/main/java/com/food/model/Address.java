package com.food.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private  String addressLine1;
    private  String addressLine2;
    private  String addressLine3;
    private  String city;
    private  String state;
    private  String country;
    private  String pincode;
}
