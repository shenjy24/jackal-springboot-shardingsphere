package com.jonas.entity;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 【 enter the class description 】
 *
 * @author shenjy 2018/12/01
 */
@Data
@Table(name = "order")
public class Order {

    @Id
    private Long orderId;

    private Long userId;

    private Long ctime;

    private Long utime;
}
