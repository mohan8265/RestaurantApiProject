package com.geekster.RestaurantAPI.services;

import com.geekster.RestaurantAPI.dto.SignInInput;
import com.geekster.RestaurantAPI.models.Food;
import com.geekster.RestaurantAPI.models.User;
import com.geekster.RestaurantAPI.repositories.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private IOrderRepo orderRepo;

    @Autowired
    private UserService userService;

    public String orderFood(SignInInput signInInput, Food food) {
        User user = userService.getUser(signInInput.getUserEmail());
        if(user==null){
            throw new IllegalStateException("Not a valid user");
        }

        return "Your order has received..";
    }
}
