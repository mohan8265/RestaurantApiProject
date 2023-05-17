package com.geekster.RestaurantAPI.controllers;

import com.geekster.RestaurantAPI.dto.SignInInput;
import com.geekster.RestaurantAPI.models.Food;
import com.geekster.RestaurantAPI.services.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {
    @Autowired
    private FoodService foodService;

    @PostMapping()
    public String addFood(@RequestBody SignInInput signInInput,@RequestBody Food food){
        return foodService.addFood(signInInput,food);
    }
    @GetMapping()
    public List<Food> getFoods(){
        return foodService.getFoods();
    }
    @GetMapping("/{id}")
    public Food getFood(Integer id){
        return foodService.getFood(id);
    }
}
