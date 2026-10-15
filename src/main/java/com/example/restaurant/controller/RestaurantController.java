package com.example.restaurant.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restaurant.model.Restaurant;

@RestController
public class RestaurantController {

    @GetMapping("/restaurant")
    public List<Restaurant> getRestaurants() {
        return Arrays.asList(
            new Restaurant(1, "ABC Restaurant", "Hyderabad", "Indian"),
            new Restaurant(2, "Food Palace", "Vijayawada", "Chinese"),
            new Restaurant(3, "Spicy Hub", "Guntur", "Biryani"),
            new Restaurant(4, "Green Garden", "Chennai", "Vegetarian"),
            new Restaurant(5, "Pizza Corner", "Bengaluru", "Italian")
        );
    }
}