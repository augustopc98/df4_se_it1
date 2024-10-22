package com.example.demo.repository;

import com.example.demo.domain.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerOrderRepository extends JpaRepository<CustomerOrder, Long> {
    // JpaRepository provides methods like save(), findById(), deleteById(), etc.
}
