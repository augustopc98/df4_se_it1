package com.example.demo.domain;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
public class Payment {
    private Long paymentId;
    private BigDecimal amount;
    private Date paymentDate;
    private String paymentStatus;

    public Payment(Long paymentId, BigDecimal amount, Date paymentDate, String paymentStatus) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.paymentStatus = paymentStatus;
    }

    public void processPayment() {
        setPaymentStatus("Processed");
    }
}
