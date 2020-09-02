package com.yjl.service;


import com.yjl.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * @author yjl
 * @create 2020-09-01-23:36
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void queryById() {
       User user=  userService.queryById(8);
        System.out.println("user="+user);
    }
    @Test
    public void saveUser() {
        User user = new User();
        user.setUserName("test");
        user.setName("test");
        user.setPassword("123456");
        user.setSex(1);
        user.setAge(20);
        user.setCreated(new Date());
        userService.saveUser(user);
    }
}
