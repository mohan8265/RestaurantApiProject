package com.geekster.RestaurantAPI.repositories;

import com.geekster.RestaurantAPI.models.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFoodRepo extends JpaRepository<Food,Integer> {
}
