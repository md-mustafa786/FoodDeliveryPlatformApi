package com.example.FoodDeliveryPlatformApi.controller;

import com.example.FoodDeliveryPlatformApi.model.User;
import com.example.FoodDeliveryPlatformApi.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired   //inject userService class object
    UserService userService;

    @PostMapping(value = "add/user/details")  // saved user details
    public ResponseEntity<String> addUser(@RequestBody  @Valid User userData){

            userService.addUserDetails(userData);
            return new ResponseEntity<>("saved user details successfully", HttpStatus.CREATED);
    }


   @GetMapping(value = "get/all_user/or/by_id") // get all user details or get one user by userId
   public ResponseEntity<String> getUserDetail(@Nullable @RequestParam Integer userId){
      List<User> list = userService.getUserDetails(userId);
      if(null!=list){
          return new ResponseEntity<>(list.toString(),HttpStatus.OK);
      }
      return new ResponseEntity<>("userId doesn't exixt",HttpStatus.BAD_REQUEST);
   }

}
