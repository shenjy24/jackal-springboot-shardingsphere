package com.jonas.service;

import com.jonas.entity.Order;
import com.jonas.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.transaction.annotation.ShardingSphereTransactionType;
import org.apache.shardingsphere.transaction.core.TransactionType;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * 【 enter the class description 】
 *
 * @author shenjy 2018/12/01
 */
@Slf4j
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

    /**
     * 测试XA事务
     */
    @Transactional(rollbackOn = RuntimeException.class)
    @ShardingSphereTransactionType(TransactionType.XA)
    public void testXaTransaction(long orderId1, long orderId2, int num) {
        Order order1 = new Order()
                .setOrderId(orderId1)
                .setUserId(orderId1)
                .setCtime(System.currentTimeMillis())
                .setUtime(System.currentTimeMillis());
        this.save(order1);
        log.info("保存order1");

        // 控制是否抛出异常
        int i = 10 / num;

        Order order2 = new Order()
                .setOrderId(orderId2)
                .setUserId(orderId2)
                .setCtime(System.currentTimeMillis())
                .setUtime(System.currentTimeMillis());
        this.save(order2);
        log.info("保存order2");
    }
}
