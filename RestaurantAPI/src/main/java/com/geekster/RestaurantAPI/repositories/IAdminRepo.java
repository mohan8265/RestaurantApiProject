package com.geekster.RestaurantAPI.repositories;

import com.geekster.RestaurantAPI.models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdminRepo extends JpaRepository<Admin,String> {
    Admin findByUserEmail(String email);
}
