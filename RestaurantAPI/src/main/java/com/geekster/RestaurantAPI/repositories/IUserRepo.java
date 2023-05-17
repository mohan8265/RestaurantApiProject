package com.geekster.RestaurantAPI.repositories;

import com.geekster.RestaurantAPI.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<User,Integer> {
    User findByUserEmail(String email);
}
