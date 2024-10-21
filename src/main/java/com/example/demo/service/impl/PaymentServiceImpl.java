package com.example.demo.service.impl;

import com.example.demo.domain.Payment;
import com.example.demo.repository.PaymentRepository;
import com.example.demo.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public void processPayment(Payment payment) {
        payment.processPayment();
        paymentRepository.save(payment);
    }
}
