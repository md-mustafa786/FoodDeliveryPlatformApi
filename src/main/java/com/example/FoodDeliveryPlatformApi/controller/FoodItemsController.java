package com.example.FoodDeliveryPlatformApi.controller;

import com.example.FoodDeliveryPlatformApi.model.FoodItems;
import com.example.FoodDeliveryPlatformApi.service.FoodItemsService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FoodItemsController {
    @Autowired
    FoodItemsService foodItemsService;

    @PostMapping(value = "add/foodItems")
    public ResponseEntity<String> addFoodItems(@RequestBody @Valid FoodItems foodItems){
        foodItemsService.saveFoodItems(foodItems);
        return new ResponseEntity<>("saved item successfully", HttpStatus.CREATED);
    }

    @GetMapping(value = "get/AllfoodItems/or/getOne/byId")
    public List<FoodItems> getFoodItems(@Nullable @RequestParam Integer id){
       return foodItemsService.getFoodItem(id);
    }

    @PutMapping(value = "/update/food/items")
    public ResponseEntity<String> updateDetails(@RequestBody FoodItems foodItems, @RequestParam Integer id){

        foodItemsService.updateFoodItems(foodItems,id);
        return new ResponseEntity<>("updated successfully",HttpStatus.OK);
    }


    @DeleteMapping(value = "/delete/food/by/Id")
    public ResponseEntity<String> delteFoodItems(@RequestParam Integer id){
        foodItemsService.deleteFoodItems(id);
        return new ResponseEntity<>("deleted successfully",HttpStatus.OK);
    }
}
