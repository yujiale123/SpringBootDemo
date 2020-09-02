package com.yjl.service;

import com.yjl.mapper.UserMapper;
import com.yjl.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author yjl
 * @create 2020-09-01-22:37
 **/
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryById(Integer id) {
//根据id查询
        return userMapper.selectByPrimaryKey(id);
    }

    @Transactional
    public void saveUser(User user) {
        System.out.println("新增用户...");
        userMapper.insertSelective(user);
        //int i = 1/0;
    }
}
