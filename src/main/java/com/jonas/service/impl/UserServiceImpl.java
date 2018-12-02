package com.jonas.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jonas.entity.User;
import com.jonas.mapper.UserMapper;
import com.jonas.service.UserService;
import org.springframework.stereotype.Service;

/**
 * 【 enter the class description 】
 *
 * @author shenjy 2018/12/01
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
