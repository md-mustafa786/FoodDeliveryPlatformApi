package com.example.FoodDeliveryPlatformApi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "food_items_tbl")
public class FoodItems {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "food_id")
     private Integer foodId;
     @Column(name = "food_name")
     @NotBlank(message = "food name are required")
     private String name;
     @Column(name = "description")
     private String description;
     @Column(name = "price")
     private BigDecimal price;
}
