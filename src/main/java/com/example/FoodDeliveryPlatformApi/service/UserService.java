package com.example.FoodDeliveryPlatformApi.service;

import com.example.FoodDeliveryPlatformApi.dao.UserRepository;
import com.example.FoodDeliveryPlatformApi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
    public void addUserDetails(User user) {
        userRepository.save(user);
    }

    public List<User> getUserDetails(Integer userId) {
        List<User> userList;

        if(null!=userId){         // if admin can provide particular user_id then get particular user details else get all user details
            List<User> list = new ArrayList<>();
            if(userRepository.findById(userId).isPresent()) {
                list.add(userRepository.findById(userId).get());
                return list;
            }else{
                return null;
            }
        }else {
            userList = userRepository.findAll();
        }
        return userList;
    }
}
