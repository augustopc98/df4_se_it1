package com.example.demo.controller;

import com.example.demo.domain.Payment;
import com.example.demo.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public void processPayment(@RequestBody Payment payment) {
        paymentService.processPayment(payment);
    }
}
