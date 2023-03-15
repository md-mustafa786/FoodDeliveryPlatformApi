package com.example.FoodDeliveryPlatformApi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orders_tbl")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Integer orderId;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "order_date")
    private Timestamp orderDate;

    @ManyToOne
    @JoinColumn(name = "food_item_id")
    private FoodItems foodId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userId;
}
