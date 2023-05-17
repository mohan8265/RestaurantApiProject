package com.geekster.RestaurantAPI.repositories;

import com.geekster.RestaurantAPI.models.AuthenticationToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAuthenticationTokenRepo extends JpaRepository<AuthenticationToken,Integer> {
}
