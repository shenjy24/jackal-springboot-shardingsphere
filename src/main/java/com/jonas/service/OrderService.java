package com.jonas.service;

import com.jonas.entity.Order;
import org.springframework.stereotype.Service;

/**
 * 【 enter the class description 】
 *
 * @author shenjy 2018/12/01
 */
@Service
public class OrderService {

    public boolean save(Order order) {
        return true;
    }

    public Order getById(Long orderId) {
        return null;
    }

    public Order getOrder(Long userId) {
        return null;
    }
}
