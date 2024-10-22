package com.example.demo.domain;


import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;

    private BigDecimal amount;
    private Date paymentDate;
    private String paymentStatus;

    public Payment() {
    }

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
