package com.jonas;

import com.jonas.entity.Order;
import com.jonas.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * 【 enter the class description 】
 *
 * @author shenjy 2018/12/01
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ApplicationTest {

    @Autowired
    private OrderService orderService;

    @Test
    public void testSave() {
        Order order = new Order();
        order.setOrderId(1L);
        order.setUserId(1L);
        order.setCtime(System.currentTimeMillis());
        order.setUtime(System.currentTimeMillis());
        orderService.save(order);
    }

    @Test
    public void testGet() {
        Order order = orderService.getById(1L);
        System.out.println("order:" + order);
    }

    @Test
    public void testGetAll() {

    }
}
