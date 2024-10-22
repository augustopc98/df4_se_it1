package com.example.demo.domain;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    private String customerAddress;
    private String customerEmail;

    public Customer() {
    }

    public Customer(Long customerId, String customerAddress, String customerEmail) {
        this.customerId = customerId;
        this.customerAddress = customerAddress;
        this.customerEmail = customerEmail;
    }


}
