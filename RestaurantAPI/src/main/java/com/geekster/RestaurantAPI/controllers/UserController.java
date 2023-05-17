package com.geekster.RestaurantAPI.controllers;

import com.geekster.RestaurantAPI.dto.SignInInput;
import com.geekster.RestaurantAPI.models.User;
import com.geekster.RestaurantAPI.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public String signUp(@RequestBody User user){
        return userService.signUp(user);
    }
    @PostMapping("/signin")
    public String signIn(@RequestBody SignInInput signInInput){
        return userService.signIn(signInInput);
    }
    @GetMapping()
    public List<User> getUsers(){
        return userService.getUsers();
    }
    @GetMapping("/{email}")
    public User getUser(@PathVariable String email){
        return userService.getUser(email);
    }
}
