package com.example.demo.service.impl;

import com.example.demo.domain.CustomerOrder;
import com.example.demo.repository.CustomerOrderRepository;
import com.example.demo.service.CustomerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerOrderServiceImpl implements CustomerOrderService {

    @Autowired
    private CustomerOrderRepository customerOrderRepository;

    @Override
    public void placeOrder(CustomerOrder order) {
        customerOrderRepository.save(order);
    }

    @Override
    public CustomerOrder getOrderDetails(Long orderId) {
        return customerOrderRepository.findById(orderId).orElse(null);
    }

    @Override
    public void cancelOrder(Long orderId) {
        customerOrderRepository.deleteById(orderId);
    }
}
