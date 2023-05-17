package com.geekster.RestaurantAPI.repositories;

import com.geekster.RestaurantAPI.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepo extends JpaRepository<Order,Integer> {
}
