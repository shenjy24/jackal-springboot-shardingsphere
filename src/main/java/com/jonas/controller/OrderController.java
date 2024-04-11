package com.jonas.controller;

import com.jonas.entity.Order;
import com.jonas.service.OrderService;
import lombok.RequiredArgsConstructor;
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
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/getOrder")
    public Order getOrder(Long orderId) {
        return orderService.getById(orderId);
    }

    @PostMapping("/getOrderByUid")
    public Order getOrderByUid(Long userId) {
        return orderService.getOrder(userId);
    }

    @PostMapping("/saveOrder")
    public Order saveOrder(Long userId) {
        Order order = new Order();
        order.setUserId(userId);
        order.setCtime(System.currentTimeMillis());
        order.setUtime(System.currentTimeMillis());
        return orderService.save(order);
    }
}
