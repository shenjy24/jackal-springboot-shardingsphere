package com.jonas.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 【 enter the class description 】
 *
 * @author shenjy 2018/12/02
 */
@Data
@TableName("user")
public class User {

    @TableId("user_id")
    private Long userId;

    @TableField("user_name")
    private String userName;

    @TableField("user_age")
    private Integer userAge;

    @TableField("user_status")
    private Integer userStatus;

    @TableField("ctime")
    private Long ctime;

    @TableField("utime")
    private Long utime;
}
