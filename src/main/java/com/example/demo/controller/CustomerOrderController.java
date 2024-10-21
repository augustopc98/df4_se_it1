package com.example.demo.controller;

import com.example.demo.domain.CustomerOrder;
import com.example.demo.service.CustomerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class CustomerOrderController {

    @Autowired
    private CustomerOrderService customerOrderService;

    @PostMapping
    public void placeOrder(@RequestBody CustomerOrder order) {
        customerOrderService.placeOrder(order);
    }

    @GetMapping("/{orderId}")
    public CustomerOrder getOrderDetails(@PathVariable Long orderId) {
        return customerOrderService.getOrderDetails(orderId);
    }
}
