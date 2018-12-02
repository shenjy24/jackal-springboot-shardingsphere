package com.jonas;

import com.jonas.entity.User;
import com.jonas.service.UserService;
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
    private UserService userService;

    @Test
    public void testSave() {
        User user = new User();
        user.setUserId(2L);
        user.setUserName("Jonas");
        user.setUserAge(20);
        user.setUserStatus(1);
        user.setCtime(System.currentTimeMillis()/1000);
        user.setUtime(System.currentTimeMillis()/1000);

        userService.save(user);
    }

    @Test
    public void testGet() {

    }

    @Test
    public void testGetAll() {

    }
}
