package com.jonas.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jonas.entity.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 【 enter the class description 】
 *
 * @author shenjy 2018/12/01
 */
public interface OrderMapper extends BaseMapper<Order> {
    List<Order> listOrder(@Param("userId") Long userId);
}
