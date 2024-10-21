package com.example.demo.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {
    private Long customerId;
    private String customerAddress;
    private String customerEmail;

    public Customer(Long customerId, String customerAddress, String customerEmail) {
        this.customerId = customerId;
        this.customerAddress = customerAddress;
        this.customerEmail = customerEmail;
    }
}
