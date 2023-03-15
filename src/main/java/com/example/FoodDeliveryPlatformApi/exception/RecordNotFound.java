package com.example.FoodDeliveryPlatformApi.exception;

public class RecordNotFound extends RuntimeException{

    public RecordNotFound(String message){
        super(message);
    }
}
