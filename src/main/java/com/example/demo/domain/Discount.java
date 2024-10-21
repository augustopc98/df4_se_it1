package com.example.demo.domain;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Discount {
    private BigDecimal discountPercentage;

    public Discount(BigDecimal discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public BigDecimal applyDiscount(BigDecimal totalAmount) {
        return totalAmount.multiply(BigDecimal.ONE.subtract(discountPercentage.divide(BigDecimal.valueOf(100))));
    }
}