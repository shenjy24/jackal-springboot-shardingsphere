package com.jonas.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jonas.entity.Order;
import org.apache.ibatis.annotations.Param;

/**
 * 【 enter the class description 】
 *
 * @author shenjy 2018/12/01
 */
public interface OrderMapper extends BaseMapper<Order> {
    Order getOrder(@Param("userId") Long userId);
}
