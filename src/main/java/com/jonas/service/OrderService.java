package com.jonas.service;

import com.jonas.entity.Order;
import com.jonas.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * 【 enter the class description 】
 *
 * @author shenjy 2018/12/01
 */
@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public Order save(Order order) {
        return orderRepository.save(order);
    }

    public Order getById(Long orderId) {
        return orderRepository.findById(orderId).orElse(null);
    }

    public Order getOrder(Long userId) {
        return orderRepository.findByUserId(userId);
    }
}
