package com.jonas.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jonas.entity.Order;
import com.jonas.mapper.OrderMapper;
import com.jonas.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * 【 enter the class description 】
 *
 * @author shenjy 2018/12/01
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {
    @Override
    public Order getOrder(Long userId) {
        return baseMapper.getOrder(userId);
    }
}
