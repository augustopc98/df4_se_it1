package com.example.demo.domain;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class OrderItem {
    private Long id;
    private Long productId;
    private int quantity;
    private BigDecimal productPrice;

    public OrderItem(Long id, Long productId, int quantity, BigDecimal productPrice) {
        this.id = id;
        this.productId = productId;
        this.quantity = quantity;
        this.productPrice = productPrice;
    }

    public BigDecimal getPrice() {
        return productPrice.multiply(BigDecimal.valueOf(quantity));
    }

    public boolean validateItem() {
        return quantity > 0 && productPrice.compareTo(BigDecimal.ZERO) > 0;
    }
}
