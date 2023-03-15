package com.example.FoodDeliveryPlatformApi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users_tbl")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "email")
    @NotBlank(message = "Email is Required")
    @Email
    private String email;
    @Column(name = "password")
    @NotBlank(message = "please enter password ex.-> Mustafa123$")
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$",message = "please enter password ex.-> Mustafa123$")
    private String password;
    @Column(name = "phone_number")
    @NotBlank(message = "phone number is required")
    @Pattern(regexp = "^\\+\\d{2}\\d{10}$",message = "please provide valid phone number ex->  +918932022806")
    private String phoneNumber;
    @Column(name = "address")
    private String address;
}
