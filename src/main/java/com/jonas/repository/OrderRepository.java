package com.jonas.repository;

import com.jonas.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * OrderRepository
 *
 * @author shenjy
 * @time 2024/4/11 15:58
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
    Order getByUserId(Long userId);
}
