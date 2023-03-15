package com.example.FoodDeliveryPlatformApi.service;

import com.example.FoodDeliveryPlatformApi.dao.OrdersRepository;
import com.example.FoodDeliveryPlatformApi.dao.UserRepository;
import com.example.FoodDeliveryPlatformApi.exception.RecordNotFound;
import com.example.FoodDeliveryPlatformApi.model.Orders;
import com.example.FoodDeliveryPlatformApi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrdersRepository ordersRepository;

    @Autowired
    UserRepository userRepository;
    public void addOrderDetails(Orders orders) {
        ordersRepository.save(orders);
    }

    public List<Orders> getOrderHistory(Integer userId) throws RecordNotFound {
        User user = userRepository.findById(userId).get();
    if(user.getUserId()==userId){
        List<Orders> ordersList = new ArrayList<>();
       ordersList.add(ordersRepository.findById(userId).get());
       return ordersList;
    }else {
       throw new RecordNotFound("Not Found");
        }
    }
}
