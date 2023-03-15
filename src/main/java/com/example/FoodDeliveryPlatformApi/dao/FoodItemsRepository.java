package com.example.FoodDeliveryPlatformApi.dao;

import com.example.FoodDeliveryPlatformApi.model.FoodItems;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodItemsRepository extends JpaRepository<FoodItems,Integer> {
}
