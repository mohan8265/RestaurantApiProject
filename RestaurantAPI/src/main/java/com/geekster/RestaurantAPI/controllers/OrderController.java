package com.geekster.RestaurantAPI.controllers;

import com.geekster.RestaurantAPI.dto.SignInInput;
import com.geekster.RestaurantAPI.models.Food;
import com.geekster.RestaurantAPI.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping()
    public String orderFood(@RequestBody SignInInput signInInput, @RequestBody Food food){
        return orderService.orderFood(signInInput,food);
    }
}
