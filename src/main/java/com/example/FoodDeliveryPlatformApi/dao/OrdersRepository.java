package com.example.FoodDeliveryPlatformApi.dao;

import com.example.FoodDeliveryPlatformApi.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders,Integer> {
}
