package com.example.demo.domain;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class CustomerOrder {
    private Long id;
    private Long customerId;
    private Date orderDate;
    private String deliveryStatus;
    private List<OrderItem> items = new ArrayList<>();
    private List<Payment> payments = new ArrayList<>();

    public CustomerOrder(Long id, Long customerId, Date orderDate, List<OrderItem> items) {
        this.id = id;
        this.customerId = customerId;
        this.orderDate = orderDate;
        this.items = items;
    }

    public void addOrderItem(OrderItem item) {
        items.add(item);
    }

    public BigDecimal calculateTotal() {
        return items.stream()
                .map(OrderItem::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public void sendForDelivery() {
        this.deliveryStatus = "Sent for Delivery";
    }

    public void updateDeliveryStatus(String status) {
        this.deliveryStatus = status;
    }
}
