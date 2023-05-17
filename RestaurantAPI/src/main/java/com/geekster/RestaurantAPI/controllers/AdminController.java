package com.geekster.RestaurantAPI.controllers;

import com.geekster.RestaurantAPI.models.Admin;
import com.geekster.RestaurantAPI.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @PostMapping()
    public String addAdmin(@RequestBody Admin signInInput){
        return adminService.addAdmin(signInInput);
    }

}
