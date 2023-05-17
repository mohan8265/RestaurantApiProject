package com.geekster.RestaurantAPI.services;

import com.geekster.RestaurantAPI.models.Admin;
import com.geekster.RestaurantAPI.repositories.IAdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    private IAdminRepo adminRepo;

    public String addAdmin(Admin signInInput) {
        adminRepo.save(signInInput);
        return "admin saved";
    }

    public Admin getAdmin(String email){
        return adminRepo.findByUserEmail(email);
    }


}
