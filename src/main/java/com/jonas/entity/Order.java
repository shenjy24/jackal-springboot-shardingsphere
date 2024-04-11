package com.jonas.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 【 enter the class description 】
 *
 * @author shenjy 2018/12/01
 */
@Data
@Entity
@Table(name = "t_order")
public class Order {

    @Id
    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "ctime")
    private Long ctime;

    @Column(name = "utime")
    private Long utime;
}
