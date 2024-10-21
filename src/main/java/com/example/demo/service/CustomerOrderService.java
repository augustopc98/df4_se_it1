package com.example.demo.service;

import com.example.demo.domain.CustomerOrder;

public interface CustomerOrderService {
    void placeOrder(CustomerOrder order);
    CustomerOrder getOrderDetails(Long orderId);
    void cancelOrder(Long orderId);
}
