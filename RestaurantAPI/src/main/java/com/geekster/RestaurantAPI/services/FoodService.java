package com.geekster.RestaurantAPI.services;

import com.geekster.RestaurantAPI.dto.SignInInput;
import com.geekster.RestaurantAPI.models.Admin;
import com.geekster.RestaurantAPI.models.Food;
import com.geekster.RestaurantAPI.repositories.IFoodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {
    @Autowired
    private IFoodRepo foodRepo;
    @Autowired
    private UserService userService;
    @Autowired
    private AdminService adminService;

    public String addFood(SignInInput signInInput, Food food){
        Admin admin = adminService.getAdmin(signInInput.getUserEmail());
        if(admin==null){
            throw new IllegalStateException("not a Admin");
        }

        foodRepo.save(food);
        return "food saved";
    }

    public List<Food> getFoods() {
        return foodRepo.findAll();
    }

    public Food getFood(Integer id) {
        return foodRepo.findById(id).get();
    }
}
