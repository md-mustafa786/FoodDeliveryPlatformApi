package com.example.FoodDeliveryPlatformApi.dao;

import com.example.FoodDeliveryPlatformApi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
