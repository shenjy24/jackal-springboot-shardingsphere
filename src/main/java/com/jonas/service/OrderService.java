package com.jonas.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jonas.entity.Order;

import java.util.List;

/**
 * 【 enter the class description 】
 *
 * @author shenjy 2018/12/01
 */
public interface OrderService extends IService<Order> {
    List<Order> listOrder(Long userId);
}
