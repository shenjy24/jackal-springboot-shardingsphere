package com.jonas.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 【 enter the class description 】
 *
 * @author shenjy 2018/12/01
 */
@Data
@TableName("order")
public class Order {

    @TableId("order_id")
    private Long orderId;

    @TableField("user_id")
    private Long userId;

    @TableField("ctime")
    private Long ctime;

    @TableField("utime")
    private Long utime;
}
