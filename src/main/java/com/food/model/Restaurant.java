package com.food.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Restaurant extends AppUser {
    private String cuisine;

}
