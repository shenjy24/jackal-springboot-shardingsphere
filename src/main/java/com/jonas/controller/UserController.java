package com.jonas.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jonas.entity.User;
import com.jonas.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 【 enter the class description 】
 *
 * @author shenjy 2018/12/02
 */
@RestController
@RequestMapping("/web")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUser")
    public User getUser(Long userId) {
        return userService.getById(userId);
    }

    @RequestMapping("/saveUser")
    public boolean saveUser(Long userId) {
        User user = new User();
        user.setUserId(userId);
        user.setUserName("Tom");
        user.setUserAge(20);
        user.setUserStatus(1);
        user.setCtime(System.currentTimeMillis()/1000);
        user.setUtime(System.currentTimeMillis()/1000);

        return userService.save(user);
    }

    @RequestMapping("/listUser")
    public List<User> listUser() {
        return userService.list(new QueryWrapper<>());
    }
}
