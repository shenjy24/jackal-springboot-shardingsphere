package com.jonas.repository;

import com.jonas.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * OrderRepository
 *
 * @author shenjy
 * @time 2024/4/11 15:58
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    Order findByUserId(Long userId);
}
