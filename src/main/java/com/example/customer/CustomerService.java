package com.example.customer;

import org.springframework.stereotype.Service;

@Service
public record CustomerService() {
    public void registerCustomer (CustomerRegistrationRequest request){
        Customer client= Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
        //todo: check if email valid
        // todo: check if email not taken
        // todo: store client in DB
    }
}
