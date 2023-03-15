package com.example.FoodDeliveryPlatformApi.controller;

import com.example.FoodDeliveryPlatformApi.model.Orders;
import com.example.FoodDeliveryPlatformApi.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping(value = "/add/orderDettails")
    public ResponseEntity<String> addDetails(@RequestBody Orders orders){
        orderService.addOrderDetails(orders);
        return new ResponseEntity<>("order detailed added successfully", HttpStatus.CREATED);
    }

    @GetMapping(value = "find/oredrHistoery/by/user/id")
    public List<Orders> getOrderHistory(@RequestParam Integer userId){
        return orderService.getOrderHistory(userId);
    }
}
