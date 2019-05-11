package com.jonas.controller;

import com.baomidou.mybatisplus.core.toolkit.SystemClock;
import com.jonas.entity.Order;
import com.jonas.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    /**
     * 根据主键获取订单
     *
     * @param orderId
     * @return
     */
    @PostMapping("/getOrder")
    public Order getOrder(Long orderId) {
        return orderService.getById(orderId);
    }

    /**
     * 获取用户订单列表
     *
     * @param userId
     * @return
     */
    @PostMapping("/getOrderByUid")
    public List<Order> getOrderByUid(Long userId) {
        return orderService.listOrder(userId);
    }

    /**
     * 保存用户订单
     *
     * @param userId
     * @return
     */
    @PostMapping("/saveOrder")
    public boolean saveOrder(Long userId) {
        Order order = new Order();
        order.setUserId(userId);
        order.setCtime(SystemClock.now());
        order.setUtime(SystemClock.now());
        return orderService.save(order);
    }
}
