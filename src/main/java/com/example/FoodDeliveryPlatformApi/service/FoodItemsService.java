package com.example.FoodDeliveryPlatformApi.service;

import com.example.FoodDeliveryPlatformApi.dao.FoodItemsRepository;
import com.example.FoodDeliveryPlatformApi.model.FoodItems;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoodItemsService {
    @Autowired
    FoodItemsRepository foodItemsRepository;
    public void saveFoodItems(FoodItems foodItems) {
       foodItemsRepository.save(foodItems);
    }

    public List<FoodItems> getFoodItem(Integer id) {
        List<FoodItems> foodItemsList;

        if(null!=id){
            List<FoodItems> list = new ArrayList<>();
            list.add(foodItemsRepository.findById(id).get());
            return list;
        }else {
            foodItemsList = foodItemsRepository.findAll();
        }
        return foodItemsList;
    }

    public void updateFoodItems(FoodItems NewfoodItems, Integer id) {
        FoodItems foodItems1 = foodItemsRepository.findById(id).get();
        foodItems1.setDescription(NewfoodItems.getDescription());
        foodItems1.setName(NewfoodItems.getName());
        foodItems1.setPrice(NewfoodItems.getPrice());
        foodItemsRepository.save(foodItems1);
    }

    public void deleteFoodItems(Integer id) {
        foodItemsRepository.deleteById(id);
    }
}
