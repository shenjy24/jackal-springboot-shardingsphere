package com.jonas.controller;

import com.jonas.entity.Order;
import com.jonas.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【 enter the class description 】
 *
 * @author shenjy 2018/12/01
 */
@RestController
@RequestMapping("/web")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/getOrder")
    public Order getOrder(Long orderId) {
        return orderService.getById(orderId);
    }

    @PostMapping("/getOrderByUid")
    public Order getOrderByUid(Long userId) {
        return orderService.getOrder(userId);
    }
}
